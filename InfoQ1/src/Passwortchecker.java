
public class Passwortchecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean sonderzeichen;
		boolean gro�buchstabe;
		boolean lang;
		boolean zahl;

		
		zuCharArray("Passwort123!");
		
	}
	public static void zuCharArray(String p)
	{
		System.out.println(p);
		char[] charArray = p.toCharArray();
		
		for(int i = 0; i < charArray.length; i++)
		{
			if (Character.isUpperCase(charArray[i]))
			{
				System.out.println(charArray[i] + " ist ein Gro�buchstabe!");
				boolean gro�buchstabe=true;
			}else {
				System.out.println(charArray[i] + " ist kein Gro�buchstabe!");
			}
			
		}	
				
			for(int j = 0; j < charArray.length; j++)
			{
				if (Character.isDigit(charArray[j]))
				{						
					System.out.println(charArray[j] + " ist eine Zahl!");
					boolean zahl=true;
				}
				else {
					System.out.println(charArray[j] + " ist keine Zahl!");
					
				}
			}
			
			for(int k = 0; k < charArray.length; k++)
			{
				if (Character.isLetterOrDigit(charArray[k]))
				{
					System.out.println(charArray[k] + " ist ein Buchstabe oder Zahl!");
				}else {
					System.out.println(charArray[k] + " ist ein Sonderzeichen!");
					boolean sonderzeichen=true;
				}
			
			}
			
			
				int h = 0;
				if (charArray.length >=8)
				
				{
					System.out.println(charArray[h] + " Passwort ist lang genug!");
					boolean lang=true;
				}else {
					System.out.println(charArray[h] + " Passwort ist zu kurz");
					
				
			
			if (sonderzeichen==true && gro�buchstabe ==true && zahl==true && lang==true)
	{
		System.out.println("Passwort ist nicht sicher");
		}
			else
		{
			System.out.println("Passwort ist unsicher");
	}
}
}
}

				
						
			
			
			
			
			
			
			
		
	

	


		
