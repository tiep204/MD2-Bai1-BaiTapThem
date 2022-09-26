import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("please nhap chieu dai a vao day please:");
        int chieuDai = sc.nextInt();
        System.out.println("please nhap nhieu rong b vao day:");
        int chieuRong = sc.nextInt();
        int dienTich = chieuDai * chieuRong;
        System.out.println("dien tich hinh chu nhat la: "+dienTich);
        int chuVi = (chieuDai+chieuRong)*2;
        System.out.println("chu vi hinh chu nhat la: " + chuVi);

    }
}