package OOPS;

class Box{
	private String pencil;
	private String eraser;
	private Pen pen;
	
	public Box(String pencil,String eraser,Pen pen){
		this.pencil=pencil;
		this.eraser=eraser;
		this.pen=pen;
	}
	
	public void disp() {
		System.out.println("*********Box Details************");
		System.out.println("Pencil : "+pencil);
		System.out.println("Eraser : "+eraser);
		System.out.println("*********Pen Details***********");
		System.out.println("Pen1 : "+pen.getpen1());
		System.out.println("Pen2 : "+pen.getpen2());
	}
	
}
class Pen{
	private String pen1;
	private String pen2; 
	
	public String getpen1(){
		return pen1;
	}
	public String getpen2(){
		return pen2;
	}
	public Pen(String pen1,String pen2){
		this.pen1=pen1;
		this.pen2=pen2;
	}
}

public class Test {
	public static void main(String args[]) {
		Pen p = new Pen("Black pen","Blue pen");
		Box b = new Box("Apsara","Natraj",p);
		
//		p.setpen1("Black pen");
//		p.setpen2("Blue pen");
		b.disp();
//		System.out.println("Pen1 : "+p.getpen1());
//		System.out.println("pen2 :"+p.getpen2());
	}
}
