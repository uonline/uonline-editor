package uonlineeditor;

import java.util.ArrayList;

/**
 *
 * @author houjing
 */
public class Ways extends ArrayList {

	private ArrayList<Way> wlist = new ArrayList<>();
	private Way selected;
	private int lid;

	Ways(int lid) {
		this.lid = lid;
	}

	Ways(String s) {
		if (s.equals("")) return;
		String[] sl = s.split("\\|");
		for (int i = 0; i < sl.length; i++) {
			add(new Way(sl[i]));
		}
	}

	public Way getSelectedWay() {
		return selected;
	}

	Object getValueAt(int row, int column) {
		return get(row).getParameter(column);
	}

	public int size() {
		return wlist.size();
	}

	public Way get(int ind) {
		return wlist.get(ind);
	}

	public boolean add() {
		return add(new Way(lid));
	}

	public boolean add(Object way){
		wlist.add((Way) way);
		return false;
//		if (ind == -1 || ind > wlist.size() - 1) {
//			wlist.add(new Way());
//			return 0;
//		}
//		else if (wlist.size() == ind + 1) {
//			wlist.add(new Way());
//			return wlist.size()-1;
//		}
//		else {
//			wlist.add(ind + 1, new Way());
//			return  ind + 1;
//		}
	}

	public boolean remove() {
		return remove(getSelectedWay());
	}

	public boolean remove(Object way){
		wlist.remove(way);
		return false;
//		if (ind.length == 0 || wlist.size() == -1) return -1;
//		for (int i = ind.length - 1; i >= 0 ; i--) {
//			if (ind[i] >= wlist.size()) continue;
//			removeWay(ind[i]);
//		}
//		return ind[ind.length-1] == wlist.size() + 1 - ind.length ? wlist.size() - 1 : ind[0];
	}

	String asData() {
		String[] t = new String[size()];
		for (int i = 0; i < size(); i++) {
			t[i] = get(i).AsData();
		}
		return ExtString.join(t, "|");
	}

}
