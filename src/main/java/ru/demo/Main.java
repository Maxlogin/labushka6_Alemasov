package ru.demo;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        try{
            File file = new File("C:\\Users\\vfgkc\\Documents\\IDEA\\joski_pon/PDIDDY.pdf");
            PDFTextStripper stripper = new PDFTextStripper();
            PDDocument dock = PDDocument.load(file);
            String text = stripper.getText(dock);
            dock.close();
            System.out.println(text);
        }
        catch(Exception e){
            System.out.println(e.getMessage());

        }

    }
}