public class perbandingan_case
{
	public static void main( String[] args )
	{
		int a = 92;
		int b = 34;
		
		switch(Boolean.toString(a>b))
		{
			case "true":
				System.out.println( "Nilai A lebih besar dari B");
				break;
			default:
				System.out.println("Nilai B lebih besar dari A");
		}
	}
}


