
package BTLec11.Book;

public class ReferenceBook extends Book {
    private String publisher;

    public ReferenceBook(String publisher, String id, String title, double basePrice) {
        super(id, title, basePrice);
        this.publisher = publisher;
    }    

    public ReferenceBook() {
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public void displayDetail() {
        super.displayDetail();
        System.out.println("Publisher: "+this.getPublisher());
        System.out.println("Final Price: "+this.calculatePrice());
    }
    
    @Override
    public double calculatePrice() {
       return this.getBasePrice()*1.2;
    }
    
}
