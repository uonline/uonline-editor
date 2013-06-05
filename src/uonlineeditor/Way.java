package uonlineeditor;

/**
 *
 * @author houjing
 */
public class Way {

	public int lid;
	public String desc;

	public Way(String s) {
		String sa[] = s.split("=");
		desc = sa[0];
		lid = Integer.parseInt(sa[1]);
	}

	public Way(String lid, String desc) {
		this.lid = Integer.parseInt(lid);
		this.desc = desc;
	}

	public String AsData() {
		return ExtString.join( new String [] {desc, Integer.toString(lid)}, "=");
	}

}
