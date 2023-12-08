/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab3bahanajar;

/**
 *
 * @author RYZEN
 */
public class tabung extends lingkaran{
//    
//    double tinggi;
//    
//        public tabung() {
//            this.tinggi=10;
//        //super();
//    }
//    public double hitungVolume() {
//        return hitungLuas() * tinggi;
//    }

    
    
    
//    int t;
//    double volume,luasPermukaan;
//
//    public tabung(){
//        super();     
//        t=20;
//    }
//    void Keterangan(){
//        Deskripsi();
//        System.out.println("mengitung Volume Tabung");
//    }
//    double volumeTabung(){
//    //π x r2 x t.
//       volume = (luasLingkaran()*t);
//       return volume;
//    }
    
    

    int t;
    double volume,luasPermukaan;

    public tabung(int r, int t){
        super(r);     
        this.t=t;
    }
    void Keterangan(){
        deskripsi();
        System.out.println("mengitung Volume Tabung");
    }
    double hitvolumeTabung(){
       volume = (hitluaslingkaran()*t);
       return volume;
    }
}
