import java.util.Scanner;

public class Task7_94 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int z = 1;
        for( int i = 0; i < n; i++) {
            z *= a;
        }
        System.out.println(z);
    }
}