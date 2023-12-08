/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab3bahanajar;

/**
 *
 * @author RYZEN
 */
public class lingkaran {
    
//        double jariJari,tinggi;
//        
//    public lingkaran(){
//        this.jariJari=7;
//        //this.tinggi = 20;
//    }
//    public double hitungLuas() {
//        return 3.14 * jariJari * jariJari;
//    }

    
    
//        //attribut
//    int r;
//    double phi,luas;
//    
//    //construtor
//    public lingkaran(){
//        r = 7;
//        phi = 3.14;
//    }
//    //method
//    void Deskripsi(){
//        System.out.println("Ini adalah hasil menghitung");
//    }
//    //method untuk menghitung luas
//    double luasLingkaran(){
//    //L = πr2
//        luas=(phi*r*r);
//        return luas; 
//    }
    
    
    int r;
    double phi, luas;
    
    public lingkaran(int r){
        this.r=r;
        phi=3.14;
    }
    void deskripsi(){
        System.out.println("ini adalah hasil menghitung ");
    }
    double hitluaslingkaran(){
        luas=(phi*r*r);
           return luas;     
    }
}


