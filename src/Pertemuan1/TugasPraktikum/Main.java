package Pertemuan1.TugasPraktikum;

public class Main {
    public static void main(String[] args) {
        Helm hlm = new Helm();
        Laptop ltp = new Laptop();
        KameraAnalog kamlog = new KameraAnalog();
        KameraPocket kampoc = new KameraPocket();

        hlm.merk = "NHK";
        hlm.tipe = "Full Face";
        hlm.ukuran = "L";
        hlm.bahan = "Polycarbonate";
        hlm.warna = "Hitam";
        hlm.cetakInformasi();
        hlm.pakaiHelm();
        hlm.bukaVisor();
        hlm.kaitTali();
        System.out.println("===========\n");

        ltp.merk = "MSI";
        ltp.tipe = "GF63";
        ltp.prosesor = "Intel Core I7";
        ltp.ram = 8;
        ltp.storage = 512;
        ltp.grafis = "NVIDIA GeForce RTX 3050";
        ltp.cetakInformasi();
        ltp.nyalakanLaptop();
        ltp.bukaApl("Discord");
        ltp.tutupApl("Discord");
        ltp.matikanLaptop();
        System.out.println("===========\n");

        kamlog.setMerk("Canon");
        kamlog.setTipe("Analog Prima AF-7");
        kamlog.setWarna("Hitam");
        kamlog.setLensa("Lensa AF 35mm 1:4.5");
        kamlog.setRollFilm("Kodak");
        kamlog.tipebaterai = "2*AA";
        kamlog.jenisFilm = "Negatif";
        kamlog.ukuranFilm = "35mm";
        kamlog.cetakInformasi();
        kamlog.masukkanRoll();
        kamlog.ambilGambar();
        kamlog.gulungRollFilm();
        kamlog.lepasFilm();
        System.out.println("===========\n");

        kampoc.setMerk("Canon");
        kampoc.setTipe("Pocket IRX 185");
        kampoc.setWarna("Silver");
        kampoc.setMemori("64GB");
        kampoc.setLensa("Lensa Fix Zoom");
        kampoc.layarLCD = "3 inch";
        kampoc.mode = "Auto";
        kampoc.tipebaterai = "Lithium-ion";
        kampoc.cetakInformasi();
        kampoc.hidupKamera();
        kampoc.setAperture(2.8);
        kampoc.zoomIn();
        kampoc.ambilGambar();
        kampoc.ubahMode("Potrait");
        kampoc.ambilGambar();
        kampoc.zoomOut();
        kampoc.hapusFoto();
        kampoc.matikanKamera();
        System.out.println("===========\n");
    }
}
