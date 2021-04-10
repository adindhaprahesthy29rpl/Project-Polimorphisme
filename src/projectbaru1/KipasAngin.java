/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbaru1;

/**
 *
 * @author MOKLET-2
 */
// Sub class atau class Anak
// Class KipasAngin sebagai sub class dari Toko
public class KipasAngin extends Toko {
    
    //Variabel Instance
    String ukuran;
    
    //Method set untuk harga
    public void setHarga(int harga){
        super.harga = harga;
    }
    
    //Method get untuk harga
    public float getHarga(){
        System.out.println("Harga : "+harga);
        return harga;
    }
    
    //Method set untuk total
    public void setTotal(int totalUnit){
        super.totalUnit = totalUnit;
    }
    
    //Method get untuk total
    public float getTotal(){
        System.out.println("Total Unit : "+totalUnit);
        return totalUnit;
    }
    
    //Method set untuk merk
    public void setMerk(String merk){
        super.merk = merk;
    }
    
    //Method get untuk merk
    public String getMerk(){
        System.out.println("Merk : "+merk);
        return merk;
    }
    
    //Method set untuk ukuran
    public void setUkuran(String ukuran){
        this.ukuran = ukuran;
    }
    
    //Method get untuk ukuran
    public String getUkuran(){
        System.out.println("Ukuran : "+ukuran);
        return ukuran;
    }
    
    //Menerapkan override
    @Override
    public void display(){
        System.out.println("Data Barang Yang di Entry : ");
    }
}
