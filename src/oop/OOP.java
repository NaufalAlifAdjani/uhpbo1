/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.Scanner;

/**
 *
 * @author SENJU
 */
public class OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int pilih;
        
        System.out.println("==============");
        System.out.println("SELAMAT DATANG");
        System.out.println("==============");
        System.out.println("pilih salah satu nomor untuk mengecek kelulusan");
        System.out.println("1. produktif");
        System.out.println("2. matematika");
        System.out.println("3. dasar desain grafis");
        System.out.println("==============");
        System.out.print("anda memilih no : ");
        pilih = input.nextInt();
        
        switch (pilih){
            case (1):
                nilai produktif = new nilai();
                produktif.user();
                break;
            case (2):
                mtk angka = new mtk();
                angka.nilai();
                break;
            case (3):
                ddg nil = new ddg();
                nil.nilai();
                break;
        }
        
    }
    
}
