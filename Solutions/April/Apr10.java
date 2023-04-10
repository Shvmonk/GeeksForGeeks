//MAXIMUM INTERSECTING LINES - APRIL 10
class Solution {
    public int maxIntersections(int[][] lines, int N) {
    
        TreeMap<Integer, Integer> lineMap = new TreeMap<>();
        for(int[] line : lines){
            int start = line[0], end = line[1] + 1;
            lineMap.putIfAbsent(start, 0);
            lineMap.putIfAbsent(end, 0);
            lineMap.put(start, lineMap.get(start) + 1);
            lineMap.put(end, lineMap.get(end) - 1);
        }
        int res = 0, cnt = 0;
        for(Map.Entry<Integer, Integer> entry : lineMap.entrySet()){
            cnt += entry.getValue();
            res = Math.max(res, cnt);
        }
        return res;
    }
}
