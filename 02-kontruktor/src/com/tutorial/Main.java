package com.tutorial;

// class tampa kontruktor
class polos{
    String dataString;
    int dataInteger;
}

//class dengan konstruktor
class Mahasiswa{
    String nama;
    String nim;
    String prodi;

//     // Membuat konstruktor dengan parameter
//     Mahasiswa() {
// System.out.println("ini adalah kontruktor");
//     }

    // membuat konstruktor dengan parameter
    Mahasiswa(String inputNama, String inputNIM, String inputProdi){
        nama = inputNama;
        nim = inputNIM;
    prodi = inputProdi;

}
public class Main {
    public static void main(String[] args) {
      polos pls = new polos();
//       pls.dataString = "Polos";
//       pls.dataInteger = 10; 


// System.out.println("Isi Data String:" + pls.dataString);
// System.out.println("Isi Data Integer:" + pls.dataInteger);

Mahasiswa mhsl = new Mahasiswa( "ila","22241040", "PTI")


]
]