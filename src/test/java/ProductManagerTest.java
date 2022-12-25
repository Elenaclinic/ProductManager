import org.example.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {

    @Test
    public void testAdd() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        Book book1 = new Book(1, "Война и мир", 1000 , "Лев Толстой");
        Book book2 = new Book(2, "Мастер и Маргарита", 2000 , "Михаил Булгаков");
        Book book3 = new Book(3, "Властелин колец", 3000 , "Джон Толкин");
        Smartphone smartphone1 = new Smartphone(4, "Nokia", 5000, "Finland");
        Smartphone smartphone2 = new Smartphone(5,"Samsung", 6000, "South Korea");


        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);
        manager.add(smartphone2);

        Product[] actual = repo.findAll();
        Product[] expected = {book1, book2, book3,smartphone1,smartphone2};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSearchBy() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);
        Book book1 = new Book(1, "Война и мир", 1000 , "Лев Толстой");
        Book book2 = new Book(2, "Мастер и Маргарита", 2000 , "Михаил Булгаков");
        Book book3 = new Book(3, "Властелин колец", 3000 , "Джон Толкин");
        Smartphone smartphone1 = new Smartphone(4, "Nokia", 5000, "Finland");
        Smartphone smartphone2 = new Smartphone(5,"Samsung", 6000, "South Korea");

        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);
        manager.add(smartphone2);

        Product[] actual = manager.searchBy("Война");
        Product[] expected = {book1};

        Assertions.assertArrayEquals(expected, actual);
    }



}
