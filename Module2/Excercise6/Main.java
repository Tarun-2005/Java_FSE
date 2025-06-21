package Module2.Excercise6;

public class Main {
    public static void main(String[] args) {
        Books[] books = {
            new Books(1, "Java Programming", "James", "200"),
            new Books(2, "Data Structures", "Robert", "400"),
            new Books(3, "Algorithms", "CLRS", "200"),
            new Books(4, "Operating Systems", "Galvin", "750")
        };
        System.out.println("Linear Search:");
        Books result1 = BookSearch.linearSearchByTitle(books, "Algorithms");
        if (result1 != null) {
            System.out.println("Found: " + result1);
        } else {
            System.out.println("Book not found.");
        }

        BookSearch.sortBooksByTitle(books);

        System.out.println("Binary Search:");
        Books result2 = BookSearch.binarySearchByTitle(books, "Algorithms");
        if (result2 != null) {
            System.out.println("Found: " + result2);
        } else {
            System.out.println("Book not found.");
        }
    }
}
