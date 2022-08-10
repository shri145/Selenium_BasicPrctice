
public class peramid {

	public static void main(String[] args) {

		/*
		*****
		****
		***
		**
		*
		*/
		
		/*for(int i=1;i<=5;i++)
		{
			for (int j=i;j<=5;j++)
			{
				System.out.print(" *");
				
			}
			System.out.print("\n");
			
		}*/
		/*
		*
		**
		***
		****
		*****
		*/
		//System.out.print("helooo");
		/*for(int i=1;i<=5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print("");
				System.out.print(j);
				
				
			}
			System.out.print("\n");
			
		}*/
		/*
		 A
		 A B
		 A B C
		 A B C D
		 * 
		 */
		/*char end='D';
		char beg='A';
		for(int i=1;i<=5;i++)
		{
			
			for (int j=1;j<=i;j++)
			{
				System.out.print(" ");
				System.out.print(beg);
				
				
			}
			beg++;
			System.out.print("\n");
			
		}*/
		/*int row=5;
	
		for(int i=1;i<=5;i++)
		{
			int k=0;
			int x=1;
			
			for (int j=row-i;j>=0;j--)
			{
				 
				System.out.print(" ");
			}	
			while (k != 2 * i - 1) {
		        System.out.print("* ");
		        k++;
		        //System.out.print(k);
		        x++;
		      }
			System.out.print("\n");
			
		}*/
		int k=1;
		int row=5;
		for(int i=1;i<=5;i++)
		{
			
			for(int j=row-i;j>=5;j--)
			{
				System.out.print(" ");
			}
			while(k!=2*i-1)
			{
				System.out.print("* ");
				k++;
			}
			
			System.out.print("\n");
		}
	}

}
