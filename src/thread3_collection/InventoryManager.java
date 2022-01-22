package thread3_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {

    List<Product> soldProduct = new CopyOnWriteArrayList<>();
    List<Product> purchaseProduct = new ArrayList<>();

    Vector vector = new Vector();

    public void populateSoldProduct(){
        for (int i = 0; i<1000; i++){
            Product product = new Product(i, "test_product_"+ i);
            soldProduct.add(product);
            System.out.println("Added: "+ product);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void displaySoldProduct(){
        for ( Product product: soldProduct) {
            System.out.println("Printed Sold : "+ product);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
