
package si_3;
import java.util.Scanner;
public class Tugas1 {
public static void main(String[]args){
  //deklarasi variable
  int awal;
  int akhir;
  //mengambil inputan keyboard
  Scanner input = new Scanner(System.in);
  System.out.print("Masukkan batas awal : ");
    awal = input.nextInt();
  System.out.print("Masukkan batas akhir : ");
    akhir = input.nextInt();
    
  System.out.println("Deret Bilangan Genap");
  //perulangan for
    for (int i = awal; i <= akhir; i++){
        //kondisi bilangan genap
        if (i%2==0){
            System.out.println(i);
        }
    }
}   
}
