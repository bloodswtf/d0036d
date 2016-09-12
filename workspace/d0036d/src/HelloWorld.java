import java.io.IOException;
import java.io.InputStream;
import java.net.URL;


public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model model=new Model();
		Controller controller = new Controller();
		View view = new View();
		try {
			URL url = new URL("http://www.google.com");
			InputStream in = url.openStream();
			System.out.println(url.getContent().toString());
			System.out.println(
					url.openConnection().toString());
			System.out.println(in.toString());
			System.out.println(url.toString());
			int i;
			while(in.read()>0){
				//System.out.println(in.read());
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
