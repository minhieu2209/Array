import java.util.Scanner;

public class bai12 {
    public static void nhap(int a[][], int n){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = in.nextInt();
        int[][] a = new int[n][n];
        nhap(a, n);
        int[][] res = new int[n][n];
        for(int i = n - 1; i >= 0; i--){
            for (int j = 0; j < n; j++){
                res[n - i - 1][j] = a[j][i];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
