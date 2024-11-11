//5. Класс "Книга" и "Библиотека"
//Создайте класс Book с полями title, author, и year. Создайте класс Library,
// который содержит коллекцию книг и методы для добавления книг, поиска по автору и году публикации.
import org.w3c.dom.ls.LSOutput;

import java.util.List;
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Война и мир", "Лев Толстой", 1869));
        library.addBook(new Book("Преступление и наказание", "Федор Достоевский", 1866));
        library.addBook(new Book("1984", "Джордж Оруэлл", 1949));
        library.addBook(new Book("Анна Каренина", "Лев Толстой", 1877));

        System.out.println("Все книги в библиотеке:");
        library.displayAllBooks();

        System.out.println("\nКниги Льва Толстого:");
        List<Book> tolstoyBooks = library.findBooksByAuthor("Лев Толстой");
        for (Book book : tolstoyBooks) {
            System.out.println(book);
        }

        System.out.println("\nКниги, опубликованные в 1866 году:");
        List<Book> books1866 = library.findBooksByYear(1866);
        for (Book book : books1866) {
            System.out.println(book);
        }
    }
}