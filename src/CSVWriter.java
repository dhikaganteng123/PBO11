/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVWriter {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\komputer 35\\Documents\\dhikasaja\\new_students.csv";
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah data yang akan ditambahkan: ");
        int numberOfEntries = scanner.nextInt();
        scanner.nextLine(); 
        
        
        String[] data = new String[numberOfEntries];
        for (int i = 0; i < numberOfEntries; i++) {
            System.out.println("Masukkan data untuk mahasiswa ke-" + (i + 1) + " (format: NIM,NAMA,UMUR): ");
            data[i] = scanner.nextLine();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {
            for (String line : data) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}