class Solution {
    public int evalRPN(String[] tokens) {
Stack<Integer> stack= new Stack<>();
        for(String token: tokens){
          
            if(token.equals("-") || 
            token.equals("+") || 
            token.equals("*")||
            token.equals("/")){
                int a= stack.pop();
                int b=stack.pop();
               int result=0; 
               switch(token){

                case "+" :
                    result=a+b;
                    break;
                case "-" :
                    result=b-a;
                    break;

                case "*" :
                    result=a*b;
                    break;
                case "/" :
                    result=b/a;
                    break;
               }
               stack.push(result);
            }
           
           else { stack.push(Integer.parseInt(token));}
        }
        
        return stack.pop();
        
    }
}
