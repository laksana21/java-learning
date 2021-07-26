import java.util.Scanner;

public class testjava
{
	public static void main(String[] args)
	{
		/*boolean a = true;
		boolean b = false;
		
		System.out.println("b = " + String.valueOf(b));
		System.out.println("a|b = " + String.valueOf(a|b));
		System.out.println("a&b = " + String.valueOf(a&b));
		System.out.println("a^b = " + String.valueOf(a^b));
		System.out.println("!a&b|a&!b = " + String.valueOf(!a&b|a&!b));
		System.out.println("!a = " + String.valueOf(!a));
		
		int a = 1 + 1;
		int b = a * 3;
		int c = b / 4;
		int d = c - a;
		int e = -d;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);*/
		
		char c = 'R';
		byte j = 127;
		short k = 32767;
		
		System.out.println("c = " + c);
		++c;
		System.out.println("c = " + c);
		++c;
		System.out.println("c = " + c);
		System.out.println("j = " + j);
		--j;
		System.out.println("j = " + j);
		++j;
		System.out.println("j = " + j);
		System.out.println("k = " + k);
		k -= 4;
		System.out.println("k = " + k);
		k += 5;
		System.out.println("k = " + k);
	}
}
