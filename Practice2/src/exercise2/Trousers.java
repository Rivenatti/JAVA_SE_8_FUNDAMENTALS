package exercise2;
/**
 * @author Marcin Sulewski
 */
public class Trousers extends Item implements Cloth{

    private String color;
    
    // CONSTUCTOR
    public Trousers (String col) {
        this.color = col;
    }

    
    // GET COLOR OVERRIDE
    @Override
    public String getColor() {
        return this.color;
    }
    
    
}
