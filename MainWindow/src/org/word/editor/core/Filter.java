/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.word.editor.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Dell
 */
public class Filter implements FileFilter {

    String ext;
    String[] text;

    Filter(String typeOfFile, String textString) {
        int i = typeOfFile.lastIndexOf('.');
        this.ext = typeOfFile.substring(i + 1);
        int count = 0;
        for (int j = 0; j < textString.length(); j++) {
            if (textString.charAt(j) == '\n') {
                count++;
            }
        }
        this.text = new String[count + 1];
        int k = 0;
        for (int j = 0; j < text.length; j++) {
            StringBuilder sb = new StringBuilder();
            while (textString.length() > k && textString.charAt(k) != '\n') {
                sb.append(textString.charAt(k));
                k++;
            }
            text[j] = sb.toString();
            k++;
        }
    }

    private String getExtension(File pathname) {
        String filename = pathname.getPath();
        int i = filename.lastIndexOf('.');
        if ((i > 0) && (i < filename.length() - 1)) {
            return filename.substring(i + 1);
        }
        return "";
    }

    public boolean fileContainsText(File file) {
        boolean contains = false;
        try {
            FileInputStream fis = new FileInputStream(file);
            BufferedReader input = new BufferedReader(new InputStreamReader(fis, "UTF-8"));
            String s = null;
            int count = 0;
            while (true) {
                s = input.readLine();
                if (s == null) {
                    break;
                }
                for (int i = 0; i < text.length; i++) {
                    if (s.contains(text[i])) {
                        count++;
                        break;
                    }
                }
            }
            input.close();
            if (count == text.length) {
                contains = true;
            }
        } catch (IOException ex) {
            System.out.println(ex.toString());
            System.exit(0);
        }
        return contains;
    }

    @Override
    public boolean accept(File pathname) {
        if (!pathname.isFile()) {
            return false;
        }
        String extension = getExtension(pathname);
        return (ext.equals(extension) && fileContainsText(pathname));
    }

}
