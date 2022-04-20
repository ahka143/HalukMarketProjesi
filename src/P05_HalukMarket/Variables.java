package P05_HalukMarket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Variables {
    public static Scanner scan = new Scanner(System.in);
    protected static double sepetTutari;
    protected static double musteriBakiye;
    protected static List<String> sepet = new ArrayList<>();
    protected static List<String> urunListesi = new ArrayList<>(Arrays.asList("Domates 1", "Patates 2", "Biber 3", "Sogan 4", "Havuc 5",
            "Elma 6", "Muz 7", "Cilek 8", "Kavun 9", "Uzum 10", "Limon 11"));
    protected static List<Double> fiyatListesi = new ArrayList<Double>(Arrays.asList(2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50));

}
