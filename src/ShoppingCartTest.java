import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    @Test
    void panierVideIsGood(){
        ShoppingCart cart = new ShoppingCart();
        assertEquals(0, cart.getItemCount());
    }

    @Test
    void ajoutProduitIsGood(){
        ShoppingCart cart = new ShoppingCart();
        Product p1 = new Product("p1", 10);
        Product p2 = new Product("p2", 11);
        Product p3 = new Product("p3", 12);
        Product p4 = new Product("p4", 13);

        assertDoesNotThrow(()->{
            cart.addProduct(p1);
            cart.addProduct(p2);
            cart.addProduct(p3);
            cart.addProduct(p4);
        });

        assertEquals(4, cart.getItemCount());
    }

    @Test
    void totalPriceIsGood(){
        ShoppingCart cart = new ShoppingCart();
        Product p1 = new Product("p1", 10);
        Product p2 = new Product("p2", 11);
        Product p3 = new Product("p3", 12);
        Product p4 = new Product("p4", 13);

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);
        cart.addProduct(p4);

        assertEquals(46, cart.getTotalPrice());
    }

    @Test
    void casLimites(){
        ShoppingCart cart = new ShoppingCart();

        assertThrows(IllegalArgumentException.class, ()->{
            cart.addProduct(null);
            new Product("p1", -2);
        });
    }

    @Test
    void viderPanierIsGood(){
        ShoppingCart cart = new ShoppingCart();
        Product p1 = new Product("p1", 10);
        Product p2 = new Product("p2", 11);
        Product p3 = new Product("p3", 12);
        Product p4 = new Product("p4", 13);

        assertDoesNotThrow(()->{
            cart.addProduct(p1);
            cart.addProduct(p2);
            cart.addProduct(p3);
            cart.addProduct(p4);
        });

        assertEquals(4, cart.getItemCount());
        cart.clearCart();
        assertEquals(0, cart.getItemCount());
    }



}