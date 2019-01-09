package Test;
import java.util.Scanner;
public class Test01
{
    public static void main(String[] args)
    {
        Scanner oi = new Scanner(System.in);
        
        double hasil;
        String h;
        String ulang = "Y";
        String oyi = "y";
        
        System.out.println("Menu : ");
        System.out.println("1. Celcius ke Reamur");
        System.out.println("2. Celcius ke Farenheit");
        System.out.println("3. Celcius ke Kelvin");

        System.out.println("");
        do
        {
            System.out.print("Masukkan pilihan anda (1/2/3) : ");
            String jawab = oi.next();
            
            if(jawab.equals("1"))
            {
                System.out.print("Masukkan suhu yang dikonversi : ");
                int o = oi.nextInt();
                hasil = o * 0.8;
                System.out.print("Hasil : " + hasil);
            }
            
            else
            {
                System.out.print("Masukkan suhu yang dikonvensi :");
                int i = oi.nextInt();
                
                if(jawab.equals("2"))
                {
                    hasil = i * 1.8 + 32;
                    System.out.print("Hasil : " + hasil);
                }
                else if(jawab.equals("3"))
                {
                    hasil = i + 273;
                    System.out.print("Hasil : " + hasil);
                }
            }
            
            System.out.println("");
            System.out.println("");
            
            System.out.print("Tekan Y untuk mengulang : ");
            h = oi.next();
        }
        while(ulang.equals(h) || oyi.equals(h));
    }
}
