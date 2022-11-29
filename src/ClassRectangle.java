class rectangle{
	float length;
	float width;
	
	rectangle(){
		length=1;
		width=1;
	}
	rectangle(float l,float w){
		length=l;
		width=w;
	}
	void setLength(float l) {
		length=l;
	}
	void setWidth(float w) {
		width=w;
	}
	float getLength() {
		return length;
	}
	float getWidth() {
		return width;
	}
	double getArea() {
		return length*width;
	}
	double getPerimeter() {
		return 2*(length+width);
	}
	public String toString() {
		return "Rectangle[length="+length+",width="+width+"]";
	}
}
public class ClassRectangle {
	public static void main(String args[]) {
		rectangle R1= new rectangle();
		rectangle R2= new rectangle(5,9);
		rectangle R3= new rectangle();
		System.out.println(R1);
		System.out.println(R2);
		System.out.println(R3);
		R3.setLength(3);
		R3.setWidth(2);
		System.out.println("Area of R3 is "+R3.getArea());
		System.out.println("Perimeter of R3 is "+R3.getPerimeter());
		R1.length=R3.getLength();
		R1.width=R3.getWidth();
		System.out.println(R1);
		System.out.println(R2);
		System.out.println(R3);
		
		
	}

}
