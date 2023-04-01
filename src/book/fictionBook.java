package book;

public class fictionBook extends Book{
    private  String category;
    public fictionBook(){}

    public fictionBook(int bookCode, String bookName, double price, String author, String category) {
        super(bookCode, bookName, price, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    @Override
    public String toString() {
        return "fictionBook{"+" Mã sách: "+getBookCode()+"/" +"Tên sách: "+getBookName()+'/'+" Giá tiền: "+getPrice()+"/"+" Tác giả: "+getAuthor()+"/"+
                " Thể loại: " + getCategory() +
                "} " ;
    }
}
