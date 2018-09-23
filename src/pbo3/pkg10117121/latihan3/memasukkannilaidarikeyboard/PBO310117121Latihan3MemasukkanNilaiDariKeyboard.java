/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117121.latihan3.memasukkannilaidarikeyboard;

import java.util.Scanner;

/**
 *
 * @author CHEEKIBREEKIIVDAMKE
 *NAMA                 : M Rifqi S M
 *KELAS                : PBO-3 
 *NIM                  : 10117121
 *Program Deskripsi    : Program ini berisi program menampilkan nilai dari 
 * keyboard
 */
public class PBO310117121Latihan3MemasukkanNilaiDariKeyboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Masukkan nama anda: ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah " +nama);
    }
    
}
