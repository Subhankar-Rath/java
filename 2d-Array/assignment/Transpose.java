package assignment;

public class Transpose {

    public static int[][] arraySwap(int matrix[][]){
        int rows=matrix.length;
        int cols=matrix[0].length;
        int [][] transpose= new int [cols][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                transpose[j][i]=matrix[i][j];
            }
        }

        return transpose;
    }

    public static void printCC(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int matrix[][]={{11,12,13},{21,22,23}};

        int result[][] = arraySwap(matrix);
        printCC(result);
    }
}