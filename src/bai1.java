import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int t = 1;
        for (int i = 0; i < n / 2; i++) {
            if (a[i] != a[n - i - 1]) {
                t = 0;
                break;
            }
        }
        if (t == 1) System.out.println("co");
        else System.out.println("khong");
    }
}
