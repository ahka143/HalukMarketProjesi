package P05_HalukMarket;

import java.util.List;

public class Methods extends Variables {


    protected static void urunSec(List<String> urunListesi, List<Double> fiyatListesi) {
        System.out.println("*********  HALUK MARKETE HOS GELDINIZ ***********");

        System.out.println("Lutfen almak isteginiz urunu belirtiniz: " + urunListesi);
        int secilenUrun = scan.nextInt();

        System.out.println("Lutfen kac kg almak isteginizi giriniz: ");
        double miktar = scan.nextDouble();

        sepet.add(miktar + " kg " + (urunListesi.get(secilenUrun - 1).replaceAll("\\d", "")) + " ");
        sepetTutari += fiyatListesi.get(secilenUrun - 1) * miktar;
        System.out.println("Su an sepetinizdeki urunler: " + sepet);
        secimYap();


    }

    protected static double paraUstuHesapla() {

        System.out.println("Lutfen hesap bakiyenizi giriniz:");
        musteriBakiye = scan.nextDouble();
        System.out.println("Hesap bakiyeniz : " + musteriBakiye + "$ Odemeniz gereken tutar: " + (float) sepetTutari + " $");
        System.out.println("Para ustunuz: " + (float) (musteriBakiye - sepetTutari) + " $'dir.\nBizi tercih ettiginiz icin tesekkurler. Yine bekleriz.");
        return (musteriBakiye - sepetTutari);
    }

    protected static void secimYap() {
        System.out.println("Baska bir urun almak ister misiniz? E/H");
        String secim = scan.next().substring(0, 1).toUpperCase();

        if (secim.equals("E")) {
            urunSec(urunListesi, fiyatListesi);
        } else if (secim.equals("H")) {
            paraUstuHesapla();

        } else {
            System.out.println("Hatali secim yaptiniz. Lutfen tekrar deneyiniz");
            secimYap();
        }
    }


}
