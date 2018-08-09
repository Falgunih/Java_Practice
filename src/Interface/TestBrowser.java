package Interface;

public class TestBrowser {
	
	
	public static void main(String[] args) {
		
		//static Polymorphism wth the static poymorfism child object have the child refrence so we can access the all methods from the parents and the child 's own method too.
		FireFoxDriver ff = new FireFoxDriver();
		ff.click();
		ff.quit();
		ff.sendkey();
		ff.FFbrowserOption();
		
		//Dynamic Polymorphism with the dynamic we can't access the chrome's private method child object have the parent refernce 
		 WebDriver chrome=new ChromeDriver();
		 chrome.click();
		 chrome.quit();
		 chrome.sendkey();
		 
		
		
	}
	

}
