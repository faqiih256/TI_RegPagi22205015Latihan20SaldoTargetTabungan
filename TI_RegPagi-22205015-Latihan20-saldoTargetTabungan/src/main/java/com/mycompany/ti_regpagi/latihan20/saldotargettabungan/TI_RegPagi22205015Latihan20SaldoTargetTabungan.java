/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ti_regpagi.latihan20.saldotargettabungan;

import java.util.Scanner;

/**
 * Nama         : Ahmad Nurfaqih
 * Nim          : 22205015
 * prodi        : Teknik Informatia
 * Deskripsi    : Program ini berisi tentang target saldo tabungan
 * @author 62895
 */
public class TI_RegPagi22205015Latihan20SaldoTargetTabungan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("===LATIHAN 20===");
        int bulan = 0;
        
        
        System.out.print("Masukan saldo awal anda: ");
        int saldoawal = scanner.nextInt();
        System.out.print("bunga (%): ");
        int bunga = scanner.nextInt();
        System.out.print("Saldo target: ");
        int saldotarget = scanner.nextInt();
        
        while (saldoawal < saldotarget) {
            bulan++;
            int bungaPer= saldoawal * bunga/100;
            saldoawal += bungaPer;
            System.out.println("Saldo di bulan ke-" + bulan +"= Rp." +saldoawal);
            
        }
    }
}
