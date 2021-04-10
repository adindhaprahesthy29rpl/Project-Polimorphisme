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
public class ProjectBaru1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Object
        Toko objek1 = new Toko(); // Objek untuk memanggil class Toko
        SmartPhone objek2 = new SmartPhone(); // Objek untuk memanggil class SmartPhone
        TV objek3 = new TV(); // Objek untuk memanggil class TV
        KipasAngin objek4 = new KipasAngin(); // Objek untuk memanggil class KipasAngin
        Toko obj1 = new SmartPhone(); // Objek untuk memanggil class SmartPhone sebagai sub class dari Toko
        Toko obj2 = new TV(); // Objek untuk memanggil class TV sebagai sub class dari Toko
        Toko obj3 = new KipasAngin(); // Objek untuk memanggil class KipasAngin sebagai sub class dari Toko
           
        // Untuk menjalankan method
        objek1.setAdmin("Adin");
        objek1.getAdmin();
        
        objek2.display();
        objek2.setHarga(4350000); //Nilai
        objek2.setTotal(3); //Nilai
        objek2.setMerk("Oppo"); //Nilai
        objek2.setJumlahKamera(4); //Nilai
        objek2.getHarga();
        objek2.getTotal();
        objek2.getMerk();
        objek2.getJumlahKamera();

        objek3.display();
        objek3.setHarga(3100000); //Nilai
        objek3.setTotal(4); //Nilai
        objek3.setMerk("Polytron"); //Nilai
        objek3.setJenis("LED"); //Nilai
        objek3.getHarga();
        objek3.getTotal();
        objek3.getMerk();
        objek3.getJenis();
      
        objek4.display();
        objek4.setHarga(250000); //Nilai
        objek4.setTotal(2); //Nilai
        objek4.setMerk("Cosmos"); //Nilai
        objek4.setUkuran("16 inchi"); //Nilai
        objek4.getHarga();
        objek4.getTotal();
        objek4.getMerk();
        objek4.getUkuran();

    }
    
}
