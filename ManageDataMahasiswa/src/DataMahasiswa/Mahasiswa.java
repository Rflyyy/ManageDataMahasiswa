/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataMahasiswa;
import java.util.Scanner;

/**
 *
 * @author Rafli
 */
public class Mahasiswa {
    public static String lulus(String tahunLulus){
     if("18".equals(tahunLulus)){
         return"2022";
        }else if("19".equals(tahunLulus)){
            return"2023";
        }else if("20".equals(tahunLulus)){
            return"2024";
        }else if("21".equals(tahunLulus)){
            return"2025";
        }
        return tahunLulus;
    }
        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int jumlah = input.nextInt();input.nextLine();
        //Perulangan
        for(int i=0;i<jumlah;i++){
        
        String nama = input.nextLine();
        String gender = input.nextLine();
        String nim = input.nextLine();
        String tahunLulus=nim.substring(0,2);
        System.out.printf("%-13s %s %s%n","Nama",":",nama);
        System.out.printf("%-13s %s %s%n","Jenis Kelamin",":",gender);
        System.out.printf("%-13s %s %s%n","NIM",":",nim);
        System.out.printf("%-13s %s %n","Tahun Lulus",": "+lulus(tahunLulus));
        System.out.println();
        }
    }
}

    
    

