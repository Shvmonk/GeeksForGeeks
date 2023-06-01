//TOPOLOGICAL SORT - JUNE 01
class Solution
{
    static int[] topoSort(int N, ArrayList<ArrayList<Integer>> list) 
    {
        boolean visited[] = new boolean[N];
        Arrays.fill(visited, false);
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < N; i++) 
        {
            if (!visited[i]) 
                topo(list, i, visited,st);
        }
        int A[] = new int[st.size()];
        int i = -1;
        while (!st.isEmpty()) 
        {
            A[++i] = st.peek(); 
            st.pop();
        }
        return A;
    }
    
    static void topo(ArrayList<ArrayList<Integer>> list, int it,
                     boolean visited[], Stack<Integer> s)
    {
        visited[it] = true; 
        for (int i=0; i<list.get(it).size();i++) 
        {
            if (!visited[list.get(it).get(i)]) 
                topo(list, list.get(it).get(i), visited, s);
        }
        s.push(it); 
    }
}
