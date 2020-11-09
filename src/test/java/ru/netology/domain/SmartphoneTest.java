package ru.netology.domain;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmartphoneTest {
    Smartphone smartphone = new Smartphone(1, "Iphone", 1000, "Apple");


    @Test
    void shouldsearcyByProducer() {
        String search = "Apple";
        assertTrue(smartphone.matches(search));
    }

    @Test
    void shouldsearcyByName() {
        String search = "Iphone";
        assertTrue(smartphone.matches(search));
    }

    @Test
    void shouldsearcyByOtherName() {
        String search = "Samsung";
        assertFalse(smartphone.matches(search));
    }

    @Test
    void shouldsearcyByOtherEmpityProducer() {
        String search = "0";
        assertFalse(smartphone.matches(search));
    }

    @Test
    void shouldsearcyByProducerSmall() {
        String search = "apple";
        assertTrue(smartphone.matches(search));

    }

    @Test
    void shouldsearcyByProducerFalse() {
        String search = "app";
        assertFalse(smartphone.matches(search));
    }
}
