
public class SortAcending {

	public static void main(String[] args) {
		
		int a[]= {2,6,4,9,1};
		          
			int temp=0;
			
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a.length;j++)
				{
					if(a[i]>a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
		for(int s:a)
			System.out.println(s);
	}

}
