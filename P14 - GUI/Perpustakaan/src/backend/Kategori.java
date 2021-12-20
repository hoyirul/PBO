/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author mochammadhairullah
 */
import java.util.ArrayList;
import java.sql.*;

public class Kategori {
    private int idKategori;
    private String nama;
    private String keterangan;
    
    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
    
    public String getKeterangan() {
        return keterangan;
    }
    
    public void setIdkategori(int idkategori) {
        this.idKategori = idkategori;
    }
    
    public int getIdkategori() {
        return idKategori;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    
    public String toString(){
        return nama;
    }
    public Kategori(){
        
    }
    public Kategori(String nama, String keterangan){
        this.nama = nama;
        this.keterangan = keterangan;
    }
    public Kategori getById(int id){
        Kategori kat = new Kategori();
        ResultSet rs = DBHelper.selectQuery("Select * FROM kategori"
                                            +" WHERE idKategori = '" + id + "'");
        
        try
        {
            while(rs.next())
            {
                kat = new Kategori();
                kat.setIdkategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        return kat;
    }
    public ArrayList<Kategori> getAll(){
    ArrayList<Kategori> ListKategori =  new ArrayList();
    ResultSet rs = DBHelper.selectQuery("SELECT * FROM kategori");
    
    try{
            while(rs.next()){
                Kategori kat = new Kategori();
                kat.setIdkategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
            
                ListKategori.add(kat);
            }
        }
        catch (Exception e){
        e.printStackTrace();
    }
        return ListKategori;
    }
    public ArrayList<Kategori> search(String keyword){
        ArrayList<Kategori> ListKategori = new ArrayList();

        String sql = "SELECT * FROM kategori WHERE "
                    +"      nama LIKE '%"+keyword+"%'"
                    +"      OR keterangan LIKE '%"+keyword+"%'";

        ResultSet rs = DBHelper.selectQuery(sql);

        try{
                while(rs.next()){
                    Kategori kat = new Kategori();
                    kat.setIdkategori(rs.getInt("idkategori"));
                    kat.setNama(rs.getString("nama"));
                    kat.setKeterangan(rs.getString("keterangan"));

                    ListKategori.add(kat);
                }
            }
            catch (Exception e){
            e.printStackTrace();
    }
            return ListKategori;
        }
    public void save(){
        if(getById(idKategori).getIdkategori()==0){
            String SQL = "INSERT INTO kategori (nama, keterangan) VALUES("
                    +"     '" + this.nama + "', "
                    +"     '" + this.keterangan + "'"
                    +"     )";
            this.idKategori = DBHelper.insertQueryGetId(SQL);
        }
        else{
            String SQL = "UPDATE kategori SET"
                    + "     nama= '"+this.nama+"', "
                    + "     keterangan= '"+this.keterangan+"' "
                    + "     WHERE idkategori= '"+this.idKategori+"' ";
            DBHelper.executeQuery(SQL);
        }
    }
    public void delete(){
        String SQL = "DELETE FROM kategori WHERE idkategori = '"+this.idKategori+"'";
        DBHelper.executeQuery(SQL);
    }

    Kategori getIdkategori(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
