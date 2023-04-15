//FIND TOTAL TIME TAKEN - APRIL 15
class Solution
{
    public static long totalTime(int n,int arr[],int time[])
    {
      int total_time = 0;
        Set<Integer> prev_index = new HashSet<>();
        for(int i = 0; i < n; i++) {
            int curr_time = 1;
            if(prev_index.contains(arr[i])) {
                curr_time = time[arr[i]-1];
            } else {
                prev_index.add(arr[i]);
            }
            total_time += curr_time;
        }
        return total_time-1;
    }
}
