import java.util.Scanner;

public class SortIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Sort integer array
		
		
		
		System.out.println("Enter size of array");
		Scanner reader=new Scanner(System.in);
		int size=reader.nextInt();
		int[] arr=new int[size];
		
		for(int i=0;i<size;i++)
		{
			Scanner reader1=new Scanner(System.in);
			int num=reader1.nextInt();
			arr[i]=num;
			//System.out.println(num);
		}
		int temp=0;
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int k:arr)
		System.out.println(k);
		
	}

}
