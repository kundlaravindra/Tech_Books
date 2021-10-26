package com.toshiba.files;

import java.io.*;

public class CountFilesInDirectory {
        public static void main(String[] args) {
                File f = new File("E:/Bakup");
                int count = 0;
                for (File file : f.listFiles()) {
                        if (file.isFile()) {
                                count++;
                        }
                }
                System.out.println("Number of files: " + count);
        }
}

//new File("/path/to/folder").listFiles().length,

