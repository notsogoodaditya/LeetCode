class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<n/2;i++){
            change(matrix,i,i,n-i-1,n-i-1);
        }
    }
    public void change(int[][] mat,int x1,int y1,int x2,int y2){
        int[] temp = {mat[x1][y1],mat[x1][y2],mat[x2][y1],mat[x2][y2]};
        mat[x1][y1] = temp[2];
        mat[x1][y2] = temp[0];
        mat[x2][y1] = temp[3];
        mat[x2][y2] = temp[1];
        int r = y1+1;
        for(int i=y1+1;i<y2;i++){
            swap(mat,x1,i,r,y2);
            r++;
        }
        int c = y2-1;
        for(int i=y1+1;i<y2;i++){
            swap(mat,x1,i,x2,c);
            c--;
        }
        r = x2-1;
        for(int i=y1+1;i<y2;i++){
            swap(mat,x1,i,r,y1);
            r--;
        }
    }
    public void swap(int mat[][],int x1,int y1,int x2,int y2){
        int x = mat[x1][y1];
        mat[x1][y1] = mat[x2][y2];
        mat[x2][y2] = x;
        
    }
}