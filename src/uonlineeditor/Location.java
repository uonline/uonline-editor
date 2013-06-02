package uonlineeditor;

/**
 *
 * @author houjing
 */

public class Location {

	public String title;
	public Ways ways;
	public String description;
	public int id;
	public int area;
	public int Default;

	Location(String[] data) {
		setParameters(data);
	}

	void setParameter(String s, int pos) {
		switch (pos) {
			case 0:
				title = s;
				break;
			case 1:
				ways = new Ways(s);
				break;
			case 2:
				description = s;
				break;
			case 3:
				id = Integer.parseInt(s);
				break;
			case 4:
				area = Integer.parseInt(s);
				break;
			case 5:
				Default = Integer.parseInt(s);
				break;
			default:
				break;
		}
	}

	void setParameters(String[] data) {
		for (int i = 0; i < data.length; i++) {
			setParameter(data[i], i);
		}
	}

	String getParameter(int pos) {
		switch (pos) {
			case 0:
				return title;
			case 1:
				return ways.asData();
			case 2:
				return description;
			case 3:
				return String.valueOf(id);
			case 4:
				return String.valueOf(area);
			case 5:
				return String.valueOf(Default);
			default:
				return "";
		}
	}

}
