 package com.tutorial;

class Pelanggan {
    public String nama;
    public boolean memilikiMember;
    private double totalBelanja;
    public double potonganBelanja;
    public static double hitungPotongan(boolean memilikiMember, double totalBelanja) {
        double potongan = 0.05;

        if (memilikiMember) {
            if (totalBelanja >= 100000 && totalBelanja < 499999) {
                potongan = 0.05;
            } else if (totalBelanja >= 500000) {
                potongan = 0.1;
            } else {
                potongan = 0.03;
            }
        } else {
            if (totalBelanja >= 100000) {
                potongan = 0.03;
            } else {
                potongan = 0.03;
            }
        }

        return potongan;
    }

    void display(){
        System.out.println("nama:" + this.nama);
        System.out.println("memilikiMember:"+ this.memilikiMember);
        System.out.println("totalBelnja:"+ this.totalBelanja);
        System.out.println("potonganBelanja:"+ this.potonganBelanja);
    }

    public static void tampilkanInfoPelanggan(String namaPelanggan, boolean memilikiMember, double totalBelanja) {
        double potonganBelanja = hitungPotongan(memilikiMember, totalBelanja);
        double diskonRupiah = totalBelanja * potonganBelanja;
        double totalBelanjaSetelahPotongan = totalBelanja - diskonRupiah;

        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Status Kepemilikan Kartu Member: " + (memilikiMember ? "Ya" : "Tidak"));
        System.out.println("Total Belanja Sebelum Potongan: Rp " + totalBelanja);
        System.out.println("Diskon (%): " + (potonganBelanja * 100));
        System.out.println("Diskon (dalam Rupiah): Rp " + diskonRupiah);
        System.out.println("Total Belanja Setelah Potongan: Rp " + totalBelanjaSetelahPotongan);
    }
    public class Main {
        
    }
    public static void main(String[] args) {
        tampilkanInfoPelanggan("nurul fadilah", true, 250000);
        System.out.println();
        tampilkanInfoPelanggan("nurul fadilah", false, 250000);
    }
}