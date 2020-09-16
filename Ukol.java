import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Ukol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> StringList = new ArrayList<>();
        String input = "";
        int suma = 0;
        int prumer;

        do {
            System.out.println("Zadej Cislo nebo END pro ukonceni");
            input = sc.nextLine();
            StringList
            .add(input);
        } while (!input.equals("END"));

        StringList
        .remove("END");

        List<Integer> NumberList = new ArrayList<Integer>(StringList.size()) ;
        for (String myInt : StringList) {
            NumberList.add(Integer.valueOf(myInt));
        }

        for(int x = 0; x < NumberList.size(); x++) {
            suma += NumberList.get(x);
        }
        
        prumer = suma / NumberList.size();
        System.out.println("Soucet vsech cisel je: " + suma);
        System.out.println("Prumer: " + prumer);
        System.out.println("Nejmensi cislo: " + Collections.min(NumberList));
        System.out.println("Nejvetsi cislo: " + Collections.max(NumberList));
    }
}