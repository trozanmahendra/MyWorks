package customEventHandling.events;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.springframework.context.ApplicationEvent;

@SuppressWarnings("serial")
public class AccountEvent extends ApplicationEvent {
	private String message;

	public AccountEvent(Object obj, String message) {
		super(obj);
		this.message = message;
	}

	static FileOutputStream fos;
	static {
		try {
			fos = new FileOutputStream("/home/mg/eclipse-SPRING/CORE/customEventHandling/src/log/log.txt", true);

		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}

	public void generateLog() {

		try {
			message = new Date().toLocaleString() + " : " + message;
			message = message +"\n";
			byte[] b = message.getBytes();
			fos.write(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
