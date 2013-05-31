package uonlineeditor;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author houjing
 */
public abstract class CommFile {

	private JFileChooser fc;
	protected File file;

	public CommFile() {
		//System.out.println("CommFile constructor");
		fc = new JFileChooser();
		fc.setFileFilter(getFileFilter());
		int ret = fc.showDialog(null, "Открыть файл");
		if (ret == JFileChooser.APPROVE_OPTION) {
			file = fc.getSelectedFile();
		}
	}

	protected CSVReader getCsvReader() {
		CSVReader cr = null;
		try {
			System.out.println(file);
			FileReader fr = new FileReader(file);
			cr = new CSVReader(fr);
		} catch (FileNotFoundException ex) { Logger.getLogger(AreasFile.class.getName()).log(Level.SEVERE, null, ex); }
		return cr;
	}

	protected CSVWriter getCsvWriter() {
		CSVWriter cw = null;
		try {
			cw = new CSVWriter(new FileWriter(file));
		} catch (IOException ex) { Logger.getLogger(AreasFile.class.getName()).log(Level.SEVERE, null, ex); }
		return cw;
	}

	public abstract FileNameExtensionFilter getFileFilter();

}