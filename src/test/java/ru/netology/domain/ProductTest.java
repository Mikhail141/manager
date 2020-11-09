package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductTest {
    Product product = new Product(1,"Defo",1000);

    @Test
    void shouldsearcyByProducer() {
        Product product = new Product(1,"Defo",1000);
        String search = "Defo";
        assertTrue(product.matches(search));
    }

    @Test
    void shouldsearcyByProducerSmall() {
        Product product = new Product(1,"Defo",1000);
        String search = "defo";
        assertTrue(product.matches(search));
    }

    @Test
    void shouldsearcyByProducerEmpity() {
        Product product = new Product(1,"Defo",1000);
        String search = "0";
        assertFalse(product.matches(search));
    }

    @Test
    void shouldsearcyByOtherProducer() {
        Product product = new Product(1,"Defo",1000);
        String search = "Pushkin";
        assertFalse(product.matches(search));
    }

    @Test
    void shouldsearcyByName() {
        Product product = new Product(1,"Iphone",1000);
        String search = "Iphone";
        assertTrue(product.matches(search));
    }

    @Test
    void shouldsearcyByNameSmall() {
        Product product = new Product(1,"Iphone",1000);
        String search = "iphone";
        assertTrue(product.matches(search));
    }

    @Test
    void shouldsearcyByNameEmpity() {
        Product product = new Product(1,"Iphone",1000);
        String search = "0";
        assertFalse(product.matches(search));
    }

    @Test
    void shouldsearcyByOtherName() {
        Product product = new Product(1,"Defo",1000);
        String search = "Samsung";
        assertFalse(product.matches(search));
    }

}
