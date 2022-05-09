
import java.util.Scanner;

public class lesson41Practice {
    public static void main(String[] args) {

        // Ödev : N elemanlı bşr kümenin elemanşarı ile oluşturulacak r elemanlı farklı grupların sayısı
        // n'in r'li kombinasyonu olarak adlandırılır. C(n,r) şekline gösterilir.

        //Kombinasyonu hesaplayan programı yazınız.
        //Formül : C(n,r) = n! / (r!*(n-r)!)

        // Dikkat! 0!=1 ve 1!=1

        int sonuc;

        Scanner scan = new Scanner(System.in);

        System.out.print("Kümede bulunan eleman sayısını giriniz:");
        int n = scan.nextInt();


        System.out.print("Elemanların yapılacak eleman gruplama sayısını giriniz:");
        int r = scan.nextInt();

        // N faktoriyel hesaplaması
        int nfaktoriyel =1;

        for (int i =1; i<=n; i++){
            nfaktoriyel = nfaktoriyel * i;
        }

        System.out.println(n + "!:" + nfaktoriyel);

        // R faktoriyel hesaplaması
        int rfaktoriyel =1;

        for (int j=1; j<=r; j++){
            rfaktoriyel = rfaktoriyel * j;
        }
        System.out.println(r + "!:" + rfaktoriyel);

        //N-R faktoriyel  hesaplaması.

        int difference=n-r;
        int kfaktoriyel=1;

        for (int k=1; k<=difference; k++){
            kfaktoriyel=kfaktoriyel*k;
        }
        sonuc = (nfaktoriyel) / (rfaktoriyel * kfaktoriyel);
        System.out.println("C(" + (n) + "," + (r) + ")" + ":" + sonuc );





    }
}
