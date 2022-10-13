/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_1;

/**
 *
 * @author LUCKY
 */
public class Siswa {
        private String nama;
        private int nilai;
        private String kelas;
        private int absen;
        private String jenisk;
        
        public void isiData(){
            nama = "Lucky";
            absen = 17;
            kelas = "XI RPL B";
            jenisk = "Laki-Laki";
            nilai = 90;
        }
        
        public void cetak(){
            System.out.println("Nama          : " + nama);
            System.out.println("No. Absen     : " + absen);
            System.out.println("Kelas         : " + kelas);
            System.out.println("Jenis Kelamin : " + jenisk);
            System.out.println("Nilai         : " + nilai);
        }
    }

