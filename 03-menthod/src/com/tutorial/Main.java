package com.tutorial;

class Mahasiswa{
    // Data member
    String nama;
    String nim;
    String prodi;
  
    // construktor dengan parameter
Mahasiswa(String nama, String NIM, String Prodi){
    this.nama = nama;
    this.nim =NIM;
    this.prodi = Prodi;
}

// method tanpa  parameter dan tanpa return
void show(){
    System.out.println("Nama :" + this.nama);
    System.out.println("NIM :" + this.nim);
    System.out.println("Prodi :" + this.prodi);

}


// Method tanpa return dengan parameter
void setNama(String nama){
    this.nama = nama;
}

// method dengan returen tanpa parameter
    String getNama(){
        return this.nama;
    }
    // method dengan return dan parameter
    String sayHi(String pesan){
        return pesan + "Waalaikumsalam" + this.nama;
    }


}






public class Main {
    public static void main(String[] args) {
       // intansiasi objek
       Mahasiswa mhs1 = new Mahasiswa("ila ", "22241040", "PTI");


       mhs1.show();
       mhs1.setNama("fadilah");
       mhs1.show();
       System.out.println(mhs1.getNama());

       String pesan = mhs1.sayHi("Assalammualaikum");
       System.out.println(pesan);


    }
}
