/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01.besty;

/**
 *
 * @author Mamed
 */
public class mawaraksi {
    public static void main(String[] args) {
        
    
    
    Bunga A = new Bunga();
    Bunga B = new Bunga();
    Bunga C = new Bunga();  
    
    A.warna ="Merah";
    A.daun ="Keriting";
    A.batang ="Berduri";
    A.aroma ="Segar";
    A.jenis ="Mister_Lincoln";
    
    B.warna ="putih";
    B.daun ="Keriting";
    B.batang ="Berduri";
    B.aroma ="Segar";
    B.jenis ="Mawar iceberg";
    
    C.warna ="kuning";
    C.daun ="Keriting";
    C.batang ="Berduri";
    C.aroma ="Segar";
    C.jenis ="Graham_thomas";
    
        A.cetakInfo();
        System.out.println();
        B.cetakInfo();
        System.out.println();
        C.cetakInfo();
}
}