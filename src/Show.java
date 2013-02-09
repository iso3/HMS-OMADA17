
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Show extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

	private JScrollPane jScrollPane = null;

	private JTable jTable = null;

	private JButton jButtonBack = null;
	
	private TableTest[] pin = null;
	
	private JFrame par = null;

	/**
	 * This is the default constructor
	 */
	public Show(TableTest[] pinakas,JFrame parent) {
		super();
		pin = pinakas;
		par = parent;
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(464, 278);
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getJScrollPane(), null);
			jContentPane.add(getJButtonBack(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setBounds(new Rectangle(14, 5, 248, 143));
			jScrollPane.setViewportView(getJTable());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jTable	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTable() {
		if (jTable == null) {
			
			//We need to create a two - dimension array
			// holding a row into dimention one and columns in dimension two
			String [][] table = new String[pin.length][2];
			
			for (int i = 0; i < pin.length; i++) {
				table[i][0] = pin[i].getName();
				table[i][1] = pin[i].getSurname();
				
			}
		
			String[] stiles = new String[2];
			stiles[0]="ONOMA";
			stiles[1]="EPONYMO";
			                             
			jTable = new JTable(table,stiles);
		}
		return jTable;
	}

	/**
	 * This method initializes jButtonBack	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonBack() {
		if (jButtonBack == null) {
			jButtonBack = new JButton();
			jButtonBack.setBounds(new Rectangle(298, 195, 93, 31));
			jButtonBack.setText("BACK");
			jButtonBack.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
					//this action listener sets this frmae invisible and the 
					// parent search fram visible
					setVisible(false);
					par.setVisible(true);
				}
			});
		}
		return jButtonBack;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
