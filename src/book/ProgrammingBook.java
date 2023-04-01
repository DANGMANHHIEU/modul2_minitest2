package book;

public class ProgrammingBook extends Book{
    private String language;
    private String frameWork;
    public ProgrammingBook(){}

    public ProgrammingBook(int bookCode, String bookName, double price, String author, String language, String frameWork) {
        super(bookCode, bookName, price, author);
        this.language = language;
        this.frameWork = frameWork;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFrameWork() {
        return frameWork;
    }

    public void setFrameWork(String frameWork) {
        this.frameWork = frameWork;
    }

    @Override
    public String toString() {
        return "ProgrammingBook{"+" Mã sách: "+getBookCode()+"/" +"Tên sách: "+getBookName()+"/"+" Giá tiền: "+getPrice()+"/"+" Tác giả: "+getAuthor()+"/"+
                "Ngôn ngữ: " + getLanguage() + "/" +
                ", frameWork: " + getFrameWork() + "/" +
                "} " ;
    }
}
