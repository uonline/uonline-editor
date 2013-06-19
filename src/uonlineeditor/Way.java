package uonlineeditor;

/**
 *
 * @author houjing
 */
public class Way {

	public int lid;
	public String desc;

	public static final int TEXT = 0;
	public static final int LOCATION_ID = 1;

	Way(String s) {
		String sa[] = s.split("=");
		desc = sa[0];
		lid = Integer.parseInt(sa[1]);
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
				return this.lid;
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
