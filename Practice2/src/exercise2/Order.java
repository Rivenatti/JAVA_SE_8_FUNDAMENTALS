package exercise2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rivenatti
 */

public class Order{
    public String name;
    public List<Item> myCollection;
    
    public Order(String _name, List lista){
        this.name = _name;
        this.myCollection = lista;
    }
    
    public void display (){
        System.out.println("Order name: " + this.name);
        double sum = 0;
        
        for(int i = 0; i < this.myCollection.size(); i++){
            // PRINT ITEMS
            System.out.println("Item ID: " + myCollection.get(i).ID +
                    "\tItem description: " + myCollection.get(i).descr +
                    "\t\tItem quantity: " + myCollection.get(i).quantity +
                    "\tItem Price: " + myCollection.get(i).price);
            
            // COUNT SUMMARY PRICE
            sum += myCollection.get(i).price * myCollection.get(i).quantity;
        }
        System.out.printf("Sum: %.2f\n", sum);
    }
}


