//FIND K-TH SMALLEST ELEMENT IN GIVEN N RANGES- MAY 19
class Solution {
    public static ArrayList<Integer> kthSmallestNum(int n, int[][] range, int q, int[] queries) {
        ArrayList<pair> A=new ArrayList<>();
        for(int i=0;i<range.length;i++){
            A.add(new pair(range[i][0],range[i][1]));
        }
        Collections.sort(A,new myComp());
        ArrayList<pair> merged=mergeIntervals(A);
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i = 0 ; i < queries.length; i++){
            int res = find_kth(merged, queries[i]);
            ans.add(res);
        }
        return ans;
    }
    
    public static int find_kth(ArrayList<pair> merged, int k){
        int n = merged.size();
        int to_return=-1;
        for (int j = 0; j < n; j++)
        {
            if (k <= Math.abs(merged.get(j).b -merged.get(j).a + 1)){
                to_return = (merged.get(j).a + k - 1);
                break;
            }
 
            k = k - Math.abs(merged.get(j).b - merged.get(j).a + 1);
        }
        return to_return;
    }
    
	public static class pair
    {
    	int a;
    	int b;
    	public pair(int a,int b)
    	{
    	    this.a=a;
    	    this.b=b;
    	}
    }
    public static class myComp implements Comparator<pair>
    {
    	public int compare(pair p1,pair p2)
    	{
    	    if(p1.a==p2.a)
    	    return 0;
    	    else if(p1.a<p2.a)
    	    return -1;
    	    else
    	    return 1;
    	}
    }
    public static ArrayList<pair> mergeIntervals(ArrayList<pair> arr)
	{
	    ArrayList<pair> a1=new ArrayList<>();
	    if(arr.size()<=1)
	    return arr;
	    a1.add(arr.get(0));
	    int i=1,j=0;
	    while(i<arr.size())
	    {
	        if(a1.get(j).b<arr.get(i).a)
	        {
	           a1.add(arr.get(i));
	           i++;
	           j++;
	        }
	        else if(a1.get(j).b>arr.get(i).a && a1.get(j).b>=arr.get(i).b)
	        {
	            i++;
	        }
	        else if(a1.get(j).b>=arr.get(i).a)
	        {
	            int a=a1.get(j).a;
	            int b=arr.get(i).b;
	            a1.remove(j);
	            a1.add(new pair(a,b));
	            i++;
	        }
	    }
	    return a1;
	}
}
