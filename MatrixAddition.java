public class MatrixAddition {
    public static void main(String[] args){
        int[][] matrix1={{1,2},{3,4}};
        int[][] matrix2={{5,6},{7,8}};
        int[][] sumMatrix=new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                sumMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        System.out.println("Sum of the two matrices:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println(sumMatrix[i][j]+"");
            }
        System.out.println();
        }
    }
}
