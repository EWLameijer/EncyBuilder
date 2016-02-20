package ency;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * [CC] Creates the main window in which to view and edit the encyclopedia.
 * 
 * @author Eric-Wubbo Lameijer
 */
public class MainWindow extends JFrame {

	// [CCCC] the serial version UID - not used but kind of standard for
	// Java classes
	private static final long serialVersionUID = 428891413938848456L;

	// @@@[the text field in which you type the entry you want to create or edit
	// (like "GridBagLayout")
	private JTextField m_findEntryField;

	/**
	 * @@@[
	 * 
	 *      @return
	 */
	private GridBagConstraints createSimpleGridBagConstraints(int columnIndex,
	    int rowIndex, int widthInColumns, int heightInRows) {
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = columnIndex;
		gridBagConstraints.gridy = rowIndex;

		return gridBagConstraints;
	}

	/**
	 * [CPPRCCC] Creates and shows the main (and only) window of the program.
	 */
	private MainWindow() {
		// preconditions: none
		super("EncyBuilder");
		setLayout(new GridBagLayout());

		setSize(1000, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		// postconditions: none (normal constructor)
	}

	/**
	 * [CPPRCCC] Starts the program by creating (and starting) the main window.
	 * 
	 * @param arguments
	 *          the command-line arguments (not used at the moment)
	 */
	public static void main(String[] arguments) {
		// preconditions: none
		new MainWindow();
		// postcondition: none
	}

}
