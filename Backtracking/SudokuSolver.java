//Leetcode - 37. Sudoku Solver

// Write a program to solve a Sudoku puzzle by filling the empty cells.

// A sudoku solution must satisfy all of the following rules:

// Each of the digits 1-9 must occur exactly once in each row.
// Each of the digits 1-9 must occur exactly once in each column.
// Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
// The '.' character indicates empty cells.

// Solution - 
public class SudokuSolver {
    static int check=0;
    static boolean isValid(char[][] board, int row, int col,char num){
        // row
        for(int j=0;j<9;j++){
            if(board[row][j]==num) return false;
        }
        // col
        for(int i=0;i<9;i++){
            if(board[i][col]==num) return false;
        }
        // 3*3 mat
        int srow = row/3*3;
        int scol = col/3*3;
        for(int i=srow;i<srow+3;i++){
            for(int j=scol;j<scol+3;j++){
                if(board[i][j]==num) return false;
            }
        }
        return true;
    }
    static void helper(char[][] board, int row, int col){
        if(row==9){
            check = 1;
            return;
        }
        if(board[row][col]!='.'){
            if(col!=8) helper(board,row,col+1);
            else helper(board,row+1,0);
        }
        else{
        for(char k='1';k<='9';k++){
            if(isValid(board,row,col,k)){
                board[row][col]=k;
                if(col!=8) helper(board,row,col+1);
                else helper(board,row+1,0);
                if(check==1) return;
                board[row][col]='.';
            }
        }
        }
    }
    static void solveSudoku(char[][] board) {
        helper(board,0,0);
        check = 0;
    }

    // Example -
    public static void main(String[] args){
        System.out.println("hello");
        char board[][] = {{'5','3','.','.','7','.','.','.','.'},
                          {'6','.','.','1','9','5','.','.','.'},
                          {'.','9','8','.','.','.','.','6','.'},
                          {'8','.','.','.','6','.','.','.','3'},
                          {'4','.','.','8','.','3','.','.','1'},
                          {'7','.','.','.','2','.','.','.','6'},
                          {'.','6','.','.','.','.','2','8','.'},
                          {'.','.','.','4','1','9','.','.','5'},
                          {'.','.','.','.','8','.','.','7','9'}};

        solveSudoku(board);

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}