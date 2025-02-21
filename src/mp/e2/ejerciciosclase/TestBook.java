package mp.e2.ejerciciosclase;

public class TestBook {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(authors[0]);
        authors[1]= new Author("Paul Tan", "Paul@nowhere.com", 'm');
         // Test Book's toString()
// Test Getters and Setters


// Use an anonymous instance of Author to construct a Book instance
        Book javaDummy = new Book("more Java", authors,19.99, 99);
        System.out.println(javaDummy); // toString
    }
}
