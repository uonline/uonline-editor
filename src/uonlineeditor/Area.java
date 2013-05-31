package uonlineeditor;

import java.util.ArrayList;

/**
 *
 * @author houjing
 */
public class Area {

	private String title;
	private int id;
	private Locations locs = new Locations();

	Area (int lastId) {
		title = "";
		id = lastId;
}

	Area(String[] data) {
		//System.out.println("Area constructor");
		title = data[0];
		id = Integer.parseInt(data[1]);
	}

	String[] asData() {
		String[] data = {title, String.valueOf(id)};
		return data;
	}

	Object getParameter(int columnIndex) {
		switch (columnIndex) {
			case 0:
				return this.title;
			case 1:
				return this.id;
			default:
				return "";
		}
	}

	void setParameter (Object value, int columnIndex) {
		switch (columnIndex) {
			case 0:
				this.title = value.toString();
				break;
			case 1:
				this.id = Integer.parseInt(value.toString());
				break;
			default:
		}
	}

}
