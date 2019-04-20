package data_structure_java;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class FileOperation {
    public static boolean readFile(String filename, ArrayList<String> words){
        if(filename == null || words == null){
            System.out.println("filename is null or words is null");
            return false;
        }
        Scanner scanner;

        try{
            File file = new File(filename);
            if(file.exists()){
                FileInputStream fis = new FileInputStream(file);
                scanner = new Scanner(new BufferedInputStream(fis),"UTF-8");
                scanner.useLocale(Locale.ENGLISH);
            }else{
                return false;
            }
        }catch (IOException ioe){
            System.out.println("Cannot open " + filename);
            return false;
        }

        if(scanner.hasNextLine()){
            String contens = scanner.useDelimiter("\\A").next();
            int start = firstCharacterIndex(contens,0);
            for (int i = start+1; i <= contens.length() ; i++) {
                if(i == contens.length() || !Character.isLetter(contens.charAt(i))){
                    String word = contens.substring(start,i).toLowerCase();
                    words.add(word);
                    start = firstCharacterIndex(contens,i);
                    i = start + 1;
                }else {
                    i++;
                }
            }
        }
        return true;
    }
    private static int firstCharacterIndex(String s,int start){
        for (int i = start; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i)))return i;
        }
        return s.length();
    }
}
