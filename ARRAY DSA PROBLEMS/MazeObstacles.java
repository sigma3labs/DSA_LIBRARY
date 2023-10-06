public class MazeObstacles {
    public static void main(String[] args) {
        boolean[][] maze = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };
        printPath("", maze, 0, 0);
    }
    static void printPath(String p, boolean[][] maze, int r, int c){
       if(r==maze.length-1 && c==maze[0].length-1){
        System.out.println(p);
        return;
       }
       if(maze[r][c]==false){
        return;
       }
       if(r<maze.length-1){
        printPath(p+'D', maze, r+1, c);
       }
       if(c<maze[0].length-1){
        printPath(p+'R', maze, r, c+1);
       }
    }
}
