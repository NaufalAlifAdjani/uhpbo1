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
public class nilai {
    void user(){
        Scanner input = new Scanner (System.in);
        String nama;
        int nilai;
        System.out.println("==========================");
        System.out.println("KETERANGAN NILAI PRODUKTIF");
        System.out.println("==========================");
        System.out.print("Nama : ");
        nama = input.nextLine();
        
        System.out.print("Nilai : ");
        nilai = input.nextInt();
        
        
        if(nilai > 70){
            System.out.println("selamat anda lulus");
        }else if(nilai <= 70){
            System.out.println("selamat anda tidak lulus");
        }
    }
}
