package Pertemuan2;

public class DemoBarang21 {
    public static void main(String[] args) {
        Barang21 brg1 = new Barang21();
        brg1.kode = "OTF01";
        brg1.namaBarang = "Tas Selempang";
        brg1.hargaDasar = 100000;
        brg1.diskon = 0.25f;

        brg1.hitungHargaJual();
        brg1.tampilData();
    }
}
