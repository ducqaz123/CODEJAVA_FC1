package BTLec11.Book;

import java.util.ArrayList;

public class BookList {

    private ArrayList<Book> b;

    public BookList() {
        b = new ArrayList<>();
    }

    public BookList(ArrayList<Book> b) {
        this.b = b;
    }

    public ArrayList<Book> getB() {
        return b;
    }

    public void setB(ArrayList<Book> b) {
        this.b = b;
    }

    public void input(Book book) {
        b.add(book);
        System.out.println("Sucsesful !!");
    }

    public boolean updateBookById(String id, String title, double newPrice) {
        for (Book x : b) {
            if (x.getId().equals(id)) {
                x.setBasePrice(newPrice);
                x.setTitle(title);
                return true;
            }
        }
        return false;
    }

    public void deleteBookById(String id) {
        boolean check = false;
        for (int i = 0; i < b.size(); i++) {
            if (b.get(i).getId().equals(id)) {
                b.remove(b.get(i));
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println("delete success !!");
        } else {
            System.out.println("Not found id :((");
        }
    }

    public void findBookById(String id) {
        boolean check = false;
        for (Book x : b) {
            if (x.getId().equals(id)) {
                System.out.println("Find Success !!");
                x.displayDetail();
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("Not found !!");
        }
    }

    public void disPlayAllBook() {
        if (b.size() == 0){
            System.out.println("Empty list");
        } else {
        for (Book x : b) {
            x.displayDetail();
            System.out.println("----------------------------");
        }
       }
    }

    public void findMostExpensivePriceBook() {
        Book a = b.get(0);
        for (Book x : b) {
            if (a.calculatePrice() < x.calculatePrice()) {
                a = x;
            }
        }
        System.out.println("The most expensive book is: ");
        a.displayDetail();
    }

    public void countBook() {
        int countTextBook = 0, countReferenceBook = 0;
        for (Book x : b) {
            if (x instanceof TextBook) {
                countTextBook++;
            } else {
                countReferenceBook++;
            }
        }
        System.out.println("Text Book: " + countTextBook);
        System.out.println("Reference Book: " + countReferenceBook);
    }
}
