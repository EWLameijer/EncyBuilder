package ency;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Creates the main window in which to view and edit the encyclopedia.
 * 
 * @author Eric-Wubbo Lameijer
 */
public class MainWindow extends JFrame {

  // the serial version UID - not used but kind of standard for
  // Java classes
  private static final long serialVersionUID               = 428891413938848456L;

  // @@@[the text field in which you type the entry you want to create or edit
  // (like "Dopamine")
  private JTextField        m_findEntryField               = new JTextField();
  private JLabel            m_previousEntry                = new JLabel();
  private JLabel            m_currentEntry                 = new JLabel();
  private JLabel            m_nextEntry                    = new JLabel();
  private JTextArea         m_currentText                  = new JTextArea();
  private JTextField        m_findTermField                = new JTextField();
  private JButton           m_findPreviousOccurrenceButton = new JButton("<-");
  private JButton           m_findNextOccurrenceButton     = new JButton("->");

  /**
   * Creates the gridbag-constraints for a widget.
   * 
   * @return GridBagConstraints that are based on the input values as well as
   *         some default values.
   */
  private GridBagConstraints createSimpleGridBagConstraints(int columnIndex,
          int rowIndex, int widthInColumns, int heightInRows) {
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = columnIndex;
    gridBagConstraints.gridy = rowIndex;
    gridBagConstraints.gridwidth = widthInColumns;
    gridBagConstraints.gridheight = heightInRows;
    gridBagConstraints.fill = GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.weighty = 1.0;

    return gridBagConstraints;
  }

  /**
   * Creates and shows the main (and only) window of the program.
   */
  private MainWindow() {
    // preconditions: none
    super("EncyBuilder");
    setLayout(new GridBagLayout());
    add(m_findEntryField, createSimpleGridBagConstraints(0, 0, 3, 1));
    add(m_previousEntry, createSimpleGridBagConstraints(8, 1, 3, 1));

    setSize(1000, 700);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
    // postconditions: none (normal constructor)
  }

  /**
   * Starts the program by creating (and starting) the main window.
   * 
   * @param arguments the command-line arguments (not used at the moment)
   */
  public static void main(String[] arguments) {
    // preconditions: none
    new MainWindow();
    // postcondition: none
  }

}
