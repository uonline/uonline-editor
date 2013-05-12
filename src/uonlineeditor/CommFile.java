package uonlineeditor;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author houjing
 */
public abstract class CommFile {

	private File file;
	private JFileChooser fc;

	public CommFile() {
		fc = new JFileChooser();
		fc.setFileFilter(getFileFilter());
		int ret = fc.showDialog(null, "Открыть файл");
		if (ret == JFileChooser.APPROVE_OPTION) {
			file = fc.getSelectedFile();
		}
	}

	public abstract FileNameExtensionFilter getFileFilter();

}