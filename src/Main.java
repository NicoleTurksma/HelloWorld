// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");
        //Creation of a small pizza
        Pizza pizzaSmall = new Pizza();
        pizzaSmall.size = 's';
        pizzaSmall.price = 7.99F;
        pizzaSmall.slices = 6;
        pizzaSmall.vegetarian = false;
        //creation of medium pizza
        Pizza pizzaMedium = new Pizza();
        pizzaMedium.size = 'm';
        pizzaMedium.price = 10.99F;
        pizzaMedium.slices = 8;
        pizzaMedium.vegetarian = true;
        //creation of large pizza
        Pizza pizzaLarge = new Pizza();
        pizzaLarge.size = 'l';
        pizzaLarge.price = 13.99F;
        pizzaLarge.slices = 10;
        pizzaLarge.vegetarian = false;
        //System.out.printf(String.valueOf(pizzaMedium.size));
        //creation of customer John
        Customer customerJohn = new Customer();
        customerJohn.name = "John Doe";
        customerJohn.phoneNumber = "1234567890";
        //creating pizza array
        Pizza[] pizzaArrayJohnOrder = new Pizza[1];
        pizzaArrayJohnOrder[0] = pizzaSmall;
        //creation order number1
        Order orderNumber1 = new Order();
        orderNumber1.orderId = 1;
        orderNumber1.customer = customerJohn;
        orderNumber1.pizza = pizzaArrayJohnOrder;
        System.out.printf("Pizza Order Details");
        System.out.println();
        String sizeAnswer = "large";
        if (orderNumber1.pizza[0].size == 's') {
            sizeAnswer = "small";
        } else if (orderNumber1.pizza[0].size == 'm') {
            sizeAnswer = "medium";
        }
        System.out.println("Size: "+ String.valueOf(orderNumber1.pizza[0].size));
        System.out.println("Price: $"+ String.valueOf(orderNumber1.pizza[0].price));
        System.out.println("Slices: "+ String.valueOf(orderNumber1.pizza[0].slices));
        String vegetarianAnswer = "no";
        if ((orderNumber1.pizza[0].vegetarian)) {
            vegetarianAnswer = "yes";
        }
        System.out.println("Vegetarian: "+ (vegetarianAnswer));
        System.out.println("Customer Name: "+ (orderNumber1.customer.name));
        System.out.println("Phone Number: "+ (orderNumber1.customer.phoneNumber));
    }
}