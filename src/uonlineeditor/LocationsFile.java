package uonlineeditor;

import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author houjing
 */
public class LocationsFile extends CommFile {

	public FileNameExtensionFilter getFileFilter() {
		return new FileNameExtensionFilter("База данных локаций (*.uolb)", "uolb");
}

}