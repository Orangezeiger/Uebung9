package p2;

public class P2_main {

    public static int[][] grid = {{0,-1,0},{-1,-1,0},{0,0,0}};

    public static void main(String[] args) {
        printGrid();
        initGrid();
        printGrid();
    }

    public static void initGrid() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == 0) {
                    int x = checkNeighbors(i, j);
                    if (x == -2) {
                        System.out.println("Unzulässige Prüfung");
                    } else {
                        grid[i][j] = x;
                    }
                }
            }
        }
    }

    public static int checkNeighbors(int x, int y) {
        int cnt = 0;
        if(x < 0 || x >  grid.length - 1 || y < 0 || y > grid[x].length - 1){
            return -2;
        } else {
            /*if(x > 0 && grid[x - 1][y] == -1) cnt++;
            if(y > 0 && grid[x][y - 1] == -1) cnt++;
            if(x < grid[y].length - 1 && grid[x + 1][y] == -1) cnt++;
            if(y < grid.length - 1 && grid[x][y + 1] == -1) cnt++;
            */

            if(x > 0) {
                if(grid[x - 1][y] == -1) cnt++;
                if (y > 0 && grid[x - 1][y - 1] == -1) cnt++;
            }
            if(y > 0) {
                if(grid[x][y - 1] == -1) cnt++;
                if (x < grid[y].length - 1 && grid[x + 1][y - 1] == -1) cnt++;
            }
            if(x < grid[y].length - 1) {
                if(grid[x + 1][y] == -1) cnt++;
                if (y < grid.length - 1 && grid[x + 1][y + 1] == -1) cnt++;
            }
            if(y < grid.length - 1) {
                if(grid[x][y + 1] == -1) cnt++;
                if (x > 0 && grid[x - 1][y + 1] == -1) cnt++;
            }
        }
        return cnt;
    }

    //Hilfsmethode
    public static void printGrid() {
        System.out.println(" ----------");
        for (int[] row : grid) {
            System.out.print("|");
            for (int col : row) {
                System.out.printf("%3d", col);
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println(" ----------");
        System.out.println();
    }
}
