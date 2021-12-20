/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author mochammadhairullah
 */
import java.sql.*;
import java.util.ArrayList;
public class Peminjaman {
    private int idpeminjaman;
    private Anggota anggota = new Anggota();
    private Buku buku = new Buku();
    private Date tanggalPinjam;
    private Date tanggalKembali;
    
    public int getIdpeminjaman() {
        return idpeminjaman;
    }
    public void setIdpeminjaman(int idpeminjaman) {
        this.idpeminjaman = idpeminjaman;
    }
    public Anggota getAnggota() {
        return anggota;
    }
    public void setAnggota(Anggota anggota) {
        this.anggota = anggota;
    }
    public Buku getBuku() {
        return buku;
    }
    public void setBuku(Buku buku) {
        this.buku = buku;
    }
    public Date getTanggalPinjam() {
        return tanggalPinjam;
    }
    public void setTanggalPinjam(Date tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }
    public Date getTanggalKembali() {
        return tanggalKembali;
    }
    public void setTanggalKembali(Date tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }
    public Peminjaman() {}
    public Peminjaman(Anggota anggota, Buku buku, Date tanggalPinjam, Date tanggalKembali) {
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }
    public Peminjaman getById(int id){
        Peminjaman peminjaman = new Peminjaman();
        ResultSet rs = DBHelper.selectQuery("SELECT"
                                    + " p.idpeminjaman AS idpeminjaman,"
                                    + " p.tanggalpinjam AS tanggalpinjam,"
                                    + " p.tanggalkembali AS tanggalkembali,"
                                    + " a.idanggota AS idanggota,"
                                    + " a.nama AS nama,"
                                    + " b.idbuku AS idbuku,"
                                    + " b.judul AS judul"
                                    + " FROM peminjaman p"
                                    + " INNER JOIN anggota a ON p.idanggota = a.idanggota"
                                    + " INNER JOIN buku b ON p.idbuku = b.idbuku"
                                    + " WHERE p.idpeminjaman = '"+id+"'");
        try {
            while(rs.next()){
                peminjaman = new Peminjaman();
                peminjaman.setIdpeminjaman(rs.getInt("idpeminjaman"));
                peminjaman.getAnggota().setIdAnggota(rs.getInt("idanggota"));
                peminjaman.getAnggota().setNama(rs.getString("nama"));
                peminjaman.getBuku().setIdBuku(rs.getInt("idbuku"));
                peminjaman.getBuku().setJudul(rs.getString("judul"));
                peminjaman.setTanggalKembali(rs.getDate("tanggalkembali"));
                peminjaman.setTanggalPinjam(rs.getDate("tanggalpinjam"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return peminjaman;
    }

    public ArrayList<Peminjaman> getAll(){
        ArrayList<Peminjaman> ListPeminjaman = new ArrayList();

        ResultSet rs = DBHelper.selectQuery("SELECT"
                                    + " p.idpeminjaman AS idpeminjaman,"
                                    + " p.tanggalpinjam AS tanggalpinjam,"
                                    + " p.tanggalkembali AS tanggalkembali,"
                                    + " a.idanggota AS idanggota,"
                                    + " a.nama AS nama,"
                                    + " b.idbuku AS idbuku,"
                                    + " b.judul AS judul"
                                    + " FROM peminjaman p"
                                    + " INNER JOIN anggota a ON p.idanggota = a.idanggota"
                                    + " INNER JOIN buku b ON p.idbuku = b.idbuku");

        try {
            while(rs.next()){
                Peminjaman peminjaman = new Peminjaman();
                peminjaman.setIdpeminjaman(rs.getInt("idpeminjaman"));
                peminjaman.getAnggota().setIdAnggota(rs.getInt("idanggota"));
                peminjaman.getAnggota().setNama(rs.getString("nama"));
                peminjaman.getBuku().setIdBuku(rs.getInt("idbuku"));
                peminjaman.getBuku().setJudul(rs.getString("judul"));
                peminjaman.setTanggalKembali(rs.getDate("tanggalkembali"));
                peminjaman.setTanggalPinjam(rs.getDate("tanggalpinjam"));

                ListPeminjaman.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListPeminjaman;
    }

    public ArrayList<Peminjaman> search(String keyword){
        ArrayList<Peminjaman> ListPeminjaman = new ArrayList();

        ResultSet rs = DBHelper.selectQuery("SELECT"
                                    + " p.idpeminjaman AS idpeminjaman,"
                                    + " p.tanggalpinjam AS tanggalpinjam,"
                                    + " p.tanggalkembali AS tanggalkembali,"
                                    + " a.idanggota AS idanggota,"
                                    + " a.nama AS nama,"
                                    + " b.idbuku AS idbuku,"
                                    + " b.judul AS judul"
                                    + " FROM peminjaman p"
                                    + " INNER JOIN anggota a ON p.idanggota = a.idanggota"
                                    + " INNER JOIN buku b ON p.idbuku = b.idbuku"
                                    + " WHERE a.nama LIKE '%"+keyword+"%'"
                                    + " OR b.judul LIKE '%"+keyword+"%'");

        try {
            while(rs.next()){
                Peminjaman peminjaman = new Peminjaman();
                peminjaman.setIdpeminjaman(rs.getInt("idpeminjaman"));
                peminjaman.getAnggota().setIdAnggota(rs.getInt("idanggota"));
                peminjaman.getAnggota().setNama(rs.getString("nama"));
                peminjaman.getBuku().setIdBuku(rs.getInt("idbuku"));
                peminjaman.getBuku().setJudul(rs.getString("judul"));
                peminjaman.setTanggalKembali(rs.getDate("tanggalkembali"));
                peminjaman.setTanggalPinjam(rs.getDate("tanggalpinjam"));

                ListPeminjaman.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListPeminjaman;
    }

    public void save(){
        int empty = 0;
        if(getById(idpeminjaman).getIdpeminjaman() == 0){
        String SQL = "INSERT INTO peminjaman VALUES ("
                        + " '"+ empty +"', "
                        + " '"+this.getAnggota().getIdAnggota()+"',"
                        + " '"+this.getBuku().getIdBuku()+"',"
                        + " '"+this.getTanggalPinjam()+"',"
                        + " '"+this.getTanggalKembali()+"'"
                        + " )";
        this.idpeminjaman = DBHelper.insertQueryGetId(SQL);
        }else{
        String SQL = "UPDATE peminjaman SET"
                    + " idanggota = '"+this.getAnggota().getIdAnggota()+"',"
                    + " idbuku = '"+this.getBuku().getIdBuku()+"',"
                    + " tanggalpinjam = '"+this.getTanggalPinjam()+"',"
                    + " tanggalkembali = '"+this.getTanggalKembali()+"'"
                    + " WHERE idpeminjaman = '"+this.idpeminjaman+"'";
        DBHelper.executeQuery(SQL);
        }
    }

    public void delete(){
        String SQL = "DELETE FROM peminjaman WHERE idpeminjaman = '"+this.idpeminjaman+"'";
        DBHelper.executeQuery(SQL);
    }
}
