import java.util.Scanner;
public class Ekspedisi {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        String Namabarang, Tujuan;
        int biayaberat, totalpengiriman , Biayajarak = 100000;
        int kg1 = 100000, kg2 = 20000, kg3 = 50000;
        int BeratBarang;

        System.out.println("Masukkan nama barang: ");
        Namabarang = input.nextLine();
        System.out.println("Masukkan Tujuan: ");
        Tujuan = input.nextLine();

        System.out.print("Total Berat Barang= ");
        BeratBarang = input.nextInt();

        if(BeratBarang <= 2){
            System.out.println("Biaya berat pengiriman= " +kg1);
            biayaberat= kg1 * BeratBarang;
        }else if (BeratBarang <= 5){
            System.out.println("Biaya berat pengiriman= "+kg2);
            biayaberat = kg2 * BeratBarang;
        }else {
            System.out.println("Biaya berat pengiriman= "+ kg3);
            biayaberat = kg3 * BeratBarang;
        }
        System.out.println("biaya berat barang= " + biayaberat);
        totalpengiriman = biayaberat + Biayajarak;

        System.out.println("Nama Barang: "+ Namabarang);
        System.out.println("Tujuan Pengiriman: "+ Tujuan);
        System.out.println("Total biaya pengiriman= "+ totalpengiriman);
    }
   

}
