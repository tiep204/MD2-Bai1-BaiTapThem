import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("hay nhap so Điện mà bạn tiêu thụ tháng này:");
        int soDien = sc.nextInt();
        int theBao = 10000;

        if(soDien<=50){
            System.out.println("so tien mà bạn phải trả tháng này là:"+(theBao+soDien*700));
        }else if(soDien<=100){
            System.out.println("so tien mà bạn phải trả là:"+(50*700+(soDien-50)*900+theBao));
        }else if (soDien<=150){
            System.out.println("so tien ma ban phai trả là: "+(50*700+(soDien-50)*900+(soDien-100)*1100+theBao));
        }else {
            System.out.println("so tien ma ban phai trả là:"+((50*700)+(soDien-150)*900+(soDien-150)*1100+(soDien-150)*1300+theBao));
        }

    }
}