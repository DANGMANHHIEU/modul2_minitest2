package book;

import java.util.ArrayList;
import java.util.Arrays;

public class bookList {
    private ArrayList<Book> listBook;
    public bookList(){
        this.listBook=new ArrayList<>();
    }
    public bookList(ArrayList<Book> list){
        this.listBook =list;
    }

    //nhập sách
    public void inputBook(Book book){
        this.listBook.add(book);
    }

    //in sách
    public void outputBook(){
        for(Book bk:listBook){
            System.out.println(bk);
        }
    }

    //tính tổng tiền
    public void totalMoney(){
        double money = 0;
     for (Book bk:listBook){
         money+=bk.getPrice();
     }
         System.out.println(money);
    }

    //đếm số sách có giá nhỏ hơn 100
    public void price100(){
        int count=0;
        for (Book bk : listBook){
            if(bk.getPrice()<100){
                count++;
            }
        }
        System.out.println(count);
    }

    //đếm số sách thể loại viễn tưởng 1
    public void checkCategory(){
        int count =0;
        for (Book bk: listBook){
            if(bk instanceof fictionBook){
                ((fictionBook)bk).getCategory();
                if(((fictionBook) bk).getCategory().equals("Viễn tưởng 1")){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
