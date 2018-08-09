package Interface;

public class FireFoxDriver implements   WebDriver {

	@Override
	public void click() {
		System.out.println("ff implements click method");
		
	}

	@Override
	public void quit() {
		System.out.println("ff implements quick method");
		
	}

	@Override
	public void sendkey() {
		System.out.println("ff implements sendkey method");
		
	}

	@Override
	public void getTitle() {
		// TODO Auto-generated method stub
		
	}
	public void FFbrowserOption(){
		System.out.println("ff has its own method too");
	}

}
