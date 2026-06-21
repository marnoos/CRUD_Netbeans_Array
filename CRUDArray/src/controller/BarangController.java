/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Barang;
import java.util.ArrayList;
import java.util.List;

public class BarangController {
    //
    private List<Barang> listBarang =new ArrayList<>();
    
    public void tambah(Barang b){
     //  String sql ="insert into barang (kode, nama, harga) values (?,?,?)";
        listBarang.add(b);
    }
    
    public List<Barang> tampilkanSemua(){
        return listBarang;
    }
    
    public boolean ubah (String kode, String namaBaru, double hargaBaru){
        for (Barang b : listBarang){
            if (b.getKode().equals(kode)){
                b.setNama(namaBaru);
                b.setHarga(hargaBaru);
                return true;
            }
        }
        return false;
    }
    
    public boolean hapus(String kode){
        return listBarang.removeIf(b -> b.getKode().equals(kode));
    }
}
