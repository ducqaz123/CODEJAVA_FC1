
package BTLec11.Book;

import java.util.Scanner;

public class Prosseror {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookList bookList = new BookList();
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add new TextBook");
            System.out.println("2. Add new ReferenceBook");
            System.out.println("3. Update book by id");
            System.out.println("4. Delete book by id");
            System.out.println("5. Find book by id");
            System.out.println("6. Display all books");
            System.out.println("7. Find the most expensive book");
            System.out.println("8. Count textbooks and referencebooks");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Base Price: ");
                    double price = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter Subject: ");
                    String subject = sc.nextLine();
                    Book tb = new TextBook(subject,id,title,price);
                    bookList.input(tb);
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    String id2 = sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title2 = sc.nextLine();
                    System.out.print("Enter Base Price: ");
                    double price2 = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter Publisher: ");
                    String publisher = sc.nextLine();
                    Book pf = new ReferenceBook(publisher,id2, title2, price2);
                    bookList.input(pf);
                    break;

                case 3:
                    System.out.print("Enter ID to update: ");
                    String newId = sc.nextLine();
                    System.out.print("Enter New Title: ");
                    String newTitle = sc.nextLine();
                    System.out.print("Enter New Base Price: ");
                    double newPrice = sc.nextDouble();
                    sc.nextLine();
                    if (bookList.updateBookById(newId, newTitle, newPrice))
                        System.out.println("Updated successfully!");
                    else
                        System.out.println("Book not found!");
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    String deleteId = sc.nextLine();
                    bookList.deleteBookById(deleteId);
                    break;
                case 5:
                    System.out.print("Enter ID to find: ");
                    String findId = sc.nextLine();
                    bookList.findBookById(findId);
                    break;

                case 6:
                    bookList.disPlayAllBook();
                    break;

                case 7:
                    bookList.findMostExpensivePriceBook();
                    break;

                case 8:
                    bookList.countBook();
                    break;
            }

        } while (choice != 0);
    }
}

