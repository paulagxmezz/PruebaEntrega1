package mp.e2.ejerciciosclase;



public class Book {
    private String name;

    private int qty;
    private double price;
    private Author[] authors;



    public Book(String name,Author[] authors, double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = 0;



    }
    public Book(String name, Author[] authors, double price, int qty){
        this.name = name;

        this.authors = authors;
        this.qty = qty;
        this.price = price;

    }
    public String getName(){
        return name;
    }
    public Author[] getAuthors(){
        return authors;

    }
    public int getQty(){
        return qty;

    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public String toString(){
        return "Book[ name = "+ name + ", author = " +  authors.toString() + ", qty = " + qty + ", price = " + price + "]";
    }
    public String getAuthorNames(){

        return authors[0].getName() + ", " + authors[1].getName();
    }


}
