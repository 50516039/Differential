// 0.000000015 ���Ό덷��1.3240160079419638E-7
package differential;

import java.util.Scanner;

public class Differential_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input value of a > ");
		double a = Double.parseDouble(scan.next());
		System.out.print("Input value of h > ");
		double h = Double.parseDouble(scan.next());
		
		Differential_lib dlib = new Differential_lib(a,h);
		System.out.println("f(x)=x^2��x="+a+"�ɂ���������W����"+dlib.getRx());

		Differential_lib dlib2 = new Differential_lib(a,h);
		System.out.println("f(x)=x^2��x="+a+"�ɂ����鐔�l������"+dlib2.getDx());
	
		Differential_lib dlib3 = new Differential_lib(a,h);
		System.out.println("���Ό덷��"+dlib3.getGosa());

	}
}
		