import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class No1 {
    public static void main(String args[])throws Exception
    {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
       
        int s;
        int max = 0;
        int min = 0;
        System.out.print("Jumlah Bilangan  : ");
        s = Integer.parseInt(dataIn.readLine());
       
        int[] Array;
        int temp;
        Array = new int[s];
        int asc;
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < s; i++)
        {
            System.out.print("Nilai " +(i+1)+" = ");
            temp = Integer.parseInt(input.next());
            Array[i] = temp;
            min = temp;
            max = temp;
        }

        for(int c=1;c<s;c++)
        {
            for(int d=0;d<s-c;d++)
            {
                if(Array[d] < Array[d+1])
                {
                    asc=Array[d];
                    Array[d]=Array[d+1];
                    Array[d+1]=asc;
                }
                if (Array[d] > max)
				{
					max = Array[d];
				}
				if (Array[d] < min)
				{
					min = Array[d];
				}
            }
        }
       
        System.out.println("");
        System.out.println("Hasil Pengurutan Adalah ");
        for(int i=0;i<s;i++)
        {
            System.out.print(" "+ Array[i]);
        }
        System.out.println("");
        System.out.println("Nilai terbesar : " + max);
        System.out.println("Nilai terkecil : " + min);
    }
}
