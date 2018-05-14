public class Homework{

     public static void main(String []args){
        
        int rows = 10;
        int number = 1;
        int count = 0;
        
        for(int i=1; i<=rows; i++){
            System.out.println();
            
           for(int j=i; j<=rows-1; j++){
                System.out.print("  ");
            }
                
            for(int k=1; k<=i; k++){
                System.out.print(number + "  ");
                number++;
                count += number;
                
            }
            System.out.print("         Row count: " + (count-i));
            
            count = 0;
             
            
        }
     }
}