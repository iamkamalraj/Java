package OOPS;

class Instance{
	int a;
	double b=5.5;
}


class Local{
	public void show() {
		int a;
		double b=6.5;
//		System.out.println(a);   //it will give error because we should declare the values in local
		System.out.println(b);
	}
}

//-------------------------------------------------------------
//'()' this thing is called as constructor
//if inside of constructor , values given means it's a parameters

class Constructor{
	public int addNum(int x , int y){
		return x+y;
	}
}

//--------------------------------------------------------------

public class InstanceLocal2 {
	public static void main(String ags[]) {
		Instance i = new Instance();
		System.out.println(i.a); //null
		System.out.println(i.b); //5.5
		
		Local l = new Local();
		l.show();                //6.5
        
		Constructor c = new Constructor();
		int lol=c.addNum(5,6);
		System.out.println(lol);
	}
}
