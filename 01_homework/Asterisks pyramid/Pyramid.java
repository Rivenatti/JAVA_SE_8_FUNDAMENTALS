public class Pyramid{

     public static void main(String []args){
        
        int wiersze = 20;
        
        for(int i=1; i<=wiersze; i++){
            System.out.println();
            
           for(int j=i; j<=wiersze-1; j++){
                System.out.print(" ");
            }
                
            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
        }
     }
}