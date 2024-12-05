public class Book {
    String title;
    String author;
    int pageCounter;

    Book(String title, String author, int pageCounter) {
        this.title = title;
        this.author = author;
        this.pageCounter = pageCounter;
    }
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.pageCounter = 0;
    }

    void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Page Counter: " + pageCounter);
    }


}

