package exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/*
 * @author Marcin Sulewski
 */

public class ShoppingCart {
    public static void main(String[] args) {
       
        String orderDescription = "";
        
        // RANDOM GENERATOR
        Random rand = new Random();
        
        // RANDOM ITEMS
        Item i1 = new Item(1, returnItemName(), returnQuantity(), returnPrice());
        Item i2 = new Item(2, returnItemName(), returnQuantity(), returnPrice());
        Item i3 = new Item(3, returnItemName(), returnQuantity(), returnPrice());
        Item i4 = new Item(4, returnItemName(), returnQuantity(), returnPrice());
        Item i5 = new Item(5, returnItemName(), returnQuantity(), returnPrice());
        
        // CREATE ARRAY LIST AND ADD ITEMS
        ArrayList<Item> list = new ArrayList<Item>();
        list.add(i1);
        list.add(i2);
        list.add(i3);
        list.add(i4);
        list.add(i5);

        // CREATE ORDER ONE
        Order o1 = new Order(returnOrder(), list);
        System.out.println("Order display: ");
        System.out.println(o1.display());
        System.out.printf("Order sum: %.2f\n", o1.sum());
        
        // CLEAR LIST TO CREATE NEW ORDER
        list.clear();
        
        // CREATE ORDER TWO
        System.out.println("");
        // RANDOM ITEMS
        Item i6 = new Item(1, returnItemName(), returnQuantity(), returnPrice());
        Item i7 = new Item(2, returnItemName(), returnQuantity(), returnPrice());
        Item i8 = new Item(3, returnItemName(), returnQuantity(), returnPrice());
        Item i9 = new Item(4, returnItemName(), returnQuantity(), returnPrice());
        Item i10 = new Item(5, returnItemName(), returnQuantity(), returnPrice());
        
        list.add(i6);
        list.add(i7);
        list.add(i8);
        list.add(i9);
        list.add(i10);
        
        Order o2 = new Order(returnOrder(), list);
        System.out.println(o2.display());
        System.out.printf("Order sum: %.2f\n", o2.sum());

        // ITEM DISPLAY CHECK
        System.out.println("--------------------------------");
        System.out.println("Item1 display: ");
        i1.display();
        
        // INTERFACE USE:
        System.out.println("--------------------------------");
        System.out.println("Trousers Color: ");
        Cloth trousers = new Trousers("Red");
        System.out.println(trousers.getColor());
        
    } // END MAIN
    
    
//---------------------------- METHODS -----------------------------------------
// RANDOM ITEM
    public static String returnItemName() {
        // ITEM NAMES LIST
        ArrayList<String> itemNames = new ArrayList<>(Arrays.asList("Shirt",
                "Pants", "Dress", "Jacket", "Shoes", "Gloves"));
        
        Random rand = new Random();
        int num = rand.nextInt(5);
        
        return (itemNames.get(num));
    } 
//------------------------------------------------------------------------------
// RANDOM QUANTITY
    public static int returnQuantity() {
        int quantity;
        
        Random rand = new Random();
        quantity = rand.nextInt(5)+1;
        
        return quantity;
    }
    
//------------------------------------------------------------------------------
// RANDOM PRICE
    public static double returnPrice() {
        double price;
        
        Random rand = new Random();
        price = rand.nextDouble()*50+1;
        
        return price;
    }
//------------------------------------------------------------------------------
// RANDOM ORDER
    public static String returnOrder() {
        int num = 0;
        String orderName = "";
        
        ArrayList<String> orders = new ArrayList<>(Arrays.asList("Order A",
                "Order B", "Order C", "Order D"));
        
        Random rand = new Random();
        num = rand.nextInt(4);
        
        orderName = orders.get(num);
        
        return orderName;
    }
} // END SHOPPING CART CLASS
