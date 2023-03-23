//REMOVE AND REVERSE - 24 MARCH
class Solution 
{ 
    String removeReverse(String S) 
    { 
        StringBuffer s = new StringBuffer(S);
        int freq[] = new int[26];
        Arrays.fill(freq,0);
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
        }
        int l=0,r=s.length()-1,f=0;
        while(l<=r)
        {
            if(f==0)
            {
                char ch=s.charAt(l);      
                if(freq[ch-'a']==1)
                {
                    l++;
                }
                else{
                    freq[ch-'a']--;
                    s.replace(l,l+1,"#");
                    l++;
                    f^=1;
                }
            }
            else{
                char ch=s.charAt(r);
                if(freq[ch-'a']==1)
                {
                    r--;
                }
                else{
                    freq[ch-'a']--;
                    s.replace(r,r+1,"#");
                    r--;
                    f^=1;
                }
            }
        }
        
        if(f==1)
            s.reverse();
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='#')
                ans+=s.charAt(i);
        }
        return ans;
    }
} 