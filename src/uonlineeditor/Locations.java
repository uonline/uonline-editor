package uonlineeditor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author houjing
 */
public class Locations extends DefaultTableModel {

	public ArrayList<Location> locs = new ArrayList<>();
	private Set<TableModelListener> listeners = new HashSet<>();

	Locations (List<String[]> locs) {
		//System.out.println("Locations constructor");
		for (Iterator<String[]> it = locs.iterator(); it.hasNext();) {
			this.locs.add(new Location(it.next()));
		}
	}

	public void addTableModelListener(TableModelListener listener) {
		listeners.add(listener);
	}

	public Class<?> getColumnClass(int columnIndex) {
		return String.class;
	}

	public int getColumnCount() {
		return 2;
	}

	public String getColumnName(int columnIndex) {
		switch (columnIndex) {
			case 0:
				return "Зона";
			case 1:
				return "id";
			default:
				return "";
		}
	}

	public int getRowCount() {
		return locs == null ? 0 : locs.size();
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		Location loc = locs.get(rowIndex);
		return loc.getParameter(columnIndex);
	}

	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return true;
	}

	public void removeTableModelListener(TableModelListener listener) {
		listeners.remove(listener);
	}

	public void setValueAt(Object value, int rowIndex, int columnIndex) {
		locs.get(rowIndex).setParameter(value.toString(), columnIndex);
	}


}