package zadanie1;

public class main 
{	
	
	
	public static String sum(String[] ar)
	{
		int wynik[] = new int[20]; 
		int suma = 0;
		
		for(int i = 0; i < ar.length ; i=i+1)
		{
			wynik[i] = Integer.parseInt(ar[i]);
			//System.out.println(wynik[i]);
			suma =+ wynik[i];
		}
		String zwrot = String.valueOf(suma);
		System.out.println(zwrot);
		return zwrot;
	}
	
	
	

	public static void main(String[] args) 
	{
		
		sum(new String[] {"1", "1", "1"});

	}

}
