class Books
{
	private int pgNo;
	
	public void setPgNo(int x)
	{
		if(x>0)
		{
		pgNo=x;
		}
		else
		{
			System.out.println("Invalid input to my property");
		}
	}
	public int getPgNo()
	{
		return pgNo;
	}
	
}


public class LaunchEncap {

	public static void main(String[] args) {
		Books b=new Books();
		//b.pgNo=-100; error
		//System.out.println(b.pgNo);
		b.setPgNo(100);
		System.out.println(b.getPgNo());

	}

}
