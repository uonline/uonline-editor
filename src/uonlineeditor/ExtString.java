package uonlineeditor;

import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author houjing
 */
public class ExtString {

	public static String join(String[] s, String delimiter) {
		StringBuilder buffer = new StringBuilder();
		for (int i = 0; i < s.length; i++) {
			buffer.append(s[i]);
			if (i != s.length - 1) {
				buffer.append(delimiter);
			}
		}
		return buffer.toString();
	}

	public static String join(Collection s, String delimiter) {
		StringBuilder buffer = new StringBuilder();
		Iterator iter = s.iterator();
		while (iter.hasNext()) {
			buffer.append(iter.next());
			if (iter.hasNext()) {
				buffer.append(delimiter);
			}
		}
	return buffer.toString();
}

}
