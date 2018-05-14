package loops;

public class Loops {

    public static void main(String[] args) {

    int i;

System.out.println("----- SPOSOB 1 -------");

        String tablica[] = {"Apple", "Banana", "Pear", "Orange"};

        for (String fruit : tablica){
            System.out.println(fruit);
        }

System.out.println("----- SPOSOB 2 -------");

        for(i=1; i<=10; i++){
            System.out.println("Autodestrukcja nastapi za: " + i);
        }

System.out.println("----- SPOSOB 3 -------");

        // Sposob 3
        i = 1;
        while(i<=10) {
            System.out.println("Autodestrukcja nastapi za: " + i);
            i++;
        }

System.out.println("----- SPOSOB 4 -------");

        i=1;
        do{
            System.out.println("Autodestrukcja nastapi za: " + i);
            i++;
        }while (i<=10);


System.out.println("----- SPOSOB 5 -------");
//        System.out.println(rekurencja(10));
        Zapetlenie z = new Zapetlenie();
        int wynik = z.rekurencja(10);
        System.out.println("Suma ciagu 10 liczb: " + wynik);

    } // END OF MAIN


//----------------------------- METHODS ----------------------
// REKURENCJA
        public int rekurencja(int n){
            int suma = 0;
            if(n>0){
                return n + rekurencja(n-1);
            }else{
                return 0;
            }
        }

}
