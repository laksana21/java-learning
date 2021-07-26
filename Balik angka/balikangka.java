import java.util.Scanner;
public class balikangka
{
   public static void main(String args[])
   {
      int angka, array = 0;
      System.out.println("Masukkan angka yang ingin dibalik : ");
      Scanner input = new Scanner(System.in);
      angka = input.nextInt();
      while( angka != 0 )
      {
          array = array * 10;
          array = array + angka%10;
          angka = angka/10;
      }
      System.out.println("Kebalikan dari angka tersebut adalah : " + array);
   }
}
