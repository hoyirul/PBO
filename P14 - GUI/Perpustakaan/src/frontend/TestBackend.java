/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Kategori;
import backend.Anggota;
import backend.Buku;
import backend.Peminjaman;
import java.sql.Date;
/**
 *
 * @author irulg
 */
public class TestBackend {
    public static void main(String[] args){
//        Kategori kat1 = new Kategori("Novel", "Koleksi buku novel");
//        Kategori kat2 = new Kategori("Referensi", "Buku referensi ilmiah");
//        Kategori kat3 = new Kategori("Komik", "Komik anak-anak");
//        
//        // test insert
//        kat1.save();
//        kat2.save();
//        kat3.save();
//        
//        // test update
//        kat2.setKeterangan("Koleksi buku referensi ilmiah");
//        kat2.save();
//        
//        // test delete
//        kat3.delete();
//        
//        // test select all
//        new Kategori().getAll().stream().forEach((k) -> {
//            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
//        });
//        
//        // test search
//        new Kategori().search("ilmiah").stream().forEach((k) -> {
//            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
//        });
//        
//        
//        // Anggota
//        Anggota ang1 = new Anggota("Dawam", "Lumajang", "08765456");
//        Anggota ang2 = new Anggota("Faiza", "Probolinggo", "08765456");
//        Anggota ang3 = new Anggota("Bagus", "Lumajang", "08765456");
//        
//        // test insert
//        ang1.save();
//        ang2.save();
//        ang3.save();
//        
//        // test update
//        ang1.setAlamat("Banyuangi");
//        ang1.save();
//        
//        // test delete
//        ang3.delete();
//        
//        // test select all
//        new Anggota().getAll().stream().forEach((a) -> {
//            System.out.println("Nama: " + a.getNama() + ", Ket: " + a.getAlamat() + ", Telp : " + a.getTelepon());
//        });
//        
//        // test search
//        new Anggota().search("dawam").stream().forEach((a) -> {
//            System.out.println("Nama: " + a.getNama() + ", Ket: " + a.getAlamat() + ", Telp : " + a.getTelepon());
//        });
        
//        // BUKU
//        Kategori novel = new Kategori().getById(1);
//        Kategori referensi = new Kategori().getById(2);
//        
//        Buku buku1 = new Buku(novel, "Timun Mas", "Elex Media", "Bang Supit");
//        Buku buku2 = new Buku(referensi, "Metode Linier", "Springer", "Alex Baldwin");
//        Buku buku3 = new Buku(novel, "Bintang Terang", "Erlangga", "Mat Sewoot");
//        
//        // test insert
//        buku1.save();
//        buku2.save();
//        
//        // test update
//        buku2.setJudul("Aljabar Linier");
//        buku2.save();
//        
//        // test delete
//        buku3.delete();
//        
//        // test select all
//        new Buku().getAll().stream().forEach((b) -> {
//            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
//        });
//        
//        // test search
//        new Buku().search("timun").stream().forEach((b) -> {
//            System.out.println("Kategori: " + b.getKategori().getNama() + ", Judul: " + b.getJudul());
//        });
        
//        Anggota anggota = new Anggota().getById(1);
//        Buku buku = new Buku().getById(2);
//        Date dtPinjam1 = new Date(20211012);
//        Date dtKembali1 = new Date(20211013);
//        Date dtPinjam2 = new Date(20211014);
//        Date dtKembali2 = new Date(20211016);
//        
//        Peminjaman p1 = new Peminjaman(anggota, buku, dtPinjam1, dtKembali1);
//        Peminjaman p2 = new Peminjaman(anggota, buku, dtPinjam2, dtKembali2);
//        
//        p1.save();
//        p2.save();
//        
//        p2.setTanggalPinjam(dtPinjam1);
//        p2.save();
//        
//        p2.delete();
        
        new Peminjaman().getAll().stream().forEach((b) -> {
            System.out.println("Buku: " + b.getBuku().getJudul() + ", Anggota: " + b.getAnggota().getNama() + " Tanggal Pinjam : " + b.getTanggalPinjam() + " Tanggal Kembali : " + b.getTanggalKembali());
        });
    }
}
