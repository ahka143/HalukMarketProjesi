package P05_HalukMarket;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;

public class Methods extends Variables implements ZorunluMethodlar{
    public static Map<Integer,Variables> urunListesiMap = new HashMap<>();

    public void urunSec() {
        System.out.println("  \t\t*********  HALUK MARKETE HOS GELDINIZ ***********");
        System.out.println("\t\t\t\t\tNo \t   Ürün \t\t  Fiyat\n" +
                "\t\t\t\t   ====\t =======\t \t=========\n" +
                "\t\t\t\t\t00\t Domates   \t \t 2.10 TL\n" +
                "\t\t\t\t\t01\t Patates   \t \t 3.20 TL\n" +
                "\t\t\t\t\t02\t Biber     \t \t 1.50 TL\n" +
                "\t\t\t\t\t03\t Soğan      \t 2.30 TL\n" +
                "\t\t\t\t\t04\t Havuç     \t   \t 3.10 TL\n" +
                "\t\t\t\t\t05\t Elma      \t   \t 1.20 TL\n" +
                "\t\t\t\t\t06\t Muz     \t \t 1.90 TL\n" +
                "\t\t\t\t\t07\t Çilek \t \t\t 6.10 TL\n" +
                "\t\t\t\t\t08\t Kavun      \t 4.30 TL\n" +
                "\t\t\t\t\t09\t Üzüm      \t \t 2.70 TL\n" +
                "\t\t\t\t\t10\t Limon     \t \t 0.50 TL");
        System.out.print("Lutfen almak isteginiz urunu belirtiniz: ");

        int secilenUrun = 0;
        try {
            secilenUrun = scan.nextInt();

        } catch (InputMismatchException e) {
            String hataliSecim=scan.next();
            System.out.println("Hatali giris yaptiniz. Tekrar deneyiniz.");
            urunSec();
        }


        System.out.println("Lutfen kac kg almak isteginizi giriniz: ");
        double miktar = 0;
        try {
            miktar = scan.nextDouble();
        } catch (InputMismatchException e) {
            String hataliSecim=scan.next();
            System.out.println("Hatali giris yaptiniz. Tekrar deneyiniz.");
            urunSec();
        }

        Variables alinacaklar= new Variables();
      urunListesiMap.put(secilenUrun,alinacaklar);

        try {
            sepet.add(miktar + " kg " + (urunListesiMap.get(secilenUrun).getUrunListesi().get(secilenUrun)));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Listede olmayan urun sectiniz. tekrar deneyiniz");
        }
        try {
            sepetTutari += urunListesiMap.get(secilenUrun).getFiyatListesi().get(secilenUrun)*miktar;
        } catch (IndexOutOfBoundsException e) {

        }
        System.out.println("Su an sepetinizdeki urunler: " + sepet);
        secimYap();


    }

    public  double paraUstuHesapla() {

        System.out.println("Lutfen hesap bakiyenizi giriniz:");
        musteriBakiye = scan.nextDouble();
        System.out.println("Hesap bakiyeniz : " + musteriBakiye + "$ Odemeniz gereken tutar: " + (float) sepetTutari + " $");
        System.out.println("Para ustunuz: " + (float) (musteriBakiye - sepetTutari) + " $'dir.");
        return (musteriBakiye - sepetTutari);
    }

    public  void secimYap() {
        System.out.println("Baska bir urun almak ister misiniz? E/H");
        String secim = scan.next().substring(0, 1).toUpperCase();

        if (secim.equals("E")) {
            urunSec();
        } else if (secim.equals("H")) {
            paraUstuHesapla();
            while(true){
            System.out.println("Devam etmek icin 1\nCikis icin Q");
            String secim1 = scan.next();

                if (secim1.equals("1")) {
                    urunSec();
                    break;
                } else if (secim1.equalsIgnoreCase("Q")) {
                    cikis();
                    break;
                } else {
                    System.out.println("Hatali secim. tekrar deneyiniz");
                }

            }
        } else {
            System.out.println("Hatali secim yaptiniz. Lutfen tekrar deneyiniz");
            secimYap();
        }
    }
    public void cikis(){
        System.out.println("Bizi tercih ettiginiz icin tesekkurler. Yine bekleriz.");
    }



}
