package vatlieu;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class CrispyFlour extends Material {

    private int quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public double getAmount() {
        return this.getCost() * this.getQuantity();
    }

    @Override
    public LocalDate getExpiryDate() {
        return this.getManufacturingDate().plusYears(1);
    }

    @Override
    public double getRealMoney() {
        long day = this.getExpiryDate().toEpochDay() - LocalDate.now().toEpochDay();
        if (day < 60 && day > 0) {
            // còn 2 tháng  giảm giá 40%
            return this.getAmount() * 0.3;
        } else if (day < 120 && day > 0) {
            // còn 4 tháng hết hạn giảm 20%
            return this.getAmount() * 0.2;
        } else if (day > 0) {
            // còn lại giảm giá 5%
            return this.getAmount() * 0.05;
        } else
            return 0;
        //day <0 hêt hạn ko lấy tiền

    }

    @Override
    public String toString() {
        return "CrispyFlour{" +
                ", id= '" + getId() +
                ", name= '" + getName() +
                ", manufacturingDate= " + getManufacturingDate()+
                ", cost= " + getCost() +" , "+
                "quantity= " + getQuantity() +
                " } ";
    }
}