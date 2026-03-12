package Recursion_Backtracking;

public class wordSearch {

    static boolean dfs(char[][] grid, String word,
                       int i, int j, int index){

        if(index == word.length())
            return true;

        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length)
            return false;

        if(grid[i][j] != word.charAt(index))
            return false;

        char temp = grid[i][j];
        grid[i][j] = '#';

        boolean found =
                dfs(grid,word,i+1,j,index+1) ||
                dfs(grid,word,i-1,j,index+1) ||
                dfs(grid,word,i,j+1,index+1) ||
                dfs(grid,word,i,j-1,index+1);

        grid[i][j] = temp;

        return found;
    }

    public static void main(String[] args){

        char[][] grid = {
                {'C','A','T','S'},
                {'O','R','E','A'},
                {'D','E','A','M'},
                {'E','L','L','S'}
        };

        String word = "DREAM";

        boolean found = false;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){

                if(dfs(grid,word,i,j,0)){
                    found = true;
                }
            }
        }

        System.out.println(found);
    }
}
