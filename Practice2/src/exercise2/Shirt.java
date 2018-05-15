package exercise2;
/**
 * @author Marcin Sulewski
 */
public class Shirt extends Item{
    private char size;
    private char colorCode;
    
    public Shirt(double _price, int _size, char _colorCode){
        
    }

    /**
     * @return the size
     */
    public char getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(char size) {
        this.size = size;
    }

    /**
     * @return the colorCode
     */
    public char getColorCode() {
        return colorCode;
    }

    /**
     * @param colorCode the colorCode to set
     */
    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }
}
