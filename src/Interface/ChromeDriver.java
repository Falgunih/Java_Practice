package Interface;

public class ChromeDriver  implements WebDriver {

	@Override
	public void click() {
		System.out.println("chrome implements click method");
		
	}

	@Override
	public void quit() {
		System.out.println("chrome implements quick method");
		
	}

	@Override
	public void sendkey() {
		System.out.println("chrome implements sendkey method");
		
	}

	@Override
	public void getTitle() {
		// TODO Auto-generated method stub
		
	}
	public void chromeBrowserOption(){
		System.out.println("chrome has  its own method");
	}

}
