package exercise2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marcin Sulewski
 */

public class Order{
    
    // VARIABLES
    private String name;
    private List<Item> myCollection;
    
    // CONSTRUCTOR
    public Order(String _name, List lista){
        this.name = _name;
        this.myCollection = lista;
    }
    
    // DISPLAY METHOD
    public String display (){
        String order = "Order name: " + this.getName();
        
        for(int i = 0; i < this.getMyCollection().size(); i++){
            // PRINT ITEMS
            order += ("\n\tItem ID: " + getMyCollection().get(i).getID() +
                    "\n\t\tItem description: " + getMyCollection().get(i).getDescr() +
                    "\n\t\tItem quantity: " + getMyCollection().get(i).getQuantity() +
                    "\n\t\tItem Price: " + getMyCollection().get(i).getPrice());
        }
        
        // RETURN STRING
        return order;
    }
    
    // SUM ORDER METHOD
    public double sum (){
        double sum = 0;
        // ITERATE THROUTH LIST
        for(int i = 0; i < this.getMyCollection().size(); i++){
            // COUNT SUMMARY PRICE
            sum += getMyCollection().get(i).getPrice() * getMyCollection().get(i).getQuantity();
        }
        return sum;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the myCollection
     */
    public List<Item> getMyCollection() {
        return myCollection;
    }

    /**
     * @param myCollection the myCollection to set
     */
    public void setMyCollection(List<Item> myCollection) {
        this.myCollection = myCollection;
    }
}


