/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import Data.Kendaraan;

/**
 *
 * @author userl
 */
public class ImpTransportasi implements Transportasi{
    Kendaraan kd=new Kendaraan();

    @Override
    public void insert() {
        kd.setJenis("Roda Dua");
        kd.setMerek("ninja H2R");
        kd.setFeul("PERTAMAK TURBO");
    }

    @Override
    public void tampil() {
        System.out.println("Jenis Kendaraan = " + kd.getJenis());
        System.out.println("Merek Kendaraan = " + kd.getMerek());
        System.out.println("BBM yang digunakan = " + kd.getFeul());
    }
    
}
