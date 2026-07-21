import java.util.Scanner;

public class AP{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int d = a[1] - a[0];
        boolean ap = true;

        for (int i = 2; i < n; i++) {
            if (a[i] - a[i - 1] != d) {
                ap = false;
                break;
            }
        }

        System.out.println(ap ? "AP" : "Not AP");
    }
} 
    

