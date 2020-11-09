package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.manager.ProductManager;
import ru.netology.repository.ProductRepository;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BookTest {
    Product Kruso = new Book(1,"Kruso",1000, "Defo");
    Product Storm = new Book(1,"Storm",1000, "Defo");
    Product book3 = new Book(1,"book3",1000, "Author");
    Product book4 = new Book(1,"book4",1000, "Author");

@Test
public void searchequals(){

    Book book3 = new Book(1,"book3",1000,"Defo");
    Book book4 = new Book(1,"book3",1000,"Defo");


    assertEquals(book3,book4);
}
}
