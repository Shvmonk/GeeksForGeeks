# **💡  GeeksForGeeks**
**POTD Solution**

**`FIND NUMBER OF CLOSED ISLANDS - MAY 18`**

```java
//FIND NUMBER OF CLOSED ISLANDS - MAY 18
class Solution
{
    static void dfs(int[][] matrix, boolean[][] visited,
                    int x, int y, int n, int m,
                    boolean[] hasCornerCell)
    {
        if (x < 0 || y < 0 || x >= n || y >= m ||
            visited[x][y] == true || matrix[x][y] == 0)
            return;
     
        if (x == 0 || y == 0 ||
            x == n - 1 || y == m - 1)
        {
            if (matrix[x][y] == 1)
                hasCornerCell[0] = true;
        }
        visited[x][y] = true;
        dfs(matrix, visited, x + 1, y, n, m,
            hasCornerCell);
        dfs(matrix, visited, x, y + 1, n, m,
            hasCornerCell);
        dfs(matrix, visited, x - 1, y, n, m,
            hasCornerCell);
        dfs(matrix, visited, x, y - 1, n, m,
            hasCornerCell);
    }
    public int closedIslands(int[][] matrix, int n, int m)
    {
        boolean[][] visited = new boolean[n][m];
        int result = 0;
        for(int i = 0; i < n; ++i)
        {
            for(int j = 0; j < m; ++j)
            {
                if ((i != 0 && j != 0 &&
                     i != n - 1 && j != m - 1) &&
                     matrix[i][j] == 1 &&
                     visited[i][j] == false)
                {
                    boolean[] hasCornerCell = new boolean[1];
                    hasCornerCell[0] = false;
                    dfs(matrix, visited, i, j, n, m,
                        hasCornerCell);
                    if (!hasCornerCell[0])
                        result = result + 1;
                }
            }
        }
        return result;
    }
}
```
