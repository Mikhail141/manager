package ru.netology.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {
    Book book = new Book(1, "Kruso", 1000, "Defo");

    @Test
    void shouldsearcyByName() {
        String search = "Kruso";
        assertTrue(book.matches(search));
    }

    @Test
    void shouldsearcyByNameSmall() {
        String search = "kruso";
        boolean expected = true;
        boolean actual = book.matches(search);
        assertEquals(expected, actual);

    }

    @Test
    void shouldsearcyByNameFolse() {
        String search = "kru";
        boolean expected = false;
        boolean actual = book.matches(search);
        assertEquals(expected, actual);
    }

    @Test
    void shouldsearcyByAuthor() {
        String search = "Defo";
        assertTrue(book.matches(search));
    }

    @Test
    void shouldsearcyByAuthorEmpity() {
        String search = "0";
        boolean expected = false;
        boolean actual = book.matches(search);
        assertEquals(expected, actual);

    }

    @Test
    void shouldsearcyByOtherAuthor() {
        String search = "Pushkin";
        assertFalse(book.matches(search));
    }
}
