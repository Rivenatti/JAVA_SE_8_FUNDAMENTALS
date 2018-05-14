package szkolenie;

/**
 * @author rivenatti
 */

public class Shirt extends Item{
    private char size;
    private char colorCode;
    
    public Shirt (double _price, char _size, char _colorCode) {
        super("Shirt", _price);
        this.size = _size;
        this.colorCode = _colorCode;
    }

    public void displayItem(){
//        System.out.println("Item description: " + getDescription() + "\nItem quantity: " + getQuantity() + "\nItem price: " + getPrice() 
//                + "\nItem Color: " + this.colorCode);

        super.displayItem();
        System.out.println("\nSize: " + size + "\nColor: " + colorCode);
    }
    
    // GET COLOR METHOD
    public String getColor (char cc){
        String color = "";
        switch(cc){
            case 'r': color = "red"; break;
            case 'b': color = "blue"; break;
            case 'g': color = "green"; break;
            default: System.out.println("Color not supported");
        }
        
        return color;
    }
}
