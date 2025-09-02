package Pertemuan1.TugasPraktikum;

public class KameraAnalog extends Kamera {
    String rollFilm;
    String jenisFilm; // tambah atribut
    String ukuranFilm; // tambah atribut

    public void setRollFilm(String roll) {
        rollFilm = roll;
    }

    public void masukkanRoll() {
        System.out.println("Roll film " + rollFilm + " dimasukkan.");
    }

    public void gulungRollFilm() { // Tambah Behaviour
        System.out.println("Roll film digulung.");
    }

    public void lepasFilm() { // tambah behaviour
        System.out.println("Roll film " + rollFilm + " dilepas.");
    }

    public void cetakInformasi() { // Tambah behaviour
        System.out.println("Informasi Kamera Analog:");
        System.out.println("Merk: " + merk);
        System.out.println("Tipe: " + tipe);
        System.out.println("Warna: " + warna);
        System.out.println("Lensa: " + lensa);
        System.out.println("Roll Film: " + rollFilm);
        System.out.println("Jenis Film: " + jenisFilm);
        System.out.println("Ukuran Film: " + ukuranFilm);
        System.out.println("Tipe Baterai: " + tipebaterai);
        System.out.println("===========");
    }
}
