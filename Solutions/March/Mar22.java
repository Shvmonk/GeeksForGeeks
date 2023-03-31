class Solution 
{ 
    static long solve(int X,int Y, String S)
	{    
	    long answer=0;
	    String a="pr";
	    String b="rp";
	    if(X<Y)
	    {
	        int t1=X;
	        X=Y;
	        Y=t1;
	        
	        String t2=a;
	        a=b;
	        b=t2;
	    }
	    LinkedList<Character> st= new LinkedList<Character>();
	    for(int i=S.length()-1;i>=0;i--)
	    {
	        if(st.size()>0&&S.charAt(i)==a.charAt(0)&&st.peekLast()==a.charAt(1))
	        {
	            st.pollLast();
	            answer+=X;
	        }
	        else
	        {
	            st.addLast(S.charAt(i));
	        }
	    }
	    StringBuilder str = new StringBuilder();
	    while(st.size()>0){
            str.append(st.pollLast());
        }
        S=str.toString();
        for(int i=S.length()-1;i>=0;i--)
	    {
	        if(st.size()>0&&S.charAt(i)==b.charAt(0)&&st.peekLast()==b.charAt(1))
	        {
	            st.pollLast();
	            answer+=Y;
	        }
	        else
	        {
	            st.addLast(S.charAt(i));
	        }
	    }
        return answer;
	}
} 