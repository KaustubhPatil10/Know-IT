class Date
{
  private int day,month,year;
  public void setDate(int d,int m,int y)
  {
   day=d;
   month=m;
   year=y;
   }
   public void setDay(int d)
   {
    day=d;
   }
   public void setMonth(int m)
   {
    month=m;
    }
    public void setYear(int y)
     {
      year=y;
     }
    public void showDate()
     {
      System.out.println("Date :"+day+"/"+month+"/"+year);
     }
  }
public class MemoDate
{
 public static void main(String args[])
  {
     Date d1 =new Date();
     d1.setDate(23,8,2000);
     d1.showDate();

     Date d2= new Date();
     d2.setDay(10);
     d2.setMonth(6);
     d2.setYear(1996);
     d2.showDate();

 }
}
  
  