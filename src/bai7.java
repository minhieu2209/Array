import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int[] b = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            b[i] = 1;
            for (int j = i; j < n - 1; j++) {
                if (a[j] <= a[j + 1]) {
                    b[i]++;
                }
                if (a[j] > a[j + 1]) {
                    break;
                }
            }
            if (b[i] > max) {
                max = b[i];
            }
       //     System.out.print(b[i] +" ");
        }

        System.out.println("Đường chạy dài nhất có độ dài: "+ max);
        for (int i = 0; i < n; i++) {
            if (max == b[i]) {
                 System.out.println("Tại vị trí: "+ (i));
            }
       //     System.out.print(b[i] +" ");
        }
    }
}
