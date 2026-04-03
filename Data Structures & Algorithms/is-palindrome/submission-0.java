class Solution {
    public boolean isPalindrome(String s) {
        String x= "";
        String y="";
         for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            // keep only letters and digits
            if (Character.isLetterOrDigit(c)) {
                x = x + Character.toLowerCase(c);
            }
        }
         for (int i = 0; i <= s.length() - 1; i++) {
            char t = s.charAt(i);

            // keep only letters and digits
            if (Character.isLetterOrDigit(t)) {
                y = y + Character.toLowerCase(t);
            }
        }
        System.out.println("print" + x);
        System.out.println("print" + y);
        if(y.equals(x)){
            return true;
        }
        return false;
    }
}
