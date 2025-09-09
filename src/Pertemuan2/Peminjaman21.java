package Pertemuan2;

public class Peminjaman21 {
    public String id;
    public String nmMember;
    public String nmGame;
    public double harga;
    public int lamaSewa;

    public void tampilData() {
        System.out.println("ID Peminjaman: " + id);
        System.out.println("Nama Member: " + nmMember);
        System.out.println("Nama Game: " + nmGame);
        System.out.println("Harga Game: Rp. " + harga);
        System.out.println("Lama Sewa: " + lamaSewa + " hari");
    }

    public double hitungBills() {
        double total = lamaSewa * harga;
        return total;
    }
}