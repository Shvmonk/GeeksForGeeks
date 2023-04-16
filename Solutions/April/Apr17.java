//JOB SEQUENCING PROBLEM - APRIL 17
class jobComparator implements Comparator<Job> 
{
    public int compare(Job j1, Job j2){
        if(j1.profit > j2.profit)return -1;
        if(j1.profit < j2.profit)return 1;
        return 0;
    }
}

class Solution
{
    int[] JobScheduling(Job arr[], int n)
    {
        Arrays.sort(arr, new jobComparator());
        

        int res=0, count=0;
        int[] result = new int[n];
        boolean[] slot = new boolean[n];
        Arrays.fill(slot, false);
        
        //iterating through all given jobs.
        for (int i=0; i<n; i++)
        { 
            for (int j= arr[i].deadline-1; j>=0; j--) 
            { 
                if (slot[j]==false)
                { 
			        result[j] = i; 
			        slot[j] = true;
			        break; 
		        } 
	        } 
	    } 
	    for (int i=0; i<n; i++)
	    {
	        if(slot[i]) {
	            count++;
	            res += arr[result[i]].profit;
	        }
	    }
	    int[] ans = new int[2];
	    ans[0] = count;
	    ans[1] = res;
	    return ans;
    }
    
}
