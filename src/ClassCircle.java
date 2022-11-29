class circle{
	double radius;
	String color;
	
	circle(double r,String c ){
		radius=r;
		color=c;
	}
	circle(){
		radius=1;
		color="red";
	}
	circle(double r){
		radius=r;		
	}
	double getRadius() {
		return(radius);
	}
	String getColor() {
		return(color);
	}
	 void setRadius(double r ) {
		radius=r;
	}
	 void setColor(String c ) {
		 color=c;
		}
	 double getArea() {
		 return(22*radius*radius/7);
	 }
	 public String toString() {
		 return "Circle"+" "+"radius="+radius+",color="+color;
	 }
}
public class ClassCircle {
	public static void main (String args[]) {
		double A1,A2,A3,r3;
		String color1;
		circle c1=new circle();
		circle c2=new circle(2,"green");
		circle c3=new circle(3.5);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		A1=c1.getArea();
		System.out.println("Area of c1 is "+A1);
		A2=c2.getArea();
		System.out.println("Area of c2 is "+A2);
		A3=c3.getArea();
		System.out.println("Area of c3 is "+A3);
		r3=c2.getRadius();
		color1=c1.getColor();
		System.out.println("color1 is "+color1);
		c3.setColor("yellow");
		c3.setRadius(r3);
		System.out.println(c3);
		
		
		
	}

}
