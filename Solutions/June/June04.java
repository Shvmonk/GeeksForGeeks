//REVERSING THE EQUATION - JUNE 04
class Solution
{
    String reverseEqn(String S)
    {
        char s[]=S.toCharArray();
        StringBuilder res = new StringBuilder();
        int n = S.length();
        int i = n - 1;
        Stack<Character> st=new Stack<>();
        while (i >= 0)
        {
            if (s[i] == '+' || s[i] == '-' || s[i] == '*' || s[i] == '/')
            {
                while (!st.isEmpty ())
                {
                    res.append(st.pop());
                }
                res.append(s[i]);
            }
            else
                st.push(s[i]);
            i--;
        }
        while (!st.isEmpty ())
        {
            res.append(st.pop());
        }
        
        return res.toString();
    }
}
