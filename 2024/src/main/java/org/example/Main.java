package org.example;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "./src/main/java/org/example/sample.txt";
        File f = new File(fileName);
//        if(f.createNewFile()){
//            System.out.println("File created");
//        }

        BufferedWriter bf = new BufferedWriter(new FileWriter(fileName, true));
        bf.newLine();
        bf.write("New file 1st line");
        bf.close();

        //ystem.out.println("Hello world!");
        Scanner sc = new Scanner(f);
        while(sc.hasNext()){
            System.out.println(sc.nextLine());
        }

    }
}