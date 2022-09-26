import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("please nhap cạnh A vao day");
        int A = sc.nextInt();
        int chuVi = A*4;
        System.out.println("chu vi hinh vuong la: " + chuVi);
        int dienTich = A*A;
        System.out.println("dien tich cua hinh vuong la: "+ dienTich);
    }
}