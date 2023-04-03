package vatlieu;

import java.lang.module.FindException;
import java.time.LocalDate;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaterialList materialList=new MaterialList();

        Meat meat1 =new Meat("A1","thịt lợn", LocalDate.of(2023,1,1),30,1.5);
        Meat meat2 =new Meat("A2","thịt bò", LocalDate.of(2023,1,2),35,2.5);
        Meat meat3 =new Meat("A3","thịt gà", LocalDate.of(2023,1,2),25,3.5);
        Meat meat4 =new Meat("A4","thịt chó", LocalDate.of(2023,1,2),33,0.5);
        Meat meat5 =new Meat("A5","thịt mèo", LocalDate.of(2023,1,2),36,3.5);

        CrispyFlour crispyFlour1= new CrispyFlour("B1","chiên giòn",LocalDate.of(2023,1,1),10,1);
        CrispyFlour crispyFlour2= new CrispyFlour("B2","chiên xù",LocalDate.of(2023,1,1),8,2);
        CrispyFlour crispyFlour3= new CrispyFlour("B3","bột canh",LocalDate.of(2023,1,1),15,3);
        CrispyFlour crispyFlour4= new CrispyFlour("B4","ngũ vị hương ",LocalDate.of(2023,1,1),12,4);
        CrispyFlour crispyFlour5= new CrispyFlour("B5","bột nêm ",LocalDate.of(2023,1,1),15,5);

        materialList.addMaterial(meat1); materialList.addMaterial(meat2); materialList.addMaterial(meat3);
        materialList.addMaterial(meat4); materialList.addMaterial(meat5);
        materialList.addMaterial(crispyFlour1);  materialList.addMaterial(crispyFlour2);  materialList.addMaterial(crispyFlour3);
        materialList.addMaterial(crispyFlour4);  materialList.addMaterial(crispyFlour5);

        materialList.deleteMaterial("B5");

       Meat meat6 =new Meat("A5","thịt nai", LocalDate.of(2023,1,2),40,3.5);
       materialList.edit("A5",meat6);

        System.out.println("Hiển thị danh sách: ");
        materialList.render();
        System.out.println("Tổng tiền chưa chiết khấu: "+materialList.totalPrice() );
        System.out.println("Tổng tiền chiết khấu: "+materialList.totalDiscount());
        System.out.println("Tổng tiền thanh thanh toán: "+materialList.bill());

    }
}
