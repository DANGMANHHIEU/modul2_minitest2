package ex2;

public class Test {
    //tổng tiền của cả 5 sản phẩm chưa giảm giá
    public static double total1(Product[] arr){
        double total = 0;
        for (int i=0;i< arr.length;i++){
            total+=arr[i].totalMoney();
        }
        return total;
    }
    //tổng tiền của 5 sản phẩm sau khi giảm giá
    public static double total2(Product[] arr){
        double total =0;
        for (int i=0;i< arr.length;i++){
            total+=arr[i].moneyAfterSale();
        }
        return total;
    }
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0]=new Product(1,"Xoài",15000,20,10);
        products[1]=new Product(2,"Mít",20000,30,4.5);
        products[2]=new Product(3,"Dưa hấu",25000,25,6);
        products[3]=new Product(4,"Táo",35000,15,5);
        products[4]=new Product(5,"Ổi",34000,25,6.8);

        //tổng tiền khi chưa khuyến mại của từng sản phẩm
        System.out.println("tổng tiền khi chưa khuyến mại của từng sản phẩm:");
        for(int i =0; i<products.length;i++){
            System.out.println(products[i].getCode()+" "+products[1].getProductName()+" "+products[i].totalMoney());
        }

        //tổng tiền 5 sản phẩm chưa giảm giá
        double bill1;
        bill1=total1(products);
        System.out.println("Tổng tiền 5 sản phẩm chưa khuyến mại: " + bill1);

        System.out.println();

        //hóa đơn trên 100000 được giảm giá
        System.out.println("Chênh lệch tiền khi có khuyến mại của từng sản phẩm:");
        for (int i=0;i<products.length;i++){
            System.out.println(products[i].getCode()+" "+products[i].getProductName()+" "+products[i].moneySale());
        }

        System.out.println();

        //tổng tiền sau khi khuyến mại của các sản phẩm
        System.out.println("Tổng tiền sau khi giảm giá của từng sản phẩm:");
        for (int i=0;i<products.length;i++){
            System.out.println(products[i].getCode()+" "+products[i].getProductName()+" "+products[i].moneyAfterSale());
        }
        //Tổng tiề 5 sản phẩm sau giảm giá
        double bill2;
        bill2 = total2(products);
        System.out.println("Tổng tiền sau khi giảm giá của 5 sản phẩm: "+bill2);
    }
}
