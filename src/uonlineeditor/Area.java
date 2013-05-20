package uonlineeditor;

/**
 *
 * @author houjing
 */
public class Area {

	public String title;
	public int id;

	public Area(String[] data) {
		System.out.println("Area constructor");
		title = data[0];
		id = Integer.parseInt(data[1]);
	}

}
