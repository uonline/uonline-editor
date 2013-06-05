package uonlineeditor;

/**
 *
 * @author houjing
 */
public class Area {

	private String title = "Area";
	private int id;
	public Locations locs;

	public static final int TITLE = 0;
	public static final int ID = 1;

	Area (int lastId) {
		title += lastId;
		id = lastId;
		locs = new Locations(id);
	}

	Area(String[] data) {
		title = data[0];
		id = Integer.parseInt(data[1]);
		locs = new Locations(id);
	}

	String[] asData() {
		String[] data = {title, String.valueOf(id)};
		return data;
	}

	Object getParameter(int columnIndex) {
		switch (columnIndex) {
			case TITLE:
				return this.title;
			case ID:
				return this.id;
			default:
				return "";
		}
	}

	void setParameter (Object value, int columnIndex) {
		switch (columnIndex) {
			case TITLE:
				this.title = value.toString();
				break;
			case ID:
				this.id = Integer.parseInt(value.toString());
				break;
			default:
		}
	}

	void addLocation(Location l) {
		locs.locs.add(l);
	}

}
