import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                int t = 0;
                if(a[i] > a[j]){
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        for(int i = 0; i < n; i++) System.out.print(a[i] + " ");
    }
}
