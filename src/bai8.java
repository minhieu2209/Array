import java.util.Scanner;

public class bai8 {
    public static int[][] tich(int a[][], int b[][]) {
        int[][] x = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++){
            for(int j = 0; j < b[0].length; j++){
                for(int l = 0; l < a[0].length; l++){
                    x[i][j] += a[i][l] * b[l][j];
                }
            }
        }
        return x;
    }
    public static void nhap(int a[][], int m, int n){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap m: ");
        int m = in.nextInt();
        System.out.print("Nhap n: ");
        int n = in.nextInt();
        System.out.print("Nhap k: ");
        int k = in.nextInt();
        System.out.println("Nhap ma tran a: ");
        int a[][] = new int[m][n];
        System.out.println("Nhap ma tran b: ");
        int b[][] = new int[n][k];
        nhap(a,m,n);
        nhap(b,n,k);
        int c[][] = tich(a, b);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }
}
