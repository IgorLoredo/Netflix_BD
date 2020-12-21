package Front;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class TelaInicial extends JPanel {

	/**
	 * Create the panel.
	 */
	public TelaInicial() {
		
		setLayout(new BorderLayout(10, 10));
		
		JLabel Input1 = new JLabel("Filme");
		add(Input1);

	}

}
