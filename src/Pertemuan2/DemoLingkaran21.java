package Pertemuan2;

public class DemoLingkaran21 {
    public static void main(String[] args) {
        Lingkaran21 lrn = new Lingkaran21();
        lrn.phi = 3.14;
        lrn.r = 4;

        System.out.println("Luas Lingkaran: " + lrn.hitungLuas());
        System.out.println("keliling Lingkaran: " + lrn.hitungKeliling());
    }
}
