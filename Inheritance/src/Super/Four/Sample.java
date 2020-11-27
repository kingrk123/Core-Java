package Super.Four;

public class Sample extends Example{
	int x = 30;
	int y = 40;
	 void m2 () {
		 System.out.println("x: " +x);
		 System.out.println("y: "+ y);
		 
		 System.out.println("x: "+super.x);
		 System.out.println("y: "+super.y);
	 }
	 void m3() {
		 int x = 50;
		 int y = 60;
		 System.out.println("local x: "+x);
		 System.out.println("local y: "+y);
		 
		 System.out.println("subClass x: "+this.x);
		 System.out.println("subClass y: "+this.y);
		 
		 System.out.println("superClass x: "+super.x);
		 System.out.println("superClass y: "+super.y);
	 }
	 public static void main(String[] args) {
		Sample s =new Sample();
		s.m2();
		s.m3();
	}

}
