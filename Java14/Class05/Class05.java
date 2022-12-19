package Class05;

import java.io.*;
import java.util.Scanner;

class Class05 {
    public static void main(String argv[]) throws IOException {
        FileReader fr = new FileReader("Class05/donkey.txt");
        BufferedReader br = new BufferedReader(fr);
        int word_sm = 0;
        int flag = 0;
        while (br.ready()) {
            String tmp = br.readLine();
            if (flag == 1) {
                word_sm += tmp.length();
            }
            flag = 1;
        }
        System.out.println(word_sm);
    }
}