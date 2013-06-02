package uonlineeditor;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author m1kc, houjing
 */
public class MainFrame extends javax.swing.JFrame {

	static MainFrame mf;

	Areas areas;
	AreasFile areasFile;
	LocationsFile locationsFile;

	String defaultTitle;
    /**
     * Creates new form MainFrame
     */
	public MainFrame() {
		try {
			javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
			Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
		}
		initComponents();
		setLocation(400, 100);

		defaultTitle = getTitle();
	}



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jTabbedPane1 = new javax.swing.JTabbedPane();
      jPanel1 = new javax.swing.JPanel();
      jButton1 = new javax.swing.JButton();
      jButton2 = new javax.swing.JButton();
      jButton3 = new javax.swing.JButton();
      jScrollPane4 = new javax.swing.JScrollPane();
      AreasTable = new javax.swing.JTable();
      jPanel2 = new javax.swing.JPanel();
      AreasComboBox = new javax.swing.JComboBox();
      jLabel1 = new javax.swing.JLabel();
      jComboBox2 = new javax.swing.JComboBox();
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jScrollPane2 = new javax.swing.JScrollPane();
      jTextArea1 = new javax.swing.JTextArea();
      jLabel4 = new javax.swing.JLabel();
      jTextField2 = new javax.swing.JTextField();
      jLabel5 = new javax.swing.JLabel();
      jScrollPane3 = new javax.swing.JScrollPane();
      jTable1 = new javax.swing.JTable();
      jButton6 = new javax.swing.JButton();
      jButton7 = new javax.swing.JButton();
      jButton4 = new javax.swing.JButton();
      jButton5 = new javax.swing.JButton();
      SaveAreasButton = new javax.swing.JButton();
      jButton9 = new javax.swing.JButton();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("Uonline Editor");

