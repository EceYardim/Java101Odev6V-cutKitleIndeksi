import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenleri yazalım.
        double kilo, boy;

        //Vücut Kitle İndeksi için, kullanıcıdan boy ve kilo değerlerini alalım.
        Scanner inp= new Scanner(System.in);
        System.out.print( "Kilonuzu Kg Cinsinden Giriniz:");
        kilo=inp.nextDouble();
        System.out.print( "Boyunuzu M Cinsinden Giriniz:");
        boy=inp.nextDouble();
        double index= kilo/(boy*boy);
        System.out.println( "Vücut Kitle İndeksiniz:" + index);



    }
}
