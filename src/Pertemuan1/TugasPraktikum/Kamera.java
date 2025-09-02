package Pertemuan1.TugasPraktikum;

public class Kamera {
    String merk;
    String tipe;
    String warna;
    String lensa;
    double aperture; // tambah atribut
    String tipebaterai; // tambah atribut

    public void setMerk(String mrk) {
        merk = mrk;
    }

    public void setTipe(String tp) {
        tipe = tp;
    }

    public void setWarna(String wrn) {
        warna = wrn;
    }

    public void setLensa(String lns) {
        lensa = lns;
    }

    public void setTipeBaterai(String btr) {
        tipebaterai = btr;
    }

    public void hidupKamera() {
        System.out.println("Kamera " + merk + " " + tipe + " dinyalakan.");
    }

    public void matikanKamera() { // Tambah Behaviour
        System.out.println("Kamera " + merk + " " + tipe + " dimatikan.");
    }

    public void setAperture(double f) { // Tambah behaviour
        aperture = f;
    }

    public void ambilGambar() { // Tambah Behaviour
        System.out.println("Ambil gambar dengan kamera " + merk + " " + tipe + ".");
    }
}
