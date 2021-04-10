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
public class Toko {
    
    //Variabel Instance
    private String admin;
    public int harga;
    public int totalUnit;
    public String merk;
    
    //Method untuk display
    //Menerapkan override
    public void display(){
        System.out.println("Data Barang Yang di Entry : ");
    }
    
    //Method set admin
    public void setAdmin(String admin){
        this.admin = admin;
    }
    
    //Method get admin
    public String getAdmin(){
        System.out.println("Admin : "+admin);
        return admin;
    }
}
