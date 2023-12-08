/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab3bahanajar;

/**
 *
 * @author RYZEN
 */
public class main {
//        public static void main(String[] args) {
//        lingkaran lingkaran = new lingkaran();
//        tabung tabung = new tabung();
//        System.out.println("lingkaran adalah instance dari Lingkaran => " + (lingkaran instanceof lingkaran));
//        System.out.println("lingkaran adalah instance dari Tabung => " + (lingkaran instanceof tabung));
//        System.out.println("tabung adalah instance dari Lingkaran =>" + (tabung instanceof lingkaran));
//        System.out.println("tabung adalah instance dari Tabung =>" + (tabung instanceof tabung));

//}
    
    
    
//        public static void main(String[] args) {
//        lingkaran lkr = new lingkaran(); // memanggil constructor
//
//        lkr.Deskripsi();
//        System.out.println("Hasilnya adalah :" + lkr.luasLingkaran());
//        System.out.println("======================================");
//        tabung tbg = new tabung();
//        tbg.Keterangan();
//        System.out.println("volumenya adalah :" + tbg.volumeTabung());
//
//    }
    
    
    public static void main(String[] args) {
        lingkaran lkr = new lingkaran(7);
        lkr.deskripsi();
        System.out.println("hasilnya adalah :"+lkr.hitluaslingkaran());
        tabung tbg = new tabung (7,20);
        tbg.Keterangan();
        System.out.println("volumenya adalah :"+tbg.hitvolumeTabung());
    }

}