package com.java.lambda;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLambda {
    public static void main(String[] args) {

        /*FileFilter fileFilter = new FileFilter() {
            public boolean accept(File fileName) {
                return fileName.getName().endsWith(".java");
            }
        };*/

        FileFilter fileFilter = (File fileName) -> fileName.getName().endsWith(".java");
        File dir = new File("C:\\Users\\Dallps\\Documents\\SourceTree\\corejava\\java8\\src\\main\\java\\com\\java\\defaultmethod");
        File[] javaFiles = dir.listFiles(fileFilter);

        for(File f:javaFiles){
            System.out.println(f);
        }
    }
}
