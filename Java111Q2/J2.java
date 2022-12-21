import java.io.*;

public class J2 {
    public static void main(String[] args) throws IOException {
        FileWriter fwr = new FileWriter("rand.txt");
        BufferedWriter bwr = new BufferedWriter(fwr);
        for (int i = 0; i < 1000; i++) {
            int num = (int) (Math.random() * 100000);
            bwr.write(Integer.toString(num));
            bwr.newLine();
        }
        bwr.flush();
        bwr.close();
    }
}