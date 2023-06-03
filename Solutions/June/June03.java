//FIND MAXIMUM EQUAL SUM OF THREE STACKS - JUNE 03
class Solution {
    public static int maxEqualSum(int N1,int N2,int N3, int[] S1, int[] S2, int[] S3) {
        int sum1=Arrays.stream(S1).sum();
        int sum2=Arrays.stream(S2).sum();
        int sum3=Arrays.stream(S3).sum();
        int top1=0,top2=0,top3=0;
        while(true){
            if(top1==N1 || top2==N2 || top3==N3){
                return 0;
            }
            if(sum1==sum2 && sum2==sum3){
                return sum1;
            }
            if(sum1>=sum2 && sum1>=sum3){
                sum1-=S1[top1++];
            }
            else if(sum2>=sum1 && sum2>=sum3){
                sum2-=S2[top2++];
            }
            else if(sum3>=sum1 && sum3>=sum2){
                sum3-=S3[top3++];
            }
        }
    }
}
