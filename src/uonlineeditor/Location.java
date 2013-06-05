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
	public static final int IS_DEFAULT = 5;
	public static final int IMAGE_URL = 6;

	public String title = "Location";
	public Ways ways = new Ways();
	public String description = "";
	public int id;
	public int area;
	public int isDefault = 0;
	public String imageURL = "";

	Location(int areaId, int lastId) {
		id = lastId;
		this.area = areaId;
		title += lastId;
	}

	Location(String[] data) {
		setParameters(data);
	}

	String[] asData() {
		String[] data = new String[] {title, ways.asData(), description, String.valueOf(id), String.valueOf(area), String.valueOf(isDefault), imageURL};
		return data;
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
			case IS_DEFAULT:
				isDefault = Integer.parseInt(s);
				break;
			case IMAGE_URL:
				imageURL = s;
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

	Object getParameter(int pos) {
		switch (pos) {
			case TITLE:
				return title;
			case WAYS:
				return ways.asData();
			case DESCRIPTION:
				return description;
			case ID:
				return id;
			case AREA:
				return area;
			case IS_DEFAULT:
				return isDefault;
			default:
				return "";
		}
	}

}
