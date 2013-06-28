package uonlineeditor;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.event.ListDataListener;

/**
 *
 * @author houjing
 */
public class Way {

	public int lid;
	public String desc = "Way";

	public static final int TEXT = 0;
	public static final int LOCATION_ID = 1;

	JComboBox cb = new JComboBox(new ComboBoxModel() {

		@Override
		public void setSelectedItem(Object anItem) {
			lid = Areas.getLocationId(anItem);
		}

		@Override
		public Object getSelectedItem() {
			return Areas.getLocationById(lid);
		}

		@Override
		public int getSize() {
			if (MainFrame.getSelectedArea() == null || MainFrame.getSelectedArea().locs == null) return 0;
			return Areas.getLocations().size();
		}

		@Override
		public Object getElementAt(int index) {
			return Areas.getLocations().get(index).getParameter(Location.TITLE);
		}

		@Override
		public void addListDataListener(ListDataListener l) {
		}

		@Override
		public void removeListDataListener(ListDataListener l) {
		}
	});

	Way(int lid) {
		this.lid = lid;
	}

	Way(String s) {
		String sa[] = s.split("=");
		if (sa.length > 1) {
			desc = sa[0];
			lid = Integer.parseInt(sa[1]);
		}
	}

	Way(String lid, String desc) {
		this.lid = Integer.parseInt(lid);
		this.desc = desc;
	}

	Object getParameter(int columnIndex) {
		switch (columnIndex) {
			case TEXT:
				return this.desc;
			case LOCATION_ID:
				return this.cb;
			default:
				return "";
		}
	}

	void setParameter (Object value, int columnIndex) {
		switch (columnIndex) {
			case TEXT:
				this.desc = value.toString();
				break;
			case LOCATION_ID:
				this.lid = Integer.parseInt(value.toString());
				break;
			default:
		}
	}

	String AsData() {
		return ExtString.join( new String [] {desc, Integer.toString(lid)}, "=");
	}

}
