package week6._2_tuesday;

import java.util.Scanner;

public class _01_StringMethods {
    public static class _07_StringEqualsIgnoreCase {
        public static void main(String[] args) {
            // 2 stringi büyük küçük harf ayırımı yapmadan karşılaştırır.
            // sonuç boolean dur.

            String s1="Merhaba";
            String s2="MERHABA";

            System.out.println("s1.equalsIgnoreCase(s2) = " + s1.equalsIgnoreCase(s2));
            System.out.println("s1.equalsIgnoreCase(s2) = " + s1.equalsIgnoreCase("MerHABA"));
        }
    }

    public static class _08_StringIndexOf {
        public static void main(String[] args) {
            // Verilen karakter(lerin) stringin içindeki INDEX nosunuz verir.
            // contains bize var veya yok diyordu, bu ise INDEX ini verir, yok ise -1 verir
            // aynı karakterden fazla olursa ilkinin INDEX ini verir
                     //0123456789012
            String s1="Merhaba Dünya";
            System.out.println("s1.indexOf(e) = " + s1.indexOf("e"));

            System.out.println("s1.indexOf(e) = " + s1.indexOf("e"));
            System.out.println("s1.indexOf(ha) = " + s1.indexOf("ha"));
            System.out.println("s1.indexOf(ny) = " + s1.indexOf("ny"));
            System.out.println("s1.indexOf( ) = " + s1.indexOf(" "));
            System.out.println("s1.indexOf(k) = " + s1.indexOf("k"));
            System.out.println("s1.indexOf(a) = " + s1.indexOf("a"));
            System.out.println("s1.indexOf(A) = " + s1.indexOf("A"));
        }
    }

    public static class _09_StringIsEmpty {
        public static void main(String[] args) {
            //Bir string BOŞ mu olup olmadığını boolean olarak söyler.

            String s1="Merhaba";
            System.out.println("s1.isEmpty() = " + s1.isEmpty()); // false

            String s2="";
            System.out.println("s2.isEmpty() = " + s2.isEmpty()); // true

            String s3=" ";
            System.out.println("s3.isEmpty() = " + s3.isEmpty()); // false
        }
    }

    public static class _10_StringLastIndexOf {
        public static void main(String[] args) {
            // indexOf la aynı şekilde çalışır, sadece sondan itibaren
            // ilk bulduğunun INDEX ini verir.
                     //0123456 index sırası hep aynı
            String s1="Merhaba";

            System.out.println("Baştan a nın INDEX i = " + s1.indexOf("a")); // 4
            System.out.println("Sondan a nın INDEX i = " + s1.lastIndexOf("a")); // 6

                     //01234 index sırası hep aynı
            String s2="Good";
            System.out.println("Baştan o harfi nin INDEX = " + s2.indexOf("o")); //1
            System.out.println("Sondan o harfi nin INDEX = " + s2.lastIndexOf("o")); //2
        }
    }

    public static class _11_StringSubstring {
        public static void main(String[] args) {
            //  Stringin belli bir bölümünü alma işleminidir.

            String s1="Merhaba arkadaşlar";

            System.out.println("1.Bölüm rhab = " + s1.substring(2, 6)); // 2 nolu indexten 6 ya kadar 6 dahil değil
             // alt sınır dahil , üst sınır değil.

            System.out.println("2.Bölüm arkadaş = "+ s1.substring(8, 15));

            System.out.println("3.Bölüm arkadaşlar = "+ s1.substring(8)); // verilen indexten sona kadar alır

        }
    }

    public static class _12_Soru {
        public static void main(String[] args) {
            // Kullanıcıdan tek okumada alacağınız 2 kelimelik ad ve soyadı ekrana
            // sadece isim başHarf.soysimBasharf. şeklinde yazdırınız.
            // yani Ahmet Yılmaz -> A.Y. olarak yazdırınız.

            Scanner oku=new Scanner(System.in);
            System.out.print("Ad ve Soyadınız = ");
            String tamAd=oku.nextLine(); // Ahmet Yılmaz

            char adBasHarf= tamAd.charAt(0); // A
            int boslukIndex = tamAd.indexOf(" ");
            char soyadIlkHarf = tamAd.charAt(boslukIndex+1);

            System.out.println("Kısa Format Hali = " + adBasHarf+"."+soyadIlkHarf+".");
        }
    }
}
