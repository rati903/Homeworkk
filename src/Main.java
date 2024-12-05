public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("gjjvhjvjv", "Rati Ratiani", 123);
        book1.displayBookInfo();
        Book book2 = new Book("ssfdsfsfdf", "Jumber Tyabladze");
        book2.displayBookInfo();
        Rectangle rect1 = new Rectangle(10.0, 17.0);
        System.out.println("Perimeter: " + rect1.perimeter());
        System.out.println("Area: " + rect1.area());
        System.out.println("Diagonal: " + rect1.diagonal());
        System.out.println("Is Square?: " + rect1.isSquare());
        Rectangle rect2 = new Rectangle(5.0, 5.0);
        System.out.println("Is Square?: " + rect2.isSquare());
        Time time = new Time(24, 59, 59);
        time.displayTime();
    }
}