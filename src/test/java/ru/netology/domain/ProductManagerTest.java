package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.manager.ProductManager;
import ru.netology.repository.ProductRepository;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;




public class ProductManagerTest {


    private ProductRepository repository;

    private ProductManager manager;

    Product f = new Product(1,"f",1);
    Product s = new Product(1,"s",1);

    @Test
    public void addBook(){
        ProductManager manager = new ProductManager();

        manager.add(f);
        Product[] actual = manager.getAll(f);
        Product[] expected = new Product[]{f};
        assertArrayEquals(expected, actual);
    }
    }

