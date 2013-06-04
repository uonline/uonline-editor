package uonlineeditor;

/**
 *
 * @author houjing
 */

public class Location {

	public static final int TITLE = 0;
	public static final int WAYS = 1;
	public static final int DESCRIPTION = 2;
	public static final int ID = 3;
	public static final int AREA = 4;
	public static final int ISDEFAULT = 5;

	public String title = "Location";
	public Ways ways;
	public String description = "";
	public int id;
	public int area;
	public int isDefault = 0;

	Location(int area, int lastId) {
		id = lastId;
		this.area = area;
		title += lastId;
	}

	Location(String[] data) {
		setParameters(data);
	}

	final void setParameter(String s, int pos) {
		switch (pos) {
			case TITLE:
				title = s;
				break;
			case WAYS:
				ways = new Ways(s);
				break;
			case DESCRIPTION:
				description = s;
				break;
			case ID:
				id = Integer.parseInt(s);
				break;
			case AREA:
				area = Integer.parseInt(s);
				break;
			case ISDEFAULT:
				isDefault = Integer.parseInt(s);
				break;
			default:
				break;
		}
	}

	final void setParameters(String[] data) {
		for (int i = 0; i < data.length; i++) {
			setParameter(data[i], i);
		}
	}

	String getParameter(int pos) {
		switch (pos) {
			case TITLE:
				return title;
			case WAYS:
				return ways.asData();
			case DESCRIPTION:
				return description;
			case ID:
				return String.valueOf(id);
			case AREA:
				return String.valueOf(area);
			case ISDEFAULT:
				return String.valueOf(isDefault);
			default:
				return "";
		}
	}

}
