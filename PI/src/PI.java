import java.io.IOException;
import java.net.UnknownHostException;

public class PI {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Clients c = new Clients();
		c.go();
		Player window = new Player();
	}

}