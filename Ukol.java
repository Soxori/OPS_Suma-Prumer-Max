import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import java.io.*;
import java.util.*;

public class Ukol {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> StringList = new ArrayList<>();
        String input = "";
        String output = "C:/Users/jakub/Desktop/OPS/OPS_Ukol/OPS_Suma-Prumer-Max/output.txt";
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

        FileWriter writer = new FileWriter(output);

        writer.write("\nSoucet vsech cisel je: " + suma);
        writer.write("\nPrumer: " + prumer);
        writer.write("\nNejmensi cislo: " + Collections.min(NumberList));
        writer.write("\nNejvetsi cislo: " + Collections.max(NumberList));

        writer.flush();
    }
}