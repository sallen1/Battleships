import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

public class TrackList extends JFrame {
	/*
	 
	 Track list for Michael Jackson - Thriller, CD 1 
	 
	 */
	private static final long serialVersionUID = 1L;

	public TrackList() {

		{
			/*
			 * Name of the column headers go here.
			 * 
			 * This is the first array, a collection of variables, variables are
			 * things which store data
			 */

			String[] columns = new String[] { "Id", " Artist Name", "Track Title",
					"Duration" };

			/*
			 * 
			 * This is where the data for each column header is entered.
			 * 
			 * This is the second array, an arrangement of items at equally
			 * spaced addresses.
			 */

			Object[][] data = new Object[][] {
					{ 1, "Michael Jackson", "Wanna Be Startin' Something", "6:03" },
					{ 2, "Michael Jackson", "Baby Be Mine", "4:20" },
					{ 3, "Michael Jackson", "The Girl Is Mine", "3:42" },
					{ 4, "Michael Jackson", "Thriller", "5:57"},
					{ 5, "Michael Jackson", "Beat It", "4:18" },
					{ 6, "Michael Jackson", "Billie Jean", "4:54" },
					{ 7, "Michael Jackson", "Human Nature", "4:06" },
					{ 8, "Michael Jackson", "P.Y.T (Pretty Young Thing)", "3:59" },
					{ 9, "Michael Jackson", "The Lady In My Life", "5:00" }, 
					
					};

			// create table with data

			JTable table = new JTable(data, columns);

			// add the table to the frame

			this.add(new JScrollPane(table));

			this.setTitle("Michael Jackson - Thriller");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.pack();
			this.setVisible(true);
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new TrackList();
			}
		});
	}
}