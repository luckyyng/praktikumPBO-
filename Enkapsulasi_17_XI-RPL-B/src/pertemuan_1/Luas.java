package pertemuan_1;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LUCKY
 */
public class Luas {
    private int panjang;
    private int lebar;
    private int tinggi;
    private int luas;
    
    public void luas(){
        Scanner input=new Scanner(System.in);
        System.out.println("Panjang Persegi Panjang : ");
        int panjang = input.nextInt();
        System.out.println("Lebar Persegi Panjang : ");
        int lebar = input.nextInt();
        luas =panjang*lebar;
        System.out.println("Luas balok : " + luas);
    }
}
