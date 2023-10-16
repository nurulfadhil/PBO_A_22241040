package com.tutorial;
class Mahasiswa {
    String nama;
    String NIM;
    String prodi;
}
public class Main {
    public static void main(String[] args) {
         Mahasiswa MHS1 = new Mahasiswa();
        MHS1.nama = "Nurul Fadhillah";
        MHS1.NIM = "22241040";
        MHS1.prodi = "PTI";
        System.out.println("Nama Mahasiswa: " + MHS1.nama);
        System.out.println("NIM Mahasiswa: " + MHS1.NIM);
        System.out.println("Prodi Mahasiswa: " + MHS1.prodi);

        Mahasiswa MHS2 = new Mahasiswa();
        MHS2.nama = "Jongkok";
        MHS2.NIM = "22222222";
        MHS2.prodi = "BTS";
        System.out.println("Nama Mahasiswa: " + MHS2.nama);
        System.out.println("NIM Mahasiswa: " + MHS2.NIM);
        System.out.println("Prodi Mahasiswa: " + MHS2.prodi);
    }
}
