import java.util.Scanner;

public class bai10 {
    public static void nhap(int a[][], int n){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }
    }
    public static int[][] xoay90nguoc(int a[][], int n){
        int [][] res = new int[n][n];
        for(int i = n - 1; i >= 0; i--){
            for (int j = 0; j < n; j++){
                res[n - i - 1][j] = a[j][i];
            }
        }
        return res;
    }
    public static int cheochinh(int a[][], int n){
        int res = 0;
        int i = 0, j = 0;
        while(i < n && j < n){
            res += a[i][j];
            i++;
            j++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = in.nextInt();
        int[][] a = new int[n][n];
        nhap(a, n);
        int[][] b = xoay90nguoc(a, n);
        System.out.println(cheochinh(a, n));
    }
}
