package day32exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ETekrar {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("src/main/java/day32exceptions/file.02");
        int k=0;
        while ((k=fis.read())!=-1){
            System.out.print((char) k);


        }


//        FileInputStream fis = new FileInputStream("src/main/java/day32exceptions/file.txt01");
//       int k =0;
//       while ((k=fis.read())!=-1){
//           System.out.print((char) k);
       }
    }

