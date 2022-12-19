package Class09;

import java.io.*;

public class Class09 {
    public static void main(String[] args) throws IOException {

        FileReader fra = new FileReader("Class08/aaa.txt");
        BufferedReader bra = new BufferedReader(fra);

        FileReader frb = new FileReader("Class08/bbb.txt");
        BufferedReader brb = new BufferedReader(frb);

        FileReader frc = new FileReader("Class08/ccc.txt");
        BufferedReader brc = new BufferedReader(frc);

        while (bra.ready())
            System.out.println(bra.readLine());
        while (brb.ready())
            System.out.println(brb.readLine());
        while (brc.ready())
            System.out.println(brc.readLine());

    }
}