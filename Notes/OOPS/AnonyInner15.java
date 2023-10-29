package OOPS;
@FunctionalInterface
interface Alpha{
	void disp();
}
//@FunctionalInterface          //Error because it's not a FI , because it's having more than one methods
interface Beta{
	int show(String s);
	void fast();
}
public class AnonyInner15 {
	public static void main(String args[]) {
		Alpha a = new Alpha(){          //this is not a object creation. this is a new way of 
			public void disp() {        // Implementing an interface (Better than the Fi14)
				System.out.println("Implementing Interface");
			}
		};
		a.disp(); 
		//the way of implementing this is called as anonymous inner class
		
		//Another Example
		Beta b = new Beta() {
			public int show(String s) {
				int res = s.length();
				return res;
			}
			public void fast() {
				System.out.println("yayy");
			}
		};
		System.out.println(b.show("Shafwan"));
		b.fast();
		
		//we can even use anonymous inner class for overriding a class too. Ex:
//		B9 b1  = new V9();            //old way
//		b1.jj();
		B9 b2 = new B9() {
			void jj() {
				System.out.println("Not Nice");    //using anonymous inner class way
			}
		};
		b2.jj();
	}
}
	class B9{
		void jj() {
			System.out.println("Nice");
		}
	}
//	class V9 extends B9{
//		void jj() {
//			System.out.println("NOt Nice");       //old way 
//		}
//	}

