package szkolenie;

public class Item {
    private int ID;
    private String descr;
    private int quantity;
    private double price;
    private char color;
    
    
    // Description get and set
    public void setDescription(String desc){
        System.out.println("Enter item description: ");
        this.descr = desc;
    }
    
    public String getDescription(){
        return this.descr;
    }
    
    // Quantity get and set
    public void setQuantity(int quant){
        System.out.println("Enter item quantity: ");
        this.quantity = quant;
    }
    
    public int getQuantity(){
        return this.quantity;
    }
    
    // Price get and set
    public void setPrice(double pri){
        System.out.println("Enter item price: ");
        this.price = pri;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    // Color get and set
    public void setColor(char col){
        System.out.println("Enter item color character: ");
        this.color = col;
    }
    
    public char getColor(){
        return this.color;
    }
    
    // Item constructor
    public Item(String _descr, int _quantity, double _price, char _color){
        this.color = _color;
            this.descr = _descr;
            this.quantity = _quantity;
            this.price = _price;
    }
    
    // Display item properties
    public void displayItem(){
        System.out.println("Item description: " + this.descr + "\nItem quantity: " + this.quantity + "\nItem price: " + this.price 
                + "\nItem Color: " + this.color);
    }
    
}
