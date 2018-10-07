/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117049.latihan40.warnakepribadian;

import java.util.Scanner;
import static pbo2.pkg10117049.latihan40.warnakepribadian.Warna.ANSI_BLUE;
import static pbo2.pkg10117049.latihan40.warnakepribadian.Warna.ANSI_BLUE_BACKGROUND;
import static pbo2.pkg10117049.latihan40.warnakepribadian.Warna.ANSI_CYAN;
import static pbo2.pkg10117049.latihan40.warnakepribadian.Warna.ANSI_GREEN;
import static pbo2.pkg10117049.latihan40.warnakepribadian.Warna.ANSI_GREEN_BACKGROUND;
import static pbo2.pkg10117049.latihan40.warnakepribadian.Warna.ANSI_PURPLE;
import static pbo2.pkg10117049.latihan40.warnakepribadian.Warna.ANSI_PURPLE_BACKGROUND;
import static pbo2.pkg10117049.latihan40.warnakepribadian.Warna.ANSI_RED;
import static pbo2.pkg10117049.latihan40.warnakepribadian.Warna.ANSI_RED_BACKGROUND;
import static pbo2.pkg10117049.latihan40.warnakepribadian.Warna.ANSI_RESET;
import static pbo2.pkg10117049.latihan40.warnakepribadian.Warna.ANSI_WHITE;
import static pbo2.pkg10117049.latihan40.warnakepribadian.Warna.ANSI_YELLOW;
import static pbo2.pkg10117049.latihan40.warnakepribadian.Warna.ANSI_YELLOW_BACKGROUND;

/**
 *
 * @author Gery Akbar Fauzi
 * Nama : Gery Akbar Fauzi 
 * Kelas : PBO2 
 * Nim : 10117049
 * Deskripsi Program : Program ini berisi program untuk mengetest kepribadian
 * seseorang melalui warna pilihannya
 */
public class PBO210117049Latihan40WarnaKepribadian {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Warna warna1 = new Warna();
        Nama nama1 = new Nama();
        Scanner scn = new Scanner(System.in);
        
//        teksnya
        System.out.print(ANSI_RED+"YUK "+ANSI_RESET);
        System.out.print(ANSI_GREEN+"CEK "+ANSI_RESET);
        System.out.print(ANSI_YELLOW+"KEPRIBADIANMU "+ANSI_RESET);
        System.out.print(ANSI_CYAN+"DARI "+ANSI_RESET);
        System.out.print(ANSI_PURPLE+"WARNA "+ANSI_RESET);
        System.out.print(ANSI_BLUE+"FAVORITMU "+ANSI_RESET+"\n");
        
//        teks + backgroundnya
        System.out.print("\n"+ANSI_RED_BACKGROUND+ANSI_WHITE+"\t MERAH \t\t\n"+ANSI_RESET);
        System.out.print(ANSI_GREEN_BACKGROUND+ANSI_WHITE+"\t HIJAU \t\t\n"+ANSI_RESET);
        System.out.print(ANSI_YELLOW_BACKGROUND+ANSI_WHITE+"\t KUNING \t\n"+ANSI_RESET);
        System.out.print(ANSI_BLUE_BACKGROUND+ANSI_WHITE+"\t BIRU \t\t\n"+ANSI_RESET);
        System.out.print(ANSI_PURPLE_BACKGROUND+ANSI_WHITE+"\t UNGU \t\t\n\n"+ANSI_RESET);
        
//        input
        System.out.print("PILIH WARNA FAVORITMU : ");
        warna1.warnamu = scn.next();
        System.out.print("NAMA KAMU : ");
        nama1.namaMu = scn.next();
        
        
      nama1.tampilNama(nama1.namaMu);
      warna1.hasilTest(warna1.warnamu);
        
    }
    
}
