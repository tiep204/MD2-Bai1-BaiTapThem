
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        Scanner sc = new Scanner(System.in);
//        float a, b, c;

        System.out.println("hay nhap canh a vao ay: ");
        int a = Integer.parseInt(sc.nextLine());

        System.out.println("hay nhap canh b vao day please:");
        int b = Integer.parseInt(sc.nextLine());

        System.out.println("hay nhap canh c vao day: ");
        int c = Integer.parseInt(sc.nextLine());

        if ((a + b) > c || (a + c) > b || (c + b) > a) {
            System.out.println("Tam giác này là tam giác thường");
        } else if ((a == b) || (a == c) || (b == c)) {
            System.out.println("Tam giác này là tam giác cân");
        } else if ((Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) ||
                (Math.pow(b,2)==Math.pow(a,2)+Math.pow(c,2)) ||
                (Math.pow(c,2)==Math.pow(a,2)+Math.pow(b,2))) {
            System.out.println("Tam giác này là tam giác vuông: ");
        } else if ((a == b)||(b==c)) {
            System.out.println("Tam giác này là tam giác đều");
        } else{
            System.out.println("day la tam giac vuong can: ");
        }
    }
}