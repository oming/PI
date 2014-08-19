import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class About extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Create the dialog.
	 */
	public About() {
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("aa");

			}
		});
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.NORTH);
			{
				JLabel raspLogo = new JLabel("");
				raspLogo.setLabelFor(this);
				raspLogo.setToolTipText("Logo");
				panel.add(raspLogo);
				raspLogo.setIcon(new ImageIcon("/Users/oming/Desktop/rasp_logo.png"));
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.SOUTH);
			{
				JLabel aboutTitle = new JLabel("<html><pre>\uBCF8 \uD504\uB85C\uADF8\uB7A8\uC740 EBMS\uC758 Viewer \uD504\uB85C\uADF8\uB7A8\uC785\uB2C8\uB2E4.\n&copy; 2014. \uBCF8 \uD504\uB85C\uADF8\uB7A8\uC758 \uC800\uC791\uAD8C\uC740 \uBAA8\uB450 EBMS\uC5D0 \uC788\uC2B5\uB2C8\uB2E4.</pre></html>");
				panel.add(aboutTitle);
			}
		}

	}

}
