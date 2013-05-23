package uonlineeditor;

/**
 *
 * @author houjing
 */
public class Area {

	public String title;
	public int id;

	Area (int lastId) {
		title = "";
		id = lastId;
}

	Area(String[] data) {
		//System.out.println("Area constructor");
		title = data[0];
		id = Integer.parseInt(data[1]);
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
