package Ass1_5;

public class DemoArray2 {
	
	public static void main(String[] args) {
		int row,col,sumrow,sumcol;
      int arr[][]= {{10,20,30},
    		     {10,15,20},
    		     {10,15,25}};
      row=arr.length;
      col=arr[0].length;
      for(int i=0;i<row;i++)
      {
    	  sumrow=0;
    	  for(int j=0;j<row;j++)
    	  {
    		sumrow= sumrow+arr[i][j];  
    	  }
    	  System.out.println("Sum of Rows "+i+"  :"+sumrow);
      }
      for(int i=0;i<col;i++)
      {
    	  sumcol=0;
    	  for(int j=0;j<col;j++)
    	  {
    		  sumcol= sumcol+arr[j][i];
    	  }
    	  System.out.println("Sum of Coloumns "+i+"  :"+sumcol);
      }
      
    				  
	}

}
