package Kasir;

public class dataBarang {
    String namaBarang;
    float hargaBarang;
    int jumBeli;
    double bayar;
public dataBarang( String namaBarang, float hargaBarang, int jumBeli, double bayar){
    this.namaBarang = namaBarang;
    this.hargaBarang = hargaBarang;
    this.jumBeli = jumBeli;
    this.bayar = bayar;
}


    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public float getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(float hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public int getJumBeli() {
        return jumBeli;
    }

    public void setJumBeli(int jumBeli) {
        this.jumBeli = jumBeli;
    }
    public double getBayar(){
    bayar = hargaBarang * jumBeli;
    return bayar;
    }
}
