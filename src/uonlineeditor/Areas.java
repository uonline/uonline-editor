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
public class Areas extends DefaultTableModel {

	private Set<TableModelListener> listeners = new HashSet<>();
	private ArrayList<Area> areas = new ArrayList<>();

	Areas (List<String[]> areas) {
		System.out.println("Areas constructor");
		for (Iterator<String[]> it = areas.iterator(); it.hasNext();) {
			this.areas.add(new Area(it.next()));
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
		return areas == null ? 0 : areas.size();
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		Area area = areas.get(rowIndex);
		switch (columnIndex) {
			case 0:
				return area.title;
			case 1:
				return area.id;
			default:
				return "";
		}
	}

	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return true;
	}

	public void removeTableModelListener(TableModelListener listener) {
		listeners.remove(listener);
	}

	public void setValueAt(Object value, int rowIndex, int columnIndex) {
		switch (columnIndex) {
			case 0:
				areas.get(rowIndex).title = value.toString();
				break;
			case 1:
				areas.get(rowIndex).id = Integer.parseInt(value.toString());
				break;
			default:
		}
	}

}