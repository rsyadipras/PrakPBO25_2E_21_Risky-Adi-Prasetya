package Pertemuan1.TugasPraktikum;

public class Laptop {
    public String merk;
    public String tipe;
    public String prosesor;
    public int ram;
    public int storage; // tambah atribut
    public String grafis; // tambah atribut

    public void nyalakanLaptop() {
        System.out.println("Laptop dinyalakan.....");
    }

    public void matikanLaptop() {
        System.out.println("Shutting down.....");
    }

    public void bukaApl(String nmapl) {
        System.out.println("Membuka aplikasi " + nmapl + "..."); // tambah behaviour
    }

    public void tutupApl(String nmapl) {
        System.out.println("Menutup aplikasi " + nmapl + "..."); // tambah behaviour
    }

    public void cetakInformasi() { // tambah behaviour
        System.out.println("Informasi Laptop:");
        System.out.println("Merk: " + merk);
        System.out.println("Tipe: " + tipe);
        System.out.println("Prosesor: " + prosesor);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Storage: " + storage + "GB");
        System.out.println("Grafis: " + grafis);
        System.out.println("===========");
    }
}
