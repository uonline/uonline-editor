package uonlineeditor;

import au.com.bytecode.opencsv.CSVReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author houjing
 */
public class LocationsFile extends CommFile {

	public LocationsFile(int mode) {
		super(mode);
	}

	public FileNameExtensionFilter getFileFilter() {
		return new FileNameExtensionFilter("База данных локаций (*.uolb)", "uolb");
}

	List<Location> getLocations() {
		List<String[]> csvLocations = null;
		try {
			CSVReader cr = getCsvReader();
			csvLocations = cr.readAll();
			cr.close();
		} catch (IOException ex) {
			Logger.getLogger(AreasFile.class.getName()).log(Level.SEVERE, null, ex);
		}
		ArrayList<Location> ll = null;
		for (String[] scvStr: csvLocations) {
			ll.add(new Location(scvStr));
		}
		return ll;
	}

	void writeLocations(List<Location> l) {
		//
	}

}