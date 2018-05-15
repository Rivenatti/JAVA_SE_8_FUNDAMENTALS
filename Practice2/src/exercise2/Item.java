package exercise2;

/**
 * @author Marcin Sulewski
 */

public class Item {

    // VARIABLES
    private int ID;
    private String descr;
    private int quantity;
    private double price;
 
    // DISPLAY METHOD
    public void display(){
        System.out.println("ID = " + this.ID + "\nDescription: " + this.descr + "\nQuantity: " + this.quantity + "\nPrice each: " + this.price);
    }
    
    // DEFAULT CONSTRUCTOR
    public Item () { }
    
    // MULTIPARAMETER CONSTUCTOR
    public Item (int _ID, String _descr, int _quantity, double _price){
        this.ID = _ID;
        this.descr = _descr;
        this.quantity = _quantity;
        this.price = _price;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the descr
     */
    public String getDescr() {
        return descr;
    }

    /**
     * @param descr the descr to set
     */
    public void setDescr(String descr) {
        this.descr = descr;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
}
