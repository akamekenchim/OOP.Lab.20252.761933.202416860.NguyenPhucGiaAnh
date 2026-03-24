package Lab01;
import java.util.*;
public class FirstDegree {
    public static void main(String[] args) {
        Scanner akame = new Scanner(System.in);
        double a;
        double b;
        double x;
        System.out.printf("Nhap a: ");
        a = akame.nextDouble();
        System.out.printf("Nhap b: ");
        b = akame.nextDouble();
        if(a == 0){
            if(b == 0) System.out.println("Vo so nghiem");
            else System.out.println("Vo nghiem");
        }
        else{
            x = -b/a;
            System.out.printf("Nghiem cua phuong trinh la: %.3f", x);
        }
        akame.close();
    }
}
