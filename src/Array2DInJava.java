package src;

public class Array2DInJava
{
    public static void main(String[] args) {
        int [] [] matrix = {
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };
        System.out.println("The index of elements [2] [1]: " +matrix[2][1]);
        System.out.println("The index of elements [2] [0]: " +matrix[2][0]);
        System.out.println("The index of elements [1] [2]: " +matrix[1][2]);
        System.out.println("The length of matrix:" +matrix.length);

        System.out.println("The elements of 2D Array are: ");

        for(int i= 0;i<matrix.length;i++)
        {
            for(int j= 0;j<matrix[i].length;j++)
            {
                System.out.print(matrix[i][j] +"__");
            }
            System.out.println();
        }
    }
}
