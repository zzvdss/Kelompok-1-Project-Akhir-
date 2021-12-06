package Kasir;
import java.util.Scanner;
import java.util.ArrayList;
public class Kasir {
    private static Scanner input = new Scanner(System.in);
    private static Barang[] Brg = new Barang[100];
    private static checkOut[] chck = new checkOut[100];
    int barangdijual = 0;



    public static void main(String[] args) {
        Kasir kasir = new Kasir();
        int pil;
        do {
            System.out.println("\t\tMAIN MENU\n" +
                    "\t\n" +
                    "\t1. List Harga\n" +
                    "\t2. Transaksi\n" +
                    "\t3. Pembayaran\n" +
                    "\t\n" +
                    "\tpilih menu");

            pil = input.nextInt();
            switch (pil) {
                case 1:
                    kasir.hargaBarang();
                    break;
                case 2:
                    kasir.transaksi();
                    break;
                case 3:
                    kasir.pembayaran();
                    break;
            }
        } while (pil != 0);
    }

    public void hargaBarang(){
        ArrayList<String> barang = new ArrayList<String>();
        barang.add("Price List - Gemini Digital Printing");
        barang.add("Price List Brosur");
        barang.add("AP 120 GSM Ukuran A6    Rp. 150.000/2rim");
        barang.add("AP 120 GSM Ukuran A5    Rp. 220.000/2rim");
        barang.add("AP 120 GSM Ukuran A4    Rp. 420.000/2rim");
        barang.add("Price List - Gemini Digital Printing");
        barang.add("Fronlite 280gr          Rp. 14.500/meterpersegi");
        barang.add("Fronlite 340gr          Rp. 19.000/meterpersegi");
        barang.add("Fronlite 440gr          Rp. 28.000/meterpersegi");
        barang.add("Price List X-Banner");
        barang.add("60 x 160 Outdoor        Rp. 70.000/set");
        barang.add("60 x 160 Indoor         Rp. 90.000/set");
        barang.add("80 x 180 Outdoor        Rp. 105.000/set");
        barang.add("80 x 180 Indoor         Rp. 115.000/set");

        for (String i : barang) {
            System.out.println(i);
        }

    }

    public void transaksi() {

        System.out.println("Masukkan Jumlah Barang : ");
        barangdijual = input.nextInt();
        for (int i = 0; i < barangdijual; i++) {;
            System.out.println("Barang Ke: " + (i + 1));
            System.out.println("Masukan Nama Barang: ");
            String namaBarang = input.next();
            System.out.println("Masukkan Harga Barang; ");
            float hargaBarang = input.nextFloat();
            System.out.println("Masukkan Jumlah Beli; ");
            int jumBeli = input.nextInt();
            Brg[i] = new Barang(namaBarang, hargaBarang, jumBeli);
        }
    }

    public void pembayaran() {
        System.out.println("DATA PENJUALAN BARANG");
        System.out.println("GEMINI DIGITAL PRINTING");
        System.out.println("================================================");
        System.out.println("No. \tNama Barang \tJumlah Beli \tBayar");
        System.out.println("================================================");
        for (int i = 0; i < barangdijual; i++) {
            System.out.println((i + 1) + "\t" + Brg[i].getNamaBarang() + "\t" + Brg[i].getJumBeli() + "\t" + chck[i].getBayar() );
        }
        System.out.println("================================================");
    }
}