      jButton1.setText("Add");
      jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            AddNewArea(evt);
         }
      });

      jButton2.setText("Remove");
      jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            RemoveArea(evt);
         }
      });

      jButton3.setText("Rename");

      AreasTable.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {

         },
         new String [] {
            "Зона", "id"
         }
      ) {
         Class[] types = new Class [] {
            java.lang.String.class, java.lang.Integer.class
         };

         public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
         }
      });
      jScrollPane4.setViewportView(AreasTable);

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(jButton1)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jButton2)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jButton3)
                  .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
      );

      jTabbedPane1.addTab("Areas", jPanel1);

      jLabel1.setText("Area:");

      jLabel2.setText("Title:");

      jLabel3.setText("Description:");

      jTextArea1.setColumns(20);
      jTextArea1.setLineWrap(true);
      jTextArea1.setRows(5);
      jTextArea1.setWrapStyleWord(true);
      jScrollPane2.setViewportView(jTextArea1);

      jLabel4.setText("Picture URL:");

      jLabel5.setText("Ways:");

      jTable1.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {

         },
         new String [] {
            "Text", "Location"
         }
      ));
      jScrollPane3.setViewportView(jTable1);

      jButton6.setText("Add");

      jButton7.setText("Remove");

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel2Layout.createSequentialGroup()
                  .addComponent(jLabel4)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE))
               .addGroup(jPanel2Layout.createSequentialGroup()
                  .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel1)
                     .addComponent(jLabel2))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(AreasComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
               .addComponent(jScrollPane2)
               .addGroup(jPanel2Layout.createSequentialGroup()
                  .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
               .addGroup(jPanel2Layout.createSequentialGroup()
                  .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel3)
                     .addComponent(jLabel5))
                  .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(AreasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel1))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel2))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel4)
               .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel5)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel2Layout.createSequentialGroup()
                  .addComponent(jButton6)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jButton7)
                  .addGap(0, 113, Short.MAX_VALUE))
               .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGap(34, 34, 34))
      );

      jTabbedPane1.addTab("Locations", jPanel2);

      jButton4.setText("Load areas");
      jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            LoadAreas(evt);
         }
      });

      jButton5.setText("Load locations");
      jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            LoadLocations(evt);
         }
      });

      SaveAreasButton.setText("Save areas");
      SaveAreasButton.setEnabled(false);
      SaveAreasButton.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            SaveAreas(evt);
         }
      });

      jButton9.setText("Save locations");
      jButton9.setEnabled(false);
      jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            SaveLocations(evt);
         }
      });

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jTabbedPane1)
               .addGroup(layout.createSequentialGroup()
                  .addComponent(jButton4)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jButton5)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(SaveAreasButton)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jButton9)))
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jButton4)
               .addComponent(jButton5)
               .addComponent(SaveAreasButton)
               .addComponent(jButton9))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void LoadAreas(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadAreas
		AreasFile af = new AreasFile(CommFile.OPEN);
		if (!af.approved) return;
		areasFile = af;
		areas = areasFile.getAreas();
		AreasTable.setModel(areas);
		AreasComboBox.setModel(new DefaultComboBoxModel() {

			@Override
			public Object getElementAt(int index) {
				return mf.areas.getValueAt(index, Area.TITLE);
			}

			@Override
			public int getSize() {
				return mf.areas.getRowCount();
			}

			@Override
			public Object getSelectedItem() {
				int row = mf.AreasTable.getSelectedRow();
				if (row == -1) return "";
				return mf.areas.getValueAt(row, Area.TITLE);
			}

			@Override
			public void setSelectedItem(Object anObject) {
				int ind = areas.getRowNumberOf(anObject, Area.TITLE);
				mf.AreasTable.setRowSelectionInterval(ind, ind);
			}
		});
		SaveAreasButton.setEnabled(true);
   }//GEN-LAST:event_LoadAreas

	public int getSelectedRows() {
		return AreasTable.getSelectedRow();
	}

   private void LoadLocations(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoadLocations
		LocationsFile lf = new LocationsFile(CommFile.OPEN);
		if (!lf.approved) return;
		locationsFile = lf;
		areas.attachLocations(locationsFile.getLocations());
		//jTable1.setModel(locations);
   }//GEN-LAST:event_LoadLocations

   private void AddNewArea(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddNewArea
		if (areas == null) {
			areas = new Areas();
			AreasTable.setModel(areas);
			SaveAreasButton.setEnabled(true);
		}
		int sel = areas.addNewArea(AreasTable.getSelectedRow());
		AreasTable.setRowSelectionInterval(sel, sel);
		AreasTable.updateUI();
   }//GEN-LAST:event_AddNewArea

   private void RemoveArea(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoveArea
		int sel = areas.removeAreas(AreasTable.getSelectedRows());
		AreasTable.setRowSelectionInterval(sel, sel);
		AreasTable.updateUI();
   }//GEN-LAST:event_RemoveArea

   private void SaveAreas(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveAreas
		AreasFile af;
		if (areasFile == null) {
			System.out.println("areasFile is null");
			af = new AreasFile(CommFile.SAVE);
			if (!af.approved) return;
			areasFile = af;
		}
		areasFile.writeAreas(areas);
   }//GEN-LAST:event_SaveAreas

   private void SaveLocations(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveLocations
		LocationsFile lf;
		if (locationsFile == null) {
			lf = new LocationsFile(CommFile.SAVE);
			if (!lf.approved) return;
			locationsFile = lf;
		}
		locationsFile.writeLocations(areas.getLocations());
   }//GEN-LAST:event_SaveLocations

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
               mf = new MainFrame();
					mf.setVisible(true);
   }
        });
    }
   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JComboBox AreasComboBox;
   private javax.swing.JTable AreasTable;
   private javax.swing.JButton SaveAreasButton;
   private javax.swing.JButton jButton1;
   private javax.swing.JButton jButton2;
   private javax.swing.JButton jButton3;
   private javax.swing.JButton jButton4;
   private javax.swing.JButton jButton5;
   private javax.swing.JButton jButton6;
   private javax.swing.JButton jButton7;
   private javax.swing.JButton jButton9;
   private javax.swing.JComboBox jComboBox2;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JScrollPane jScrollPane2;
   private javax.swing.JScrollPane jScrollPane3;
   private javax.swing.JScrollPane jScrollPane4;
   private javax.swing.JTabbedPane jTabbedPane1;
   private javax.swing.JTable jTable1;
   private javax.swing.JTextArea jTextArea1;
   private javax.swing.JTextField jTextField2;
   // End of variables declaration//GEN-END:variables
}
