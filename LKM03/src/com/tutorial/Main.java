package com.tutorial;

class Pegawai{
    public String nama;
    public String jabatan;
    public float pajak;
    public float gajiPokok;
    private float gajiBersih;

    Pegawai(String nama, String jabatan, float pajak, float gajiPokok){
        this.nama = nama;
        this.jabatan = jabatan;
        this.pajak = pajak/100;
        this.gajiPokok = gajiPokok;
    }

    public float setPajak(float pajak) {
        return this.pajak = pajak/50;
    }

    public float getGajiBersih(){
        return this.gajiPokok -(this.gajiPokok*this.pajak);
    }

    public void display() {
        System.out.println("Nama  Karyawan: " + this.nama);
        System.out.println("Jabatan: " + this.jabatan);
        System.out.println("Gaji Bersih: " + this.getGajiBersih());
    }


    
}
public class Main {
    public static void main(String[] args) {
        Pegawai gaji =  new Pegawai("ila", "Dosen", 10, 6500000);
        gaji.display();
        gaji.setPajak(10);
        gaji.display();
        
    }
}
