//MINIMUM STEPS REQUIRED - APRIL 04
class Solution{
	int minSteps(String str) {
		int cnt=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(i-1)){
                cnt++;
            }
        }
        return cnt/2 + 1;
	}

}