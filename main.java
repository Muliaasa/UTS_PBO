/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SoalNo3;

import java.util.Scanner;



/**
 *
 * @author DELL
 */
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pilih validasi pembayaran:");
        System.out.println("1.KartuKredit");
        System.out.println("2. dompetDigital");
        System.out.println("2. transferBank");
        
        System.out.print("Masukkan pilihan Anda (1 atau 2 atau 3): ");
        int pilihan = scanner.nextInt();
        
        Pembayaran pembayaran = new Pembayaran();
        
        if (pilihan == 1) {
            KartuKredit Pembayaran = new KartuKredit();
        } if (pilihan == 2) {
            dompetDigital Pembayaran = new dompetDigital();
            }else if (pilihan == 3) {
            transferBank Pembayaran = new transferBank();
        } else {
            System.out.println("Pilihan tidak valid.");
            return;
        }
 
        pembayaran.validationPayment();
        
        scanner.close();
        }
    }
    

