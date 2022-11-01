import javax.swing.JFrame;

public class Ex1 extends JFrame {
	Ex1() {
		setTitle("Let's study Java");
		setSize(400, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex1();
	}
}
