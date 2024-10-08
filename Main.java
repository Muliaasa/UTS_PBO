/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_pbo;

import java.util.Scanner;




/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pilih kecepatan maksimal:");
        System.out.println("1.Mobil Sepeda Motor");
        System.out.println("2. Sepeda motor");
        System.out.println("2. Truk");
        
        System.out.print("Masukkan pilihan Anda (1 atau 2 atau 3): ");
        int pilihan = scanner.nextInt();
        
        Kendaraan kendaraan = null;
        
       if (pilihan == 1) {
            Mobil Kendaraan = new Mobil();
        } if (pilihan == 2) {
            Motor Pembayaran = new Motor();
            }else if (pilihan == 3) {
            Truk Kendaraan = new Truk();
        } else {
            System.out.println("kecepatan maksimal.");
            return;
        }
 
        kendaraan.MaximumSpeed();
     
             
        scanner.close();
        }
    }