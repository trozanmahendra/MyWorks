package the_Alphabet;

public class Alphabet 
{
        public static void main(String[] args) 
     {
		char x='A',y='a';
		System.out.println("\t\tTHE ENGLISH ALPHABET\n"+"--------------------------------------------------");
		while(x<='Z')
		{
			
			System.out.print(x+",");
			x++;
		}
		System.out.println("\n"+"--------------------------------------------------");
            while(y<='z') 
            {
			System.out.print(y+",");
			y++;
		    }
       }
        
}
