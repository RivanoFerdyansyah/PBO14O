/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Produk {
    
    private String id,produk, harga, satuan;
    
    public Produk (){}
    
    public void setKdProduk(String id){
        this.id=id;
    }
    
    public String getKdProduk(){
        return this.id;
    }
    
    public void setNamaProduk(String produk){
        this.produk=produk;
    }
    
    public String getNamaProduk(){
        return this.produk;
    }
    
    public void setHarga(String harga){
        this.harga=harga;
    }
    
    public String getHarga(){
        return this.harga;
    }
    public void setSatuan(String satuan){
        this.satuan=satuan;
    }
    
    public String getSatuan(){
        return this.satuan;
    }
    
}
