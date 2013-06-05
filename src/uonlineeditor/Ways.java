package uonlineeditor;

import java.util.ArrayList;

/**
 *
 * @author houjing
 */
public class Ways {

	public ArrayList<Way> wlist = new ArrayList<>();

	Ways() {}

	public Ways(String s) {
		String[] sl = s.split("\\|");
		for (int i = 0; i < sl.length; i++) {
			wlist.add(new Way(sl[i]));
		}
	}

	public String asData() {
		String[] t = new String[wlist.size()];
		for (int i = 0; i < wlist.size(); i++) {
			t[i] = wlist.get(i).AsData();
		}
		return ExtString.join(t, "|");
	}

}
