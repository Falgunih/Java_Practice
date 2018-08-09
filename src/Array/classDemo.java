package Array;

public class classDemo {
	String Stdname;
	int stdscore;
	String grade=null;
	
	
	
	public void findoutGrade(String stdname,int stdscore){
		
		
		
		if (stdscore>=90 && stdscore<=99){
			grade ="A";
		}
		else  if (stdscore>=75 && stdscore<=89){
			grade ="B";
		}
		else if (stdscore>=60 && stdscore<=74){
			grade ="C";
		}
		else if (stdscore<60){
			grade="Fail";
			
		}
		System.out.println( stdname + "      "+stdscore   +"   "+ grade);

}
	public static void main(String[] args) {
		classDemo c1 = new classDemo();
		c1.findoutGrade("fal", 99);
	}
	
}