package Class08;

import java.io.*;

public class Class08 {
    public static void main(String[] args) throws IOException {

        FileReader fra = new FileReader("Class08/aaa.txt");
        BufferedReader bra = new BufferedReader(fra);

        FileReader frb = new FileReader("Class08/bbb.txt");
        BufferedReader brb = new BufferedReader(frb);

        String str;
        String str_all = "";
        System.out.print("txt content is \n");

        while ((str = bra.readLine()) != null) {
            str_all += str + "\r\n";
        }

        while ((str = brb.readLine()) != null) {
            str_all += str;
        }

        System.out.println(str_all);

        FileWriter fw = new FileWriter("Class08/ccc.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(str_all);
        bw.flush();
    }
}