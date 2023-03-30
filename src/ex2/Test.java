package ex2;

public class Test {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0]=new Product(1,"Xoài",15000,20,10);
        products[1]=new Product(2,"Mít",20000,30,4.5);
        products[2]=new Product(3,"Dưa hấu",25000,25,6);
        products[3]=new Product(4,"Táo",35000,15,5);
        products[4]=new Product(5,"Ổi",34000,25,6.8);

        //tổng tiền khi chưa khuyến mại
        System.out.println("tổng tiền khi chưa khuyến mại:");
        for(int i =0; i<products.length;i++){
            System.out.println(products[i].getCode()+" "+products[1].getProductName()+" "+products[i].totalMoney());
        }

        //hóa đơn trên 100000 được giảm giá
        System.out.println("Chênh lệch của các hóa đơn khi có khuyến mại:");
        for (int i=0;i<products.length;i++){
            System.out.println(products[i].getCode()+" "+products[i].getProductName()+" "+products[i].moneySale());
        }


        //tổng tiền sau khi khuyến mại của các sản phẩm
        System.out.println("Tổng tiền sau khi giảm giá của từng sản phẩm:");
        for (int i=0;i<products.length;i++){
            System.out.println(products[i].getCode()+" "+products[i].getProductName()+" "+products[i].moneyAfterSale()+"\n");
        }
    }
}
