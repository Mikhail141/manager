package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.manager.ProductManager;
import ru.netology.repository.ProductRepository;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;




public class ProductManagerTest {
    private ProductRepository repository = new ProductRepository();
    ProductManager manager = new ProductManager(repository);
    Product f = new Product(1,"f",1);
    Product s = new Product(1,"s",1);




    @Test
    public void shouldsearchName() {
        String search = "f";
        manager.add(f);
        Product[] actual = manager.searcyBy(search);
        Product[] expected = new Product[]{f};
        assertArrayEquals(expected,actual);
}
}



