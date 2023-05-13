//BIT MAGIC - MAY 13
class Solution {
    public static int bitMagic(int n, int[] arr) {
        int c=0;
        for(int i=0;i<n/2;i++){
            if(arr[i]!=arr[n-i-1]){
                c++;
            }
        }
        return (c+1)/2;
    }
}
