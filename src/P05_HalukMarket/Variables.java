package P05_HalukMarket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Variables {
    public static Scanner scan = new Scanner(System.in);

    public static double sepetTutari;
    public static double musteriBakiye;
    public static List<String> sepet = new ArrayList<>();
    private  List<String> urunListesi = new ArrayList<>(Arrays.asList("Domates", "Patates", "Biber", "Sogan", "Havuc",
            "Elma", "Muz", "Cilek", "Kavun", "Uzum", "Limon"));
    private  List<Double> fiyatListesi = new ArrayList<Double>(Arrays.asList(2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50));



    public List<String> getUrunListesi() {
        return urunListesi;
    }

    public void setUrunListesi(List<String> urunListesi) {
        this.urunListesi = urunListesi;
    }

    public List<Double> getFiyatListesi() {
        return fiyatListesi;
    }

    public void setFiyatListesi(List<Double> fiyatListesi) {
        this.fiyatListesi = fiyatListesi;
    }
}
