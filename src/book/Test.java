package book;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bookList List = new bookList();
        int choice = 0;
        do {
            System.out.println("Vui lòng chọn chức năng:");
            System.out.println(
                    "1.Thêm cuốn sách lớp ProgrammingBook.\n"
                   +"2.Thêm cuốn sách lớp FictionBook \n"
                   +"3.In danh sách\n"
                   +"4.Tính tổng tiền.\n"
                   +"5.Đếm số sách có giá nhỏ hơn 100.\n"
                   +"6.Đếm số sách Fiction có category là .”Viễn tưởng 1”\n"
                   +"0.Exit");
            System.out.println();
            choice=sc.nextInt();

            if(choice==1){
                System.out.println("sách lớp ProgrammingBook:");
                System.out.println("Mã sách: "); int bookCode = sc.nextInt();sc.nextLine();
                System.out.println("Tên sách: "); String bookName = sc.nextLine();
                System.out.println("Giá tiền: "); double price = sc.nextDouble();sc.nextLine();
                System.out.println("Tác giả: "); String author = sc.nextLine();
                System.out.println("Ngôn ngữ: ");String language=sc.nextLine();
                System.out.println("Frame Work: ");String frameWork=sc.nextLine();
                ProgrammingBook programmingBook = new ProgrammingBook(bookCode,bookName,price,author,language,frameWork);
                List.inputBook(programmingBook);
            } else if (choice==2) {
                System.out.println("sách lớp FictionBook: ");
                System.out.println("Mã sách: "); int bookCode = sc.nextInt();sc.nextLine();
                System.out.println("Tên sách: "); String bookName = sc.nextLine();
                System.out.println("Giá tiền: "); double price = sc.nextDouble();sc.nextLine();
                System.out.println("Tác giả: "); String author = sc.nextLine();
                System.out.println(" Thể loại: ");String category =sc.nextLine();
                fictionBook fictionBook =new fictionBook(bookCode,bookName,price,author,category);
                List.inputBook(fictionBook);
            } else if (choice==3) {
                System.out.println("Danh sách: ");
                List.outputBook();
                System.out.println();
            } else if (choice==4) {
                System.out.println("Tổng tiền: ");
                List.totalMoney();
                System.out.println();
            } else if (choice==5) {
                System.out.println("Số sách có giá tiền nhỏ hơn 100 là: ");
                List.price100();
                System.out.println();
            } else if (choice==6) {
                System.out.println("Đếm số sách thể loại viễn tưởng 1:");
                List.checkCategory();
                System.out.println();
            }
        }while(choice!=0);
    }
}
