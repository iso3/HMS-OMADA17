
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Search extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

	private JLabel jLabelName = null;

	private JTextField jTextFieldName = null;

	private JButton jButtonSearch = null;

	private JLabel jLabelFound = null;

	/**
	 * This is the default constructor
	 */
	public Search() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(394, 275);
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
		this.addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosing(java.awt.event.WindowEvent e) {
				System.exit(0);
			}
		});
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabelFound = new JLabel();
			jLabelFound.setBounds(new Rectangle(124, 86, 177, 33));
			jLabelFound.setFont(new Font("Dialog", Font.BOLD, 12));
			jLabelFound.setForeground(Color.red);
			jLabelFound.setText("");
			jLabelName = new JLabel();
			jLabelName.setBounds(new Rectangle(36, 36, 61, 32));
			jLabelName.setText("Όνομα");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabelName, null);
			jContentPane.add(getJTextFieldName(), null);
			jContentPane.add(getJButtonSearch(), null);
			jContentPane.add(jLabelFound, null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jTextFieldName	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldName() {
		if (jTextFieldName == null) {
			jTextFieldName = new JTextField();
			jTextFieldName.setBounds(new Rectangle(136, 36, 166, 33));
		}
		return jTextFieldName;
	}

	/**
	 * This method initializes jButtonSearch	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonSearch() {
		if (jButtonSearch == null) {
			jButtonSearch = new JButton();
			jButtonSearch.setBounds(new Rectangle(167, 128, 119, 29));
			jButtonSearch.setText("SEARCH");
			jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
					//Get search arguments from jTextField
					String name = jTextFieldName.getText();
					
					//Create SQL
					String sql = "SELECT * FROM TEST WHERE FIRST_NAME LIKE '%"+name+"%'";
					
					//Get database connection
					Connection con= SQLUtilities.connect();
					
					//Run the SQL and get the resultset
					ResultSet set = SQLUtilities.executeSQL(sql, con);
					
					System.out.println(sql);
					try {
						//Go to last row
						set.last();
						
						//Get the row number which is the whole rows number
						int t = set.getRow();
						
						//Create an array of TableTest objects which will hold the resultset info
						TableTest [] matrix = new TableTest[t];
						
						//If the search SQL found something
						if (t>0)
						{
							//Go to first row
							set.first();
							int counter=0;
							
							//Check if this is the last row
							while(!set.isAfterLast())
							{
								
								//Put the row info into the java bean
								matrix[counter] = new TableTest();
								matrix[counter].setName(set.getString("FIRST_NAME"));
								matrix[counter].setSurname(set.getString("LAST_NAME"));
								counter++;
								
								//Go to next row
								set.next();
							}
							
							//Run method goNext
							goNext(matrix);
						}
						else
						{
							jLabelFound.setText("Din't find anything");
						}
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					finally
					{
						SQLUtilities.disconnect(con);
					}
				}
			});
		}
		return jButtonSearch;
	}
	
	//This method makes this frame invisible and Show frame visible passing the TableTest array
	private void goNext(TableTest[] matrix)
	{
		setVisible(false);
		Show show = new Show(matrix,this);
		show.setVisible(true);
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
