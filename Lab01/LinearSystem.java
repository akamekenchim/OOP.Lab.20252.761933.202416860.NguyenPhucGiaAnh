package Lab01;
import java.util.*;
//2.26
public class LinearSystem {
    public static void main(String[] args) {
        Scanner akame = new Scanner(System.in);
        double a11, a12, b1; //cac he so
        double a21, a22, b2; //cac he so
        double x = 0; //x1
        double y = 0; //x2
        System.out.println("Nhap a11, a12, b1 cho phuong trinh 1: ");
        a11 = akame.nextDouble();
        a12 = akame.nextDouble();
        b1 = akame.nextDouble();

        System.out.println("Nhap a21, a22, b2 cho phuong trinh 2: ");
        a21 = akame.nextDouble();
        a22 = akame.nextDouble();
        b2 = akame.nextDouble();

        double nhan = a21/a11;
        a11 = a11*nhan;
        a12 = a12*nhan;
        b1 = b1*nhan;

        a21 = a21 - a11;
        a22 = a22 - a12;
        b2 = b2 - b1;
        if(a22 == 0){
            if(b2 == 0) System.out.println("Vo so nghiem");
            else System.out.println("Vo nghiem");
        }
        else{
            y = b2/a22;
            x = (b1 - a12*y)/a11;
            System.out.printf("x = %.2f --- y = %.2f", x, y);
        }
        
        akame.close();
    }
}

