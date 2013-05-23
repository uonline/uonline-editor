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
public class LocationsFile extends CommFile {

	public FileNameExtensionFilter getFileFilter() {
		return new FileNameExtensionFilter("База данных локаций (*.uolb)", "uolb");
}

	Locations getLocations() {
		List<String[]> csvLocations = null;
		try {
			csvLocations = csvReader.readAll();
		} catch (IOException ex) {
			Logger.getLogger(AreasFile.class.getName()).log(Level.SEVERE, null, ex);
		}
		return new Locations(csvLocations);
	}

}