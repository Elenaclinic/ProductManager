package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductRepositoryTest {
    @Test
    public void testRepositoryDeleteById() {
        ProductRepository repo = new ProductRepository();

        Book book1 = new Book(1, "Война и мир", 1000, "Лев Толстой");
        Book book2 = new Book(2, "Мастер и Маргарита", 2000, "Михаил Булгаков");
        Book book3 = new Book(3, "Властелин колец", 3000, "Джон Толкин");
        Smartphone smartphone1 = new Smartphone(4, "Nokia", 5000, "Finland");
        Smartphone smartphone2 = new Smartphone(5,"Samsung", 6000, "South Korea");

        repo.save(book1);
        repo.save(book2);
        repo.save(book3);
        repo.save(smartphone1);
        repo.save(smartphone2);
        repo.deleteById(3);

        Product[] actual = repo.findAll();
        Product[] expected = {book1, book2, smartphone1, smartphone2};

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void testRepositoryDeleteById1() {
        ProductRepository repo = new ProductRepository();

        Book book1 = new Book(1, "Война и мир", 1000, "Лев Толстой");
        Book book2 = new Book(2, "Мастер и Маргарита", 2000, "Михаил Булгаков");
        Book book3 = new Book(3, "Властелин колец", 3000, "Джон Толкин");
        Smartphone smartphone1 = new Smartphone(4, "Nokia", 5000, "Finland");
        Smartphone smartphone2 = new Smartphone(5,"Samsung", 6000, "South Korea");

        repo.save(book1);
        repo.save(book2);
        repo.save(book3);
        repo.save(smartphone1);
        repo.save(smartphone2);
        repo.deleteById(1);

        Product[] actual = repo.findAll();
        Product[] expected = {book2, book3, smartphone1, smartphone2};

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void testRepositoryDeleteByIdNotExistent() {
        ProductRepository repo = new ProductRepository();

        Book book1 = new Book(1, "Война и мир", 1000, "Лев Толстой");
        Book book2 = new Book(2, "Мастер и Маргарита", 2000, "Михаил Булгаков");
        Book book3 = new Book(3, "Властелин колец", 3000, "Джон Толкин");
        Smartphone smartphone1 = new Smartphone(4, "Nokia", 5000, "Finland");
        Smartphone smartphone2 = new Smartphone(5,"Samsung", 6000, "South Korea");

        repo.save(book1);
        repo.save(book2);
        repo.save(book3);
        repo.save(smartphone1);
        repo.save(smartphone2);


        Assertions.assertThrows(NotFoundException.class, () -> repo.deleteById(6));

    }

    @Test
    public void testRepositoryFindAll() {
        ProductRepository repo = new ProductRepository();

        Book book1 = new Book(1, "Война и мир", 1000, "Лев Толстой");
        Book book2 = new Book(2, "Мастер и Маргарита", 2000, "Михаил Булгаков");
        Book book3 = new Book(3, "Властелин колец", 3000, "Джон Толкин");
        Smartphone smartphone1 = new Smartphone(4, "Nokia", 5000, "Finland");
        Smartphone smartphone2 = new Smartphone(5,"Samsung", 6000, "South Korea");

        repo.save(book1);
        repo.save(book2);
        repo.save(book3);
        repo.save(smartphone1);
        repo.save(smartphone2);



        Product[] actual = repo.findAll();
        Product[] expected = {book1, book2, book3, smartphone1, smartphone2};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testRepositorySave() {
        ProductRepository repo = new ProductRepository();

        Book book1 = new Book(1, "Война и мир", 1000, "Лев Толстой");
        Book book2 = new Book(2, "Мастер и Маргарита", 2000, "Михаил Булгаков");
        Book book3 = new Book(3, "Властелин колец", 3000, "Джон Толкин");
        Smartphone smartphone1 = new Smartphone(4, "Nokia", 5000, "Finland");
        Smartphone smartphone2 = new Smartphone(5,"Samsung", 6000, "South Korea");


        repo.save(book1);
        repo.save(book2);
        repo.save(book3);
        repo.save(smartphone1);
        repo.save(smartphone2);



        Product[] actual = repo.findAll();
        Product[] expected = {book1, book2, book3,smartphone1, smartphone2};

        Assertions.assertArrayEquals(expected, actual);
    }
}