package Java09;

class Namecard {

    class Phone {
        String company;
        String cell;

        Phone(String s1, String s2) {
            company = s1;
            cell = s2;
        }

    }

    private String name;
    private String address;
    private Phone data;

    Namecard(String n, String a, String cc, String c) {
        name = n;
        address = a;
        data = new Phone(cc, c);
    }

    public void show() {
        System.out.printf("好友姓名:%s\n", name);
        System.out.printf("聯絡地址:%s\n", address);
        System.out.printf("公司號碼%s\n", data.company);
        System.out.printf("手機號碼%s\n", data.cell);
    }
}

public class Class17 {

    public static void main(String[] argv) {
        Namecard first = new Namecard("Andy", "123City", "2345*6789", "0911-336600");
        first.show();
    }
}
