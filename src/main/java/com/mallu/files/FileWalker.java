package com.mallu.files;

/**
 * Created by golagem on 11/9/17.
 */

import java.io.File;

public class FileWalker {
    public void walk(String path) {
        File root = new File(path);
        File[] list = root.listFiles();
        if (list == null) return;
        for (File f : list) {
            if (f.isDirectory()) {
                walk(f.getAbsolutePath());
                System.out.println("Dir:" + f.getAbsoluteFile());
            } else {
                System.out.println("File:" + f.getAbsoluteFile());
            }
        }
    }

    public static void main(String[] args) {
        FileWalker fw = new FileWalker();
        fw.walk("/Users/golagem/github/html-parsing/src/main/java/com/mallu");
    }

}
