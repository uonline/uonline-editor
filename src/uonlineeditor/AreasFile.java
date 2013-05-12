package uonlineeditor;

import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author houjing
 */
public class AreasFile extends CommFile {

	public FileNameExtensionFilter getFileFilter() {
		return new FileNameExtensionFilter("База данных зон (*.uoab)", "uoab");
}
}