//TICKET COUNTER - JUNE 18
class Solution {
    public static int distributeTicket(int N,int K)
    {
        Deque<Integer> dq=new LinkedList<>();
		for(int i=1;i<=N;i++){
            dq.addLast(i);
	    }
	    int ans=0;
	    int turn=0;
	    while(dq.size()>1){
	        if(turn==0){
	            int in=0;
	            while(dq.size()>1 && in<K){
	                ans=dq.pollFirst();
	                in++;
	            }
	        }else{
	            int in=0;
	            while(dq.size()>1 && in<K){
	                ans=dq.pollLast();
	                in++;
	            }
            }
	        turn^=1;
	    }
	    return dq.pollFirst();
    }
}
