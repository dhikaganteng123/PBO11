import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\komputer 35\\Documents\\dhikasaja\\students.csv";
        String line;
        String csvSplitBy = ",";
        int indexs = 0;
        System.out.println("NIM, NAMA, UMUR, PRODI");
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                indexs++;
                if(indexs>1){
                    String[] student = line.split(csvSplitBy);
                    System.out.println(student[0] + ", " + student[1] + ", " + student[2] + ", " + student[3]);
                }
            }System.out.println("Jumlah Baris :" + indexs);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}