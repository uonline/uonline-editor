package uonlineeditor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author houjing
 */
public class Locations {

	public ArrayList<Location> locs = new ArrayList<>();

	public int lastId = 0;
	public int selected = -1;

	Locations () {}

	Locations (List<String[]> locs) {
		//System.out.println("Locations constructor");
		for (Iterator<String[]> it = locs.iterator(); it.hasNext();) {
			Location l = new Location(it.next());
			lastId = Math.max(lastId, l.id);
			this.locs.add(l);
		}
	}

	void add(Location l) {
		locs.add(l);
	}

	void add(int areaId) {
		selected = lastId;
		locs.add(new Location(areaId, lastId++));
	}

	int getIndexOf(Object obj, int param) {
		for (int i = 0; i < locs.size(); i++) {
			if (locs.get(i).getParameter(param) == obj) {
				return i;
			}
		}
		return -1;
	}

}