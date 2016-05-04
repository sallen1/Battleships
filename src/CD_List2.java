//AWT is the Java Abstract Window toolkit//

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumn;
import javax.swing.DefaultCellEditor;

public class CD_List2 {

	public static void main(String[] args) {
	}

	public void run() {
		new CD_List2() {

			public void CD_List2() {
				JFrame guiFrame = new JFrame();

				EventQueue.invokeLater(new Runnable() {

					@Override
					public void run() {
						new CD_List2();
					}
				});

				guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				guiFrame.setTitle("Creating a Table Example");
				guiFrame.setSize(700, 200);

				guiFrame.setLocationRelativeTo(null);

			}

		};

	}
}
