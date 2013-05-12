package uonlineeditor;

/**
 *
 * @author houjing
 */
class Ways {

	public Way wlist[];

	public Ways(String s) {
		String[] sl = s.split("\\|");
		wlist = new Way[sl.length];
		for (int i = 0; i < sl.length; i++) {
			wlist[i] = new Way(sl[i]);
		}
	}

	public String AsData() {
		String[] t = new String[wlist.length];
		for (int i = 0; i < wlist.length; i++) {
			t[i] = wlist[i].AsData();
		}
		return ExtString.join(t, "|");
	}

}
