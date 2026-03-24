package Lab01;
import java.util.*;
public class SecondDegree {
    public static void main(String[] args) {
        Scanner akame = new Scanner(System.in);
        double a, b, c;
        double x1;
        double x2;
        System.out.printf("Nhap a: ");
        a = akame.nextDouble();
        System.out.printf("Nhap b: ");
        b = akame.nextDouble();
        System.out.printf("Nhap c: ");
        c = akame.nextDouble();
        
        double delta = b*b - 4*a*c;
        if(delta < 0) System.out.println("Vo nghiem");
        else if(delta == 0){
            x1 = -b/(2*a);
            System.out.printf("Co 1 nghiem kep: %.3f", x1);
        }
        else{
            x1 = (-b + Math.sqrt(delta))/(2*a);
            x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.printf("Co 2 nghiem: %.3f va %.3f", x1, x2);
        }
        akame.close();
    }
}
