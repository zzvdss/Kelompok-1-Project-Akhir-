package Kasir;
import java.util.Scanner;
import java.util.ArrayList;
public class Kasir {

    public static void main(String[] args) {
        Kasir kasir = new Kasir();
        int pil;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("\tMain Menu\n" +
                    "\t\n" +
                    "\t1. List Harga\n" +
                    "\t2. Transaksi\n" +
                    "\t3. Stop Program\n" +
                    "\t\n" +
                    "\tpilih menu ");

            pil = input.nextInt();
            switch (pil) {
                case 1:
                    kasir.listharga();
                    break;
                case 2:
                    kasir.transaksi();
                    break;
                case 3:
                    System.out.println(" TERIMAKASIH ");
                    break;
                default:
                    System.out.println(" Inputan Salah !! ");
            }
        } while (pil <= 2);
    }

     public void listharga(){

        ArrayList<String> list = new ArrayList<String>();
        list.add("======================================================");
        list.add("=           Gemini Digital Printing                  =");
        list.add("======================================================");
        list.add("= Price List Brosur :                                =");
        list.add("= AP 120 GSM Ukuran A6    Rp. 150.000/2rim           =");
        list.add("= AP 120 GSM Ukuran A5    Rp. 220.000/2rim           =");
        list.add("= AP 120 GSM Ukuran A4    Rp. 420.000/2rim           =");
        list.add("======================================================");
        list.add("= Price List Banner :                                =");
        list.add("= Fronlite 280gr          Rp. 14.500/meterpersegi    =");
        list.add("= Fronlite 340gr          Rp. 19.000/meterpersegi    =");
        list.add("= Fronlite 440gr          Rp. 28.000/meterpersegi    =");
        list.add("======================================================");
        list.add("= Price List X dan Y Banner :                        =");
        list.add("= 60 x 160 Outdoor        Rp. 70.000/set             =");
        list.add("= 60 x 160 Indoor         Rp. 90.000/set             =");
        list.add("= 80 x 180 Outdoor        Rp. 105.000/set            =");
        list.add("= 80 x 180 Indoor         Rp. 115.000/set            =");
        list.add("======================================================");
        for (String i : list) {
            System.out.println(i);
        }
    }

    public void transaksi(){
        DataPenjualan obj = new DataPenjualan();
        obj.getVal();
        obj.display();
        obj.clear();
    }

}