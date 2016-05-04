import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

public class LibraryObject extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LibraryObject() {

		{
			/*
			 * Name of the column headers go here.
			 * 
			 * This is the first array, a collection of variables, variables are
			 * things which store data
			 */

			String[] columns = new String[] { "Id", " Artist Name", "CD Title",
					"Year" };

			/*
			 * 
			 * This is where the data for each column header is entered.
			 * 
			 * This is the second array, an arrangement of items at equally
			 * spaced addresses.
			 */

			Object[][] data = new Object[][] {
					{ 1, "Michael Jackson", "Thriller", 1983 },
					{ 2, "Fleetwood Mac", "Rumours", 1977 },
					{ 3, "Led Zeppelin", "Led Zeppelin", 1969 },
					{ 4, "Jimi Hendrix", "Axis: Bold As Love", 1967 },
					{ 5, "Jimi Hendrix", "Are You Experienced?", 1967 }, };

			// create table with data

			JTable table = new JTable(data, columns);

			// add the table to the frame

			this.add(new JScrollPane(table));

			this.setTitle("CD List");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.pack();
			this.setVisible(true);
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new LibraryObject();
			}
		});
	}
}