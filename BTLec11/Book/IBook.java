
package BTLec11.Book;


public interface IBook {
    public void add(Book book);
    public boolean updateBookById(String id);
    public void displayDetail();
    public double calculatePrice();
}
