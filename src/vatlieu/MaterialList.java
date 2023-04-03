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

    //xoa vat lieu theo id
    public void deleteMaterial(String id) {
      for(Material n:listMaterial){
          if(n.getId().equals(id)){
              listMaterial.remove(n);
              break;
          }
      }
//      for(int i=0;i<listMaterial.size();i++){
//          if(listMaterial.get(i).equals(id)){
//              listMaterial.remove(listMaterial.get(i));
//          }
//      }
    }

    //hàm sửa theo id
    public void edit(String id,Material  list){
        for(int i =0; i<listMaterial.size();i++){
            if(listMaterial.get(i).getId().equals(id)){
                listMaterial.set(i,list);
            }
        }
//        int index =0;
//        for(Material n:listMaterial){
//            if(n.getId().equals(id)){
//                index = listMaterial.indexOf(n);
//                break;
//            }
//        }
//        listMaterial.set(index,list);
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
