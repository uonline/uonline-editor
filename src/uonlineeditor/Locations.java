package uonlineeditor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author houjing
 */
public class Locations extends DefaultTableModel {

	public ArrayList<Location> locs = new ArrayList<>();

	Locations () {}

	Locations (List<String[]> locs) {
		//System.out.println("Locations constructor");
		for (Iterator<String[]> it = locs.iterator(); it.hasNext();) {
			this.locs.add(new Location(it.next()));
		}
	}
}