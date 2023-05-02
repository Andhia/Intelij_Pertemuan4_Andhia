package com.andhia.pbo.pertemuan4;

public class WarungMakan {
    String no_telp;
    String nama_warung;
    String alamat;

    public void detailWarung(){
        System.out.println("====Warung Makan Sederhana====");
        System.out.println("Nama Warung : " + nama_warung);
        System.out.println("Alamat      : " + alamat);
        System.out.println("No Telpon   : " + no_telp);
        System.out.println();
    }
    //membuat fungsi cekstok
    public void cekStok(Menu m){
        if(m.no_makanan ==1){

            System.out.println("Stok Nasi Goreng : " + m.stock);
        }else if(m.no_makanan ==2){
            System.out.println("Stock Nasi Goreng : " + m.stock);
        }else if (m.no_makanan ==3){
            System.out.println("Stock Nasi Goreng Spesial + Telur : " + m.stock);

        }
        System.out.println();

    }
    public void beliMakanan(Menu m, int jumlah){
        if (jumlah >= m.stock){
            System.out.println("Mohon maaf stock tidak cukup");
            m.harga = 0;
        }else {
            System.out.println("====Detail Pemebelian====");
            System.out.println();
            System.out.println("Nama Makanan  : " + m.nama_makanan);
            System.out.println("Harga         : " + m.harga);
            System.out.println("Jumlah        : " + jumlah);
            m.harga = m.harga * jumlah;
            m.stock -= jumlah;
        }
    }

    //Getter and Setter
    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    public String getNama_warung() {
        return nama_warung;
    }

    public void setNama_warung(String nama_warung) {
        this.nama_warung = nama_warung;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
