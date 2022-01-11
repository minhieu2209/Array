import com.sun.javaws.IconUtil;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("nhap n: ");
        int n = in.nextInt();
        System.out.printf("nhap mang a: ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.print("nhap m: ");
        int m = in.nextInt();
        System.out.printf("nhap mang b: ");
        int b[] = new int[n];
        for (int i = 0; i < m; i++) {
            b[i] = in.nextInt();
        }
        System.out.print("nhap p: ");
        int p = in.nextInt();
        for (int i = 0; i < p; i++)
            System.out.printf(a[i] + " ");
        for (int i = 0; i < m; i++)
            System.out.print(b[i] + " ");
        for (int i = n - p - 2; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
