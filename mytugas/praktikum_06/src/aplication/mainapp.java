/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplication;

import Data.Karyawan;
import Data.Perusahaan;
import Data.Kendaraan;
import util.ImpTransportasi;

/**
 *
 * @author userl
 */
public class mainapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        var p=new Perusahaan();
        p.name="MAKMUR";
        p.bidang_usaha="PERTAMBANGAN";
        System.out.println("NAMA PERUSAHAAN = " + p.name);
        System.out.println("BIDANG USAHA = " + p.bidang_usaha);
        
        System.out.println("============Data Karyawan============");
        var k=new Karyawan();
        k.setId(1945);
        k.setName("M.MULAIMI");
        k.setAlamat("Praya, Lombok Tengah");
        System.out.println("ID = " + k.getId());
        System.out.println("Nama = " + k.getName());
        System.out.println("Alamat = " + k.getAlamat());
        
        System.out.println("============Jabatan Pegawai============");
        Perusahaan.Jabatan j=p.new Jabatan();
        j.setJbt_karyawan("DIREKTUR");
        j.setBidang("MENGOORDINASIKAN");
        System.out.println("Jabatan = " + j.getJbt_karyawan());
        System.out.println("Bidang Pekerjaan = " + j.getBidang());
        
        System.out.println("============Alat Transportasi============");
        var trans=new ImpTransportasi();
        trans.insert();
        trans.tampil();
    }
    
}
