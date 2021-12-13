package Kasir;

public class Barang {
    String jenis,bhn,kode;
    int harga,total,no, ppn,grandtotal,bahan,subtotal=0;
    float qty;

    public int getNo() {
        return no;
    }
    public String getKode() {
        return kode;
    }
    public String getJenis() {
        return jenis;
    }
    public String getBhn() {
        return bhn;
    }
    public int getHarga() {
        return harga;
    }
    public float getQty() {
        return qty;
    }
    public int getTotal() {
        return total;
    }
    public Barang(int no,String kode,String jenis, String bhn, int harga, float qty, int total)
    {
        this.no = no;
        this.kode = kode;
        this.jenis = jenis;
        this.bhn = bhn;
        this.harga = harga;
        this.qty = qty;
        this.total = total;
    }
}
