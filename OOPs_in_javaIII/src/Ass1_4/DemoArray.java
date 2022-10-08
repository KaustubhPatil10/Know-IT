package Ass1_4;

public class DemoArray {
	public static int Max(int[]a)
	{
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
		 if(max<a[i])
		 {
			 max=a[i];
		 }
 		}
		return max;
	}
		
 public static int Min(int[]a)
		{
			int min=a[0];
			for(int i=0;i<a.length;i++)
			{
			 if(min>a[i])
			 {
				 min=a[i];
			 }
	 		}
			return min;
	}
	public static int Avg(int[]a)
	{   
		int avg=a[0];
		avg=0;
		for(int i=0;i<a.length;i++)
		{
		 avg=avg+a[i];
		}
		return avg/a.length ;
	}

	public static void main(String[] args) {
	
      int arr[]= {10,20,30,40,50};
      int mx=Max(arr);
      int mn=Min(arr);
      int av=Avg(arr);
      System.out.println("Result: Max = "+mx+" Min ="+mn+" Avg ="+av);
	}

}
