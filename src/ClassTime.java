class time{
	int hour;
	int minute;
	int second;
	
	time(int h,int m,int s){
		hour=h;
		minute=m;
		second=s;
	}
	void setTime(int h,int m,int s){
		hour=h;
		minute=m;
		second=s;
	}
	void setHour(int h){
		hour=h;
	}
	void setMinute(int m){
		
		minute=m;
		
	}
	void setSecond(int s){
	
		second=s;
	}
	int getHour(){
		return hour;
	}
	int getMinute(){
		
		return minute;
		
	}
	int getSecond(){
	
		return second;
	}
	public String toString() {
		if(hour<10 && minute <10 && second<10) {
			return "[0"+ hour +":0"+minute+":0"+second+"]";
		}
		if(hour>=10 && minute <10 && second<10) {
			return "["+hour+":0"+minute+":0"+second+"]";
		}
		if(hour<10 && minute >=10 && second<10) {
			return "[0"+hour+":"+minute+":0"+second+"]";
		}
		if(hour<10 && minute <10 && second>=10) {
			return "[0"+hour+":0"+minute+":"+second+"]";
		}
		if(hour>=10 && minute >=10 && second<10) {
			return "["+hour+":"+minute+":0"+second+"]";
		}
		if(hour>=10 && minute <10 && second>=10) {
			return "["+hour+":0"+minute+":"+second+"]";
		}
		if(hour<10 && minute >=10 && second>=10) {
			return "[0"+hour+":"+minute+":"+second+"]";
		}
		else {
			return "["+hour+":"+minute+":"+second+"]";
		}
			
	}
	time nextSecond(time t) {

		if(t.second==59 && t.minute==59 && t.hour<23){
			t.hour+=1;
			t.second=0;
			t.minute=0;
			
		}else if(t.second==59 && t.minute<59 ){
			t.minute+=1;
			t.second=0;
			
		}else if(t.second==59 && t.minute==59 && t.hour==23){
			t.minute=0;
			t.second=0;
			t.hour=0;
			
		}else {
			t.second+=1;
		}
		return t;
	}
	time previousSecond(time t) {


		if(t.second==0 && t.minute<=59 && t.minute>0){
			t.minute-=1;
			t.second=59;
			
		}else if(t.second==0 && t.minute==0 && t.hour<=23&& t.hour>0){
			t.minute=59;
			t.second=59;
			t.hour-=1;
			
		}else if(t.second==00 && t.minute==00 && t.hour==00){
			t.minute=59;
			t.second=59;
			t.hour=23;
			
		}else {
			t.second-=1;
		}
		return t;
	}
}
public class ClassTime {
	public static void main (String args[]) {
		time T1=new time(4,34,6);
		System.out.println(T1);
		time T2=new time(11,34,59);
		System.out.println(T2.getHour());
		System.out.println(T2.getMinute());
		System.out.println(T2.getSecond());
		System.out.println(T2);
		T2.setHour(5);
		T2.setMinute(6);
		T2.setSecond(45);
		System.out.println(T2);
		T1.setTime(00, 00, 59);
		System.out.println(T1);
		T1.nextSecond(T1);
		System.out.println(T1);
		T1.previousSecond(T1);
		System.out.println(T1);
		
		
	}

}
