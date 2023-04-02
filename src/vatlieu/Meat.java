package vatlieu;

import java.time.LocalDate;

public class Meat extends  Material{
    private double weight;
    public Meat(){}

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return this.getCost()*this.getWeight();
    }

    // hạn sử dụng
    @Override
    public LocalDate getExpiryDate() {
        return this.getManufacturingDate().plusDays(7);
    }

    //tính tiền giảm giá
    @Override
    public double getRealMoney() {
        long day = this.getExpiryDate().toEpochDay()-LocalDate.now().toEpochDay();
        if(day<5 && day>0){
            // còn 5 ngày giảm giá 30%
            return this.getAmount()*0.3;
        }
        else if(day>0){
            // còn lại giảm giá 10%
            return this.getAmount()*0.1;
        }else
            //day <0 hêt hạn ko lấy tiền
            return 0;
    }

    @Override
    public String toString() {
        return "Meat{" +
                " id= " + getId() +
                ", name= " + getName() +
                ", manufacturingDate= " + getManufacturingDate() +
                ", cost= " + getCost() +
                ", weight= " + getWeight() +
                "} " ;
    }
}
