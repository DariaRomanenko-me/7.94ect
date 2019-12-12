import java.util.Scanner;

public class Task7_92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int z = 0;
        for( int i = 0; i < a; i++) {
            z += b;
        }
        System.out.println(z);
    }
}