import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Bee2520 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int n = s.nextInt();
            int m = s.nextInt();
            int grid[][] = new int [n][m];
            int start[] = new int [2];
            int goal[] = new int [2];

            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    grid[i][j]=s.nextInt();
                    if(grid[i][j]==1){
                        start[0]=i;
                        start[1]=j;
                    }
                    if(grid[i][j]==2){
                        goal[0]=i;
                        goal[1]=j;
                    }
                }
            }

            int distance = shortestPath(grid, start, goal);
            System.out.println(distance);
        }
        s.close();
    }

    static int shortestPath(int[][] grid, int[] start, int[] goal) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dirs = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        queue.offer(new int[]{start[0], start[1], 0});
        int[][] dist = new int[m][n];
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        dist[start[0]][start[1]] = 0;
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            if (curr[0] == goal[0] && curr[1] == goal[1]) {
                return dist[curr[0]][curr[1]];
            }
            for (int[] dir : dirs) {
                int x = curr[0] + dir[0];
                int y = curr[1] + dir[1];
                if (x >= 0 && x < m && y >= 0 && y < n && grid[x][y] != 1) {
                    int newDist = dist[curr[0]][curr[1]] + 1;
                    if (newDist < dist[x][y]) {
                        dist[x][y] = newDist;
                        queue.offer(new int[]{x, y, newDist});
                    }
                }
            }
        }
        return -1;
    }
}