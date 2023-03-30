package ex2;

public class Product {
    private int  code ;
    private String productName ;
    private double money1Kg, sale, numberOfProduct;

public Product(){}

    public Product(int code, String productName, double money1Kg, double sale, double numberOfProduct) {
        this.code = code;
        this.productName = productName;
        this.money1Kg = money1Kg;
        this.sale = sale;
        this.numberOfProduct = numberOfProduct;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getMoney1Kg() {
        return money1Kg;
    }

    public void setMoney1Kg(double money1Kg) {
        this.money1Kg = money1Kg;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public double getNumberOfProduct() {
        return numberOfProduct;
    }

    public void setNumberOfProduct(double numberOfProduct) {
        this.numberOfProduct = numberOfProduct;
    }

    // tổng tiền
    public double totalMoney(){
    return this.money1Kg * this.numberOfProduct;
    }

    // nếu hóa đơn trên 100 nghìn thì được giảm giá, còn dưới 100 nghìn ko được giảm giá
    public double moneySale(){
    if(this.totalMoney()>100000){
        return (this.sale/100)*this.totalMoney();
    }else {
        return 0;
    }
    }

    //tiền sau khi giảm giá
    public double moneyAfterSale(){
    return this.totalMoney()-this.moneySale();
    }

}
