package Module2.Excercise6;

public class Books {
    int bookId;
    String bookName;
    String authorName;
    String price;
    public Books(int bookId, String bookName, String authorName, String price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.price = price;
    }
    public String toString() {
        return "Books [bookId=" + bookId + ", bookName=" + bookName + ", authorName=" + authorName + ", price=" + price + "]";
    }
    
}
