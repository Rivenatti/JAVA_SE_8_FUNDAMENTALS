package szkolenie;

public class Item {
    public int ID;
    public String descr;
    public int quantity;
    public double price;
    public char color;
    
    public boolean setColor(char col){
        if(col == ' ') return false;
        else{
            this.color = col;
            return true;
        }
    }
    
    public void setItemFields(String _descr, int _quantity, double _price){
        this.descr = _descr;
        this.quantity = _quantity;
        this.price = _price;
    }
    
    public int setItemFields(String _descr, int _quantity, double _price, char _color){
        
        if(_color == ' '){
            return -1;
        }else{
            this.color = _color;
            this.descr = _descr;
            this.quantity = _quantity;
            this.price = _price;
            
            return 1;
        }
    }
    
    public void displayItem(){
        System.out.println("Item available...\nItem description: " + this.descr + "\nItem quantity: " + this.quantity + "\nItem price: " + this.price 
                + "\nItem Color: " + this.color);
    }
    
}
