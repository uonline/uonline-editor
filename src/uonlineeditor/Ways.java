package uonlineeditor;

import java.util.ArrayList;

/**
 *
 * @author houjing
 */
public class Ways {

	ArrayList<Way> wlist = new ArrayList<>();

	Ways() {}

	Ways(String s) {
		if (s.equals("")) return;
		String[] sl = s.split("\\|");
		for (int i = 0; i < sl.length; i++) {
			wlist.add(new Way(sl[i]));
		}
	}

	int addWay(int ind){
		if (ind == -1 || ind > wlist.size() - 1) {
			wlist.add(new Way());
			return 0;
		}
		else if (wlist.size() == ind + 1) {
			wlist.add(new Way());
			return wlist.size()-1;
		}
		else {
			wlist.add(ind + 1, new Way());
			return  ind + 1;
		}
	}

	void removeWay(int ind){
		wlist.remove(ind);
	}

	int removeWays(int [] ind){
		if (ind.length == 0 || wlist.size() == -1) return -1;
		for (int i = ind.length - 1; i >= 0 ; i--) {
			if (ind[i] >= wlist.size()) continue;
			removeWay(ind[i]);
		}
		return ind[ind.length-1] == wlist.size() + 1 - ind.length ? wlist.size() - 1 : ind[0];
	}

	String asData() {
		String[] t = new String[wlist.size()];
		for (int i = 0; i < wlist.size(); i++) {
			t[i] = wlist.get(i).AsData();
		}
		return ExtString.join(t, "|");
	}

}
