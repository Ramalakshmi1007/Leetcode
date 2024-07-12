class Solution {
    public boolean isValid(String s)
     {
       Stack<Character> st=new Stack<Character>();
        for(int i=0;i<s.length();i++)
       {
        if(s.charAt(i)=='(' ||s.charAt(i)=='[' || s.charAt(i)=='{')
          st.push(s.charAt(i));
        else
        {
            char check=s.charAt(i);
            if(!st.isEmpty())
            {
            switch(check)
            {
                case '}':
                  if(st.pop()!='{')
                    return false;
                    break;
                case ']':
                  if(st.pop()!='[')
                    return false;
                    break;
                 case ')':
                  if(st.pop()!='(')
                    return false;
                    break;   
                
            }}
            else
            return false;
        }
       }
       if(!st.isEmpty())
       return false; 
       else
       return true;   
    }
}