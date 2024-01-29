import java.util.ArrayList;
import java.util.List;

class Menu {

    private List<MenuItem> items;

    public Menu() {
        this.items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        this.items.add(item);
    }

    public List<MenuItem> getItems() {
        return this.items;
    }
}

class Restaurant {

    private Menu menu;

    public Restaurant() {
        this.menu = new Menu();
    }

    public Menu getMenu() {
        return this.menu;
    }
}

class IndianRestaurant extends Restaurant {

}

class ChineseRestaurant extends Restaurant {

}

class ItalianRestaurant extends Restaurant {

}

class Waiter {

    private Restaurant restaurant;

    public Waiter(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void giveMenuToCustomer(Menu menu) {
        System.out.println("The waiter gave the menu to the customer.");
    }

    public void takeOrder(Menu menu) {
        System.out.println("The waiter took the order from the customer.");
    }

    public Bill generateBill(Menu menu) {
        Bill bill = new Bill();
        bill.setMenu(menu);
        return bill;
    }
}

class Bill {

    private Menu menu;
    private double totalPrice;

    public Bill() {
        this.totalPrice = 0;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
        this.totalPrice = 0;
        for (MenuItem item : menu.getItems()) {
            this.totalPrice += item.getPrice();
        }
    }

    public void printBill() {
        System.out.println("The bill is: " + this.totalPrice);
    }
}

class MenuItem {

    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}

public class RestaurantChain {

    public static void main(String[] args) {
        // Create a restaurant chain.
        RestaurantChain restaurantChain = new RestaurantChain();

        // Create an Indian restaurant.
        IndianRestaurant indianRestaurant = new IndianRestaurant();
        indianRestaurant.getMenu().addItem(new MenuItem("paneer Tikka Masala", 15.00));
        indianRestaurant.getMenu().addItem(new MenuItem("Naan", 2.50));

        // Create a Chinese restaurant.
        ChineseRestaurant chineseRestaurant = new ChineseRestaurant();
        chineseRestaurant.getMenu().addItem(new MenuItem("paneer chilli", 12.00));
        chineseRestaurant.getMenu().addItem(new MenuItem("Fried Rice", 5.00));

        // Create an Italian restaurant.
        ItalianRestaurant italianRestaurant = new ItalianRestaurant();
        italianRestaurant.getMenu().addItem(new MenuItem("Spaghetti", 10.00));
        italianRestaurant.getMenu().addItem(new MenuItem("Pizza", 8.00));

        // Create a waiter.
        Waiter waiter = new Waiter(indianRestaurant);

        // Give the menu to the customer.
        waiter.giveMenuToCustomer(indianRestaurant.getMenu());

        // Take the order from the customer.
        waiter.takeOrder(indianRestaurant.getMenu());

        // Generate the bill.
        Bill bill = waiter.generateBill(indianRestaurant.getMenu());

        // Print the bill.
        bill.printBill();
    }
}
