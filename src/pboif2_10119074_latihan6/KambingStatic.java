/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2_10119074_latihan6;

/**
 *
 * @author Acer
 * NAMA     : Handrian Rivaldi
 * KELAS    : PBOIF2
 * NIM      : 10119074
 * Deskrifsi : Kambing ststic & komstanta
 */

public class KambingStatic {

//NAMA_KAMBING sebagai Konstanta
  public static final String NAMA_KAMBING = "MIDUN";
  
  public static void main(String[] args) {
       Mamalia.jumlahKambing = 485000;
       System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " 
                            + Mamalia.jumlahKambing);
    }
    
}
