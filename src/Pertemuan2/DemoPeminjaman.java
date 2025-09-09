package Pertemuan2;

public class DemoPeminjaman {
    public static void main(String[] args) {
        Peminjaman21 pjn1 = new Peminjaman21();
        pjn1.id = "G001";
        pjn1.nmMember = "Budi";
        pjn1.nmGame = "GTA 6";
        pjn1.harga = 750000;
        pjn1.lamaSewa = 3;
        pjn1.tampilData();
        System.out.println("Harga yang harus dibayar: Rp. " + pjn1.hitungBills());
    }
}
