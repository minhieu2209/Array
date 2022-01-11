import java.util.Scanner;

public class bai3 {
    public static void sapxep(int a[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int t = 0;
                if (a[i] > a[j]) {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
    }

    public static void dem(int a[], int n) {
        sapxep(a, n);
        int dem[] = new int[n];
        int size = 0, max = 1;
        for (int i = 0; i < dem.length; i++) {
            dem[i] = 1;
        }
        for (int i = 0; i < n - 1; i++) {
            if (a[i] == a[i + 1]) {
                dem[size]++;
            } else {
                System.out.println(a[i] + " " + dem[size]);
                if(dem[size] > max){
                    max = dem[size];
                }
                size++;
            }
        }
        System.out.println(a[n - 1] + " " + dem[size]);
        System.out.println(max);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        dem(a, n);
//        3 3 3 5 5 5 5 5 8 8 8 8 8
//        3 5 8
//        3 5 5
    }
}
