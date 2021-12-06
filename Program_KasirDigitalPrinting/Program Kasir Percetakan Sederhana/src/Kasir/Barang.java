package Kasir;

public class Barang {
    String namaBarang;
    float hargaBarang;
    int jumBeli;

    public Barang( String namaBarang, float hargaBarang, int jumBeli){
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumBeli = jumBeli;
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

}
