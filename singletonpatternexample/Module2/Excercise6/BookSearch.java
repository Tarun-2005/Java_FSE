package Module2.Excercise6;
import java.util.Arrays;
import java.util.Comparator;

public class BookSearch {
    public static Books linearSearchByTitle(Books[] books, String title) {
        for (Books book : books) {
            if (book.bookName.equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
    public static Books binarySearchByTitle(Books[] books, String title) {
        int left = 0, right = books.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = title.compareToIgnoreCase(books[mid].bookName);
            if (cmp == 0)
                return books[mid];
            else if (cmp < 0)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return null;
    }
    public static void sortBooksByTitle(Books[] books) {
        Arrays.sort(books,Comparator.comparing(b -> b.bookName.toLowerCase()));
    }
}