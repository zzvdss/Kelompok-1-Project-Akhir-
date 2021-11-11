package Kasir;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Kasir {
    private static Scanner input = new Scanner(System.in);
    private static dataBarang[] dataBrg = new dataBarang[100];
    int barangdijual = 0;

    public static void main(String[] args) {
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
                    listharga();
                    break;
                case 2:
                    transaksi();
                case 3:
                    pembayaran();
            }
        } while (pil != 0);
    }

    static void listharga() {
        System.out.println("Price List - Gemini Digital Printing\n" +
                "\t\n" +
                "\tPrice List Brosur\n" +
                "\tAP 120 GSM Ukuran A6 \tRp. 150.000/2rim\n" +
                "\tAP 120 GSM Ukuran A5 \tRp. 220.000/2rim\n" +
                "\tAP 120 GSM Ukuran A4 \tRp. 420.000/2rim\n" +
                "\t\n" +
                "\tPrice List cetak Banner\n" +
                "\tFronlite 280gr\t\t\tRp. 14.500/meterpersegi\n" +
                "\tFronlite 340gr\t\t\tRp. 19.000/meterpersegi\n" +
                "\tFronlite 440gr\t\t\tRp. 28.000/meterpersegi\n" +
                "\t\n" +
                "\tPrice List X-Banner\n" +
                "\t60 x 160 Outdoor\t\tRp. 70.000/set\t\n" +
                "\t60 x 160 Indoor\t\t\tRp. 90.000/set\n" +
                "\t80 x 180 Outdoor\t\tRp. 105.000/set\n" +
                "\t80 x 180 Indoor\t\t\tRp. 115.000/set");
    }

    static void transaksi() {
        int jumBarang;
        System.out.println("Masukkan Jumlah Barang : ");
        jumBarang = input.nextInt();
        for (int i = 0; i < dataBrg.length; i++) {
            System.out.println("Barang Ke: " + (i + 1));
            System.out.println("Masukan Nama Barang: ");
            dataBrg[i].setNamaBarang(input.next());
            System.out.println("Masukkan Harga Barang; ");
            dataBrg[i].setHargaBarang(input.nextFloat());
            System.out.println("Masukkan Jumlah Beli; ");
            dataBrg[i].setJumBeli(input.nextInt());
        }
    }

    static void pembayaran() {
        System.out.println("DATA PENJUALAN BARANG");
        System.out.println("GEMINI DIGITAL PRINTING");
        System.out.println("================================================");
        System.out.println("No. \tNama Barang \tJumlah Beli \tBayar");
        System.out.println("================================================");
        for (int i = 0; i < dataBrg.length; i++) {
            System.out.println((i + 1) + "\t" + dataBrg[i].getNamaBarang() + "\t" + dataBrg[i].getJumBeli() + "\t" + dataBrg[i].getBayar());
        }
        System.out.println("================================================");
    }
}
