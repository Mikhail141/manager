package ru.netology.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.manager.ProductManager;
import ru.netology.repository.ProductRepository;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class ProductManagerTest {
    private ProductRepository repository = new ProductRepository();

    ProductManager manager = new ProductManager(repository);

    Product Kruso = new Book(1,"Kruso",1000, "Defo");
    Product Storm = new Book(1,"Storm",1000, "Defo");
    Product book3 = new Book(1,"book3",1000, "Author");
    Product book4 = new Book(1,"book4",1000, "Author");

    Product Iphone = new Smartphone(1,"Iphone",1000, "Apple");
    Product Ipod = new Smartphone(1,"Ipod",1000, "Apple");
    Product smartphone3 = new Smartphone(1,"smartphone3",1000, "producer");
    Product smartphone4 = new Smartphone(1,"smartphone4",1000, "producer");

    @Test
    public void shouldSearchByName() {
        String search = "Kruso";
        manager.add(Kruso);
        Product[] actual = manager.searcyBy(search);
        Product[] expected = new Product[]{Kruso};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldsearchAuthor() {
        String search = "Defo";
        manager.add(Kruso);
        Product[] actual = manager.searcyBy(search);
        Product[] expected = new Product[]{Kruso};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldSearchByAuthorDefo() {
        String text = "Kruso";
        manager.add(Kruso);
        Product[] actual = manager.searcyBy(text);
        Product[] expected = new Product[]{Kruso};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldsearchProducer() {
        String search = "Apple";
        manager.add(Iphone);
        Product[] actual = manager.searcyBy(search);
        Product[] expected = new Product[]{Iphone};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldsearchNameSmartphone() {
        String search = "Ipod";
        manager.add(Ipod);
        Product[] actual = manager.searcyBy(search);
        Product[] expected = new Product[]{Ipod};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldsearchName() {
        String text = "Iphone";
        manager.add(Iphone);
        Product[] actual = manager.searcyBy(text);
        Product[] expected = new Product[]{Iphone};
        assertArrayEquals(expected, actual);
    }

}



