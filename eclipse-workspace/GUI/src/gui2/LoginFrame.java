package gui2;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class LoginFrame extends JFrame {
	public LoginFrame() {
		this.setVisible(true);
		this.setSize(1000, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("WELCOME FRAME");
		JLabel jl = new JLabel();
		jl.setText("How are you all?");
		this.add(jl);
	}
}
