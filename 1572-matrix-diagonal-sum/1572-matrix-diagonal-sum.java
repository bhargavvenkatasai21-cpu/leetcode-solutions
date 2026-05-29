class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int rowln=mat.length;
        int colln=mat[0].length;
        for(int i=0; i<mat.length; i++){
            // if(mat[i][i]==mat[i][colln-i-1])
            sum += mat[i][i];

            // else
             sum+=mat[i][colln-i-1];
             
        }

        if(rowln%2!=0){
                sum-=mat[rowln/2][rowln/2];
             }
        return sum; 
    }
}