package Class09;

import Class09.sub1.CSphere;
import Class09.sub2.CTrapezoid;

public class Class09 {
	public static void main(String[] args) {
		CSphere cs = new CSphere(5);
		CTrapezoid ct = new CTrapezoid(5, 7, 3);
		cs.show();
		ct.show();
	}
}