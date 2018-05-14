package exercise2;

/**
 * @author Marcin Sulewski
 */

public class Item {

    public int ID;
    public String descr;
    public int quantity;
    public double price;
 
    public void display(){
        //System.out.println("Item:\nID = " + this.ID + "\nDescription: " + this.descr + "\nQuantity: " + this.quantity + "\nPrice: " + this.price);
        System.out.println("Sum of order: " + this.quantity * this.price);
    }
    
    public Item () { }
    
    public Item (int _ID, String _descr, int _quantity, double _price){
        this.ID = _ID;
        this.descr = _descr;
        this.quantity = _quantity;
        this.price = _price;
    }
    
}
