package ex1;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Trapezoid[] trapezoids = new Trapezoid[2];
        trapezoids[0]=new Trapezoid(1.2,2.3,3.4,4.5,5.6);
        trapezoids[1]=new Trapezoid(1,2,3,4,5);
        // mảng trapezoids
        System.out.println("trapezoids:");
        for(int i =0; i<trapezoids.length;i++){
            System.out.println("Diện tích: "+trapezoids[i].getArea()+ " Chu vi: "+trapezoids[i].getPerimeter());
        }
        System.out.println();
        // sắp xếp mảng theo diện tích và chu vi từ bé đến lớn
        System.out.println("sắp xếp diện tích và chu vi từ bé đến lớn:");
        Arrays.sort(trapezoids);
        for(int i =0; i<trapezoids.length;i++){
            System.out.println("Diện tích: "+trapezoids[i].getArea()+ " Chu vi: "+trapezoids[i].getPerimeter());
        }
        System.out.println();
        //in diện tích và chu vi lớn hơn
        System.out.println("Diện tích và chu vi lớn nhất:");
        System.out.println("Diện tích: "+trapezoids[1].getArea()+" Chu vi lớn: "+trapezoids[1].getPerimeter());
    }
}
