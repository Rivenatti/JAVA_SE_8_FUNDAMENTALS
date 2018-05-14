package exercise1;

import java.util.StringTokenizer;

/*
 * @author Marcin Sulewski
*/

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Result = " + calculate("5*5+2/4-2+9*3"));
    } // END MAIN

    
//----------------------------- METHODS ----------------------------------------    
// CALCULATE METHOD
    public static double calculate (String exp) {
        
        // CHECK STRING FOR MATH OPERATORS
        StringTokenizer expression = new StringTokenizer (exp, "+-*/");
        
        // CHECK STRING FOR NUMBERS
        StringTokenizer symbol = new StringTokenizer(exp, "123456789");

        // DECLARE AND INITIALIZE VARIABLES
        String currSymbol = "";
        // ASSIGN FIRST NUMBER AS CURRENT NUMBER AND ADD TO RESULT
        double currNumber = Double.parseDouble(expression.nextToken());
        double result = currNumber;

        // CHECK IF MATH EXPRESSION HAS MORE NUMBERS
        while(expression.hasMoreTokens()){
            // GET CURRENT MATH OPERATOR
            currSymbol = symbol.nextToken();
            // GET CURRENT NUMBER
            currNumber = Double.parseDouble(expression.nextToken());
            
            // CHECK OPERATION AND DO THE MATH
            if(currSymbol.equals("+")){
                result += currNumber;
            } else if(currSymbol.equals("-")) {
                result -= currNumber;
            } else if(currSymbol.equals("*")) {
                result *= currNumber;
            } else if(currSymbol.equals("/")) {
                result /= currNumber;
            }
        } // END WHILE

        //RETURN RESULT
        return result;
        
    } // END CALCULATE CLASS
    
} // END CLASS