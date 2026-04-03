class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        System.out.println(s1.length());

        // Step 1: frequency of s1
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++; // first window
           
        }

        // Step 2: check first window
        if (matches(freq1, freq2)) return true;


        // Step 3: sliding window
        for (int i = s1.length(); i < s2.length(); i++) {

            // add new character
            freq2[s2.charAt(i) - 'a']++;

            // remove old character
            freq2[s2.charAt(i - s1.length()) - 'a']--;
            
             
                               

            // compare
            if (matches(freq1, freq2)) return true;
        }

        return false;
    }

    // helper function to compare arrays
    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}