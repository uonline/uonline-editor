package uonlineeditor;

/**
 *
 * @author houjing
 */
public class Utils {

	static String toString(int[] inp) {
		StringBuilder buffer = new StringBuilder();
		for (int i = 0; i < inp.length; i++) {
			buffer.append(String.valueOf(inp[i]));
			if (i != inp.length - 1) {
				buffer.append(", ");
			}
		}
		return "[" + buffer.toString() + "]";
	}
}
