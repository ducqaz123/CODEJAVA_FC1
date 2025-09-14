
package BTLec11.Book;

public class TextBook extends Book {
    private String subject;

    public TextBook(String subject, String id, String title, double basePrice) {
        super(id, title, basePrice);
        this.subject = subject;
    }

    public TextBook() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    @Override
    public void displayDetail() {
        super.displayDetail();
        System.out.println("Subject: "+this.subject);
        System.out.println("Final Price: "+this.calculatePrice());
    }

    
    
    @Override
    public double calculatePrice() {
        return this.getBasePrice()*1.1;
    }
    
}
