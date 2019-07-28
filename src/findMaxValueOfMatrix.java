import java.util.Scanner;

public class findMaxValueOfMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double matrix[][] = new double[3][3];
        System.out.println("Bat Dau Nhap mang 2 chieu!");
        for (int i = 0; i < matrix.length;i++){
            for (int j = 0; j<matrix[i].length;j++){
                System.out.print("matrix["+i+"]["+j+"]= ");
                matrix[i][j] = scanner.nextDouble();
            }
        }
        double max = matrix[0][0];
        String position = "("+0+","+0+")";
        for(int i = 0; i<matrix.length;i++){
            for(int j = 1; j<matrix[i].length;j++){
                if(max<matrix[i][j]){
                    max = matrix[i][j];
                    position = "("+i+","+j+")";
                }
            }
        }
        System.out.println("phan tu nam o vi tri: "+position+" co gia tri "+ max+" la lon nhat");
    }
}
