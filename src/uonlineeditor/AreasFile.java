package uonlineeditor;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author houjing
 */


public class AreasFile extends CommFile {

	public AreasFile() {
		super();
		System.out.println("AreasFile constructor");
	}

	public FileNameExtensionFilter getFileFilter() {
		return new FileNameExtensionFilter("База данных зон (*.uoab)", "uoab");
}

	Areas getAreas() {
		List<String[]> csvAreas = null;
		try {
			csvAreas = csvReader.readAll();
		} catch (IOException ex) {
			Logger.getLogger(AreasFile.class.getName()).log(Level.SEVERE, null, ex);
		}
		return new Areas(csvAreas);
	}
}