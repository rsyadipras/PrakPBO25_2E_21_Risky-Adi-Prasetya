package Pertemuan1.TugasPraktikum;

public class Helm {
    public String merk;
    public String tipe;
    public String ukuran;
    public String warna; // tambah atribut
    public String bahan; // tambah atribut

    public void bukaVisor() {
        System.out.println("Visor Helm dibuka.");
    }

    public void tutupVisor() {
        System.out.println("Visor Helm ditutup.");
    }

    public void pakaiHelm() {
        System.out.println("Helm sekarang dipakai."); // Tambah Method
    }

    public void kaitTali() {
        System.out.println("Tali helm dikaitkan."); // Tambah Method
    }

    public void lepasHelm() {
        System.out.println("Helm dilepas."); // Tambah Method
    }

    public void cetakInformasi() {
        System.out.println("Informasi Helm:");
        System.out.println("Merk: " + merk);
        System.out.println("Tipe: " + tipe);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Warna: " + warna);
        System.out.println("Bahan: " + bahan);
        System.out.println("===========");
    }
}
