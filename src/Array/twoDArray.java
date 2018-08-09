package Array;

import java.util.Arrays;

public class twoDArray {
	//for each loop is also use for 2d array..
	
	public static void main(String[] args) {
				
	String   school  [][]= new String [3][2];
			
	school [0][0]="AA";
	school [0][1]="fine";
	school [1][0]="sky";
	school [1][1]="good";
	System.out.println("row legth is "+ school.length);
	System.out.println("col lengh is "+ school [0].length);
	//System.out.println(school [1][0]);
	
/*for (String[] std : school) {
	for (String s : std) {
		System.out.println(s);
		
	}
	
}*/
for (int i=0;i<school.length;i++){
	for (int j=0;j<school[0].length;j++){
       
       System.out.println(school[i][j]);
       
	
}

}}}


