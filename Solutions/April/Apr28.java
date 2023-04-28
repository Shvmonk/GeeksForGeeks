//GEEK'S VILLAGE AND WELL - APRIL 28
class Solution
{
    public int[][] chefAndWells(int n,int m,char c[][])
    {
        int ans[][]=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(ans[i],Integer.MAX_VALUE);
        }

        boolean v[][]=new boolean[n][m];
        Queue<pair> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(c[i][j]=='W'){
                    v[i][j]=true;
                    ans[i][j]=0;
                    q.add(new pair(i,j,0));
                }
            }
        }

        int dx[]={0,0,-1,1};
        int dy[]={-1,1,0,0};

        while(!q.isEmpty()){
            pair p=q.poll();
            for(int i=0;i<4;i++){
                int nx=p.a+dx[i],ny=p.b+dy[i];
                if(nx>=0 && nx<n && ny>=0 && ny<m && !v[nx][ny] && c[nx][ny]!='N'){
                    q.add(new pair(nx,ny,p.c+1));
                    v[nx][ny]=true;
                    ans[nx][ny]=p.c+1;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(c[i][j]=='.'){
                    ans[i][j]=0;
                }else if(c[i][j]=='N'){
                    ans[i][j]=0;
                }else if(ans[i][j]==Integer.MAX_VALUE){
                    ans[i][j]=-1;
                }else{
                    ans[i][j]*=2;
                }
            }
        }

        return ans;
    }
    public class pair
    {
        int a,b,c;
        public pair(int a,int b,int c)
        {
            this.a=a;
            this.b=b;
            this.c=c;
        }
    }
}
