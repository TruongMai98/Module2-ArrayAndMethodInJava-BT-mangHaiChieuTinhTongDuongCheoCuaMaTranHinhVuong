import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap gia tri");
        int rowCol = scanner.nextInt();
        int[][] twoArr = new int[rowCol][rowCol];
        for (int i = 0; i < rowCol; i++) {
            for (int j = 0; j < rowCol; j++) {
                twoArr[i][j] = (int) (Math.random() * 11);
                System.out.print(twoArr[i][j] + " ");
            }
            System.out.println("\n");
        }
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < rowCol; i++) {
            for (int j = 0; j < rowCol; j++) {
                if (i == j) {
                    sum1 += twoArr[i][j];
                }
                if (i + j == (rowCol - 1)) {
                    sum2 += twoArr[i][j];
                }
            }
        }
        int total = sum1 + sum2;
        System.out.println("tong 2 duong chao la: " + total);
    }
}