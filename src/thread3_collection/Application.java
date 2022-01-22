package thread3_collection;

public class Application {
    public static void main(String[] args) {

        InventoryManager inventoryManager = new InventoryManager();
        Thread inventoryTask = new Thread(new Runnable() {
            @Override
            public void run() {
                inventoryManager.populateSoldProduct();
            }
        });

        Thread displayTask = new Thread(new Runnable() {
            @Override
            public void run() {
                inventoryManager.displaySoldProduct();
            }
        });

        inventoryTask.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        displayTask.start();
    }
}
