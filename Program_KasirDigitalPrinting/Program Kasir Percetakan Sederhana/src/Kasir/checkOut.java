package Kasir;

public class checkOut extends Barang {
    double bayar;
    public checkOut(String namaBarang, float hargaBarang, int jumBeli, double bayar){
        super(namaBarang, hargaBarang, jumBeli);
        this.bayar = bayar;
    }

    public double getBayar(){
        bayar = hargaBarang * jumBeli;
        return bayar;
    }
}
