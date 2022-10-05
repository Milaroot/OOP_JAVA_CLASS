package Java111Q1;

class Data {
    private String name;
    private String score;

    class Test {
        int english;
        int math;

        Test(int eng, int m) {
            english = eng;
            math = m;
        }

        double avg
        {
            return ((double) english + (double) math) / 2;
        }

    }

    Data(int x, int y, int z){
        name = x;
        Test tmp = new tmp(y, z)
    }

    void show(){
        System.out.printf("name: %s, english: %d, math: %d, avg = %f\n", name, tmp.english, tmp.math, tmp.avg)
    }
}

public class Class02 {
    public static void main(String[] main) {
        Data n1 = new Data("Annie", 85, 92);
        Data n2 = new Data("Brian", 77, 56);
        System.out.print(n1.show());
        System.out.print(n2.show());
    }
}
