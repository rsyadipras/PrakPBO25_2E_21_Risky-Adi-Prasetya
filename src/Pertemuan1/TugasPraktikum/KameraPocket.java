package Pertemuan1.TugasPraktikum;

public class KameraPocket extends Kamera {
    String memori;
    String layarLCD; // Tambah atribut
    String mode; // tambah atribut

    public void setMemori(String memori) {
        this.memori = memori;
    }

    public void zoomIn() {
        System.out.println("Zoom in pada kamera pocket.");
    }

    public void zoomOut() {
        System.out.println("Zoom out pada kamera pocket.");
    }

    public void ubahMode(String mode) { // Tambah Behaviour
        this.mode = mode;
        System.out.println("Mode kamera diubah ke: " + mode);
    }

    public void hapusFoto() { // Tambah Behaviour
        System.out.println("Foto dihapus dari kamera pocket.");
    }

    public void cetakInformasi() { // Tambah behaviour
        System.out.println("Informasi Kamera Pocket:");
        System.out.println("Merk: " + merk);
        System.out.println("Tipe: " + tipe);
        System.out.println("Warna: " + warna);
        System.out.println("Lensa: " + lensa);
        System.out.println("Memori: " + memori);
        System.out.println("Tipe Baterai: " + tipebaterai);
        System.out.println("Layar LCD: " + layarLCD);
        System.out.println("Mode: " + mode);
        System.out.println("===========");
    }
}
