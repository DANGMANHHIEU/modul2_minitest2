package vatlieu;

import java.util.ArrayList;

public class MaterialList {
    private ArrayList<Material> listMaterial;
    public MaterialList(){
        this.listMaterial = new ArrayList<>();
    }

    public MaterialList(ArrayList<Material> list) {
        this.listMaterial = list;
    }

    //add vat lieu
    public void addMaterial(Material list){
        this.listMaterial.add(list);
    }

    //xoa vat lieu
    public boolean deleteMaterial(Material list) {
        return this.listMaterial.remove(list);
    }

    // hiển thị danh sách
    public void render(){
        for(Material n: listMaterial){
            System.out.println(n);
        }
    }

    // tính tiền chưa giảm giá
    public double totalPrice(){
        double total =0;
        for(Material n: listMaterial){
            total += n.getAmount();
        }
        return total;
    }
    //tính chiết khấu chênh lệch
    public double totalDiscount(){
        double total =0;
        for (Material n:listMaterial){
            total += n.getRealMoney();
        }
        return total;
    }
    //tính tiền
    public double bill(){
        return this.totalPrice() - this.totalDiscount();
    }
}
