package interviewProgram;

public class Move1ToLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,0,1,1,1,0,0,1,0,1};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int elm:a)
			System.out.println(elm);
	}

}
