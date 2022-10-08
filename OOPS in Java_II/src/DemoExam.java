class Exam
{
	private int rno;
	private String sub;
	private double avg;
	private static int cnt;
	
	public Exam()
	{
		sub=null;
		avg=6.5;
		rno=++cnt;
	}
	public Exam(String sub)
	{
		this.sub=sub;
		this.rno=rno;
		this.avg=avg;
		rno=++cnt;
		
		
	}
	public Exam(String sub,double avg)
	{
		this.sub=sub;
		this.rno=rno;
		this.avg=avg;
		rno=++cnt;
	}
	public void showExam()
	{
		System.out.println("Rno: "+rno+" Sub: "+sub+" Avg: "+avg);
	}
	}

public class DemoExam {

	public static void main(String[] args) {
		
        Exam e1=new Exam();
        Exam e2=new Exam();
        Exam e3=new Exam();
        Exam e4 =new Exam();
        e1.showExam();
        e2.showExam();
        e3.showExam();
        e4.showExam();
        
        
	}

}
