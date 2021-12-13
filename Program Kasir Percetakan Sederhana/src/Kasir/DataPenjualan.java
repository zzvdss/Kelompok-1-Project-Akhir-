package Kasir;
import java.util.ArrayList;
import java.util.Scanner;

public class DataPenjualan {
    ArrayList<Barang> list;
    String jenis = null,bhn = null;
    int harga = 0,bahan,qty = 0,total=0,subtotal=0,jmlbayar=0,kembali=0,ppn,grandtotal;
    int no = 1;
    int n;
    Scanner scan;
    Scanner pilih = new Scanner(System.in);
    Scanner masukan = new Scanner(System.in);
    Scanner bayar = new Scanner(System.in);


    void getVal() {
        list = new ArrayList<Barang>();
        scan = new Scanner(System.in);
        System.out.println("Bersiap Memulai Transaksi");
        System.out.print("\nMasukan Jumlah Barang Transaksi : ");
        n = Integer.parseInt(scan.nextLine());
        for(int i=0; i<n; i++) {
            System.out.print("Pilih Kode Jenis : ");
            System.out.print("\nA. BROSUR");
            System.out.print("\nB. BANNER FRONLITE");
            System.out.print("\nC. X DAN Y BANNER");
            String kode = pilih.next();
            switch (kode){
                case "A":
                    jenis="BROSUR";
                    System.out.print("Silahkan pilih bahan:  ");
                    System.out.print("\n1. AP 120 GSM Ukuran A6");
                    System.out.print("\n2. AP 120 GSM Ukuran A5");
                    System.out.print("\n3. AP 120 GSM Ukuran A4");
                    bahan=masukan.nextInt();
                    if (bahan==1) {
                        bhn="AP 120 GSM Ukuran A6";
                        harga=150000;
                    }else if (bahan==2) {
                        bhn="AP 120 GSM Ukuran A5";
                        harga=220000;
                    }else if (bahan==3) {
                        bhn="AP 120 GSM Ukuran A4";
                        harga=420000;
                    }else{
                        System.out.println("Bahan yang dipilih tidak ada dalam data!!");
                    }
                    System.out.print("Silahkan masukan jumlah : ");
                    qty=masukan.nextInt();
                    break;
                case "B":
                    jenis="BANNER FRONLITE";
                    System.out.print("Silahkan pilih Bahan:  ");
                    System.out.print("\n1. Fronlite 280gr");
                    System.out.print("\n2. Fronlite 340gr");
                    System.out.print("\n3. Fronlite 440gr");
                    bahan=masukan.nextInt();
                    if (bahan==1) {
                        bhn="Fronlite 280gr";
                        harga=14500;
                    }else if (bahan==2) {
                        bhn="Fronlite 340gr";
                        harga=19000;
                    }else if (bahan==3) {
                        bhn="Fronlite 440gr";
                        harga=28000;
                    }else{
                        System.out.println("Bahan yang anda pilih tidak ada dalam data!!!");
                    }
                    System.out.print("Silahkan masukan meter persegi : ");
                    qty=masukan.nextInt();
                    break;
                case "C":
                    jenis="X dan Y banner";
                    System.out.print("Silahkan pilih Bahan:  ");
                    System.out.print("\n1. 60 x 160 Outdoor");
                    System.out.print("\n2. 60 x 160 Indoor");
                    System.out.print("\n3. 80 x 180 Outdoor");
                    System.out.print("\n4. 80 x 180 Indoor");
                    bahan=masukan.nextInt();
                    if (bahan==1) {
                        bhn="60 x 160 Outdoor";
                        harga=70000;
                    }else if (bahan==2) {
                        bhn="60 x 160 Indoor";
                        harga=90000;
                    }else if (bahan==3) {
                        bhn="80 x 180 Outdoor";
                        harga=105000;
                    }else if (bahan==4) {
                        bhn="80 x 180 Indoor";
                        harga=115000;
                    }
                        else{
                        System.out.println("Bahan yang anda pilih tidak ada!!!");
                    }
                    System.out.print("Silahkan masukan jumlah : ");
                    qty=masukan.nextInt();
                    break;
                default :
                    System.out.println("Jenis Barang SALAH. Silahkan ulangi");
                    break;
            }
            total=qty*harga;
            list.add(new Barang(no,kode,jenis,bhn,harga,qty,total));
            no++;
        }
    }

    void display() {
        System.out.println("\n\n");
        System.out.println(" GEMINI DIGITAL PRINTING ");
        System.out.println(" WIYUNG SURABAYA");
        System.out.println(" KASIR - ADMIN ");
        System.out.println("--------------------------------------------------------------");
        System.out.println("|No.| Kode |"+" Jenis |"+" Bahan |"+" Harga |"+" Jumlah |"+"2" + " Total |");
        System.out.println("--------------------------------------------------------------");

        if(list.isEmpty()) {
            System.out.println("KOSONG..");
        }else {
            for(int i=0; i<list.size(); i++) {
                System.out.println("|"+list.get(i).getNo() +" |"+list.get(i).getKode() +" |"
                            +list.get(i).getJenis()+" |"+list.get(i).getBhn()+" |"+list.get(i).getHarga()
                        +" |"+list.get(i).getQty()+" |"+list.get(i).getTotal()+" |");
                subtotal+=list.get(i).getTotal();
                ppn=(int) (subtotal* 0.1);
                grandtotal=subtotal+ppn;
            }
            System.out.println("--------------------------------------------------------------");
            System.out.println("\t\t\t\t\t Subtotal         : Rp. "+subtotal);
            System.out.println("\t\t\t\t\t ppn              : Rp. "+ppn);
            System.out.println("\t\t\t\t\t Total Semuanya   : Rp. "+grandtotal);
            System.out.print("\t\t\t\t\t Pembayaran       : Rp. ");
            jmlbayar=bayar.nextInt();
            kembali=jmlbayar-grandtotal;
            System.out.println("\t\t\t\t\t Kembalian : Rp. "+kembali);
            System.out.print("\n");

        }
    }

    void clear(){
        for(int j=0; j<list.size(); j++) {
            list.removeAll(list);
            no=1;
            subtotal=0;
            ppn=0;
            grandtotal=0;
        }
    }

}
