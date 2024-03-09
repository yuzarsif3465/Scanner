package uygulama;

import java.util.Scanner;

public class Uygulama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sonuc;
        int x;
        System.out.print("bir deger giriniz: ");
        x = sc.nextInt();
        int y;
        System.out.print("bir deger daha giriniz");
        y = sc.nextInt();

        if (x<0 && y<0){
            sonuc= x^2+ 2*y;
        }
        else if(x<0 && y>0){
            sonuc = x^3-y*3;
        }
        else if (x>0 && y<0){
            sonuc = (x*4)-(y^2);
        }
        else{
            System.out.println("hatalı giriş yaptınız");
            sonuc=0;

        }
        System.out.println("cevap: "+sonuc);

    }
}
