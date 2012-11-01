/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ImageExporter.java
 *
 * Created on Oct 23, 2012, 8:31:45 PM
 */

package wheelencodergenerator;

import com.botthoughts.JFileChooser;
import com.botthoughts.JFileFilter;
import com.botthoughts.PlatformUtilities;
import java.awt.Component;
import java.io.File;
import javax.swing.Icon;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;
import org.jdesktop.application.Application;
import org.jdesktop.application.ResourceMap;

/**
 *
 * @author Michael Shimniok
 */
public class ImageExportChooser extends JDialog {

    private boolean validDirectory = false;
    private boolean validFile = false;
    private FileType[] types = new FileType[3];
    //private ImageIcon warningIcon = (ImageIcon) UIManager.getIcon("OptionPane.warningIcon");
    private ResourceMap myResourceMap = Application.getInstance(wheelencodergenerator.WheelEncoderGeneratorApp.class).getContext().getResourceMap(ImageExportChooser.class);
    private Icon warningIcon = myResourceMap.getIcon("icon.warning");
    private Icon blankIcon = myResourceMap.getIcon("fileWarnLabel.icon");
    public static int APPROVE_OPTION = 0;
    public static int CANCEL_OPTION = 1;
    private static int option;
    private static File selectedFile;
    private static String selectedType;
    private static int selectedResolution;
    private JFrame myParent;
    
    /** Creates new form ImageExporter */
    public ImageExportChooser() {
        types[0] = new FileType("PNG (*.png)", ".png", "png");
        types[1] = new FileType("GIF (*.gif)", ".gif", "gif");
        types[2] = new FileType("JPEG (*.jpg)", ".jpg", "jpg");

        initComponents();
//        directoryTextField.setText(new File("").getAbsolutePath());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        exportPanel = new javax.swing.JPanel();
        resolutionWarnLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fileTypeComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        resolutionTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        buttonPanel = new javax.swing.JPanel();
        exportButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(wheelencodergenerator.WheelEncoderGeneratorApp.class).getContext().getResourceMap(ImageExportChooser.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setMinimumSize(new java.awt.Dimension(250, 130));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setName("Form"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        exportPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("exportPanel.border.title"))); // NOI18N
        exportPanel.setMaximumSize(new java.awt.Dimension(9999, 9999));
        exportPanel.setMinimumSize(new java.awt.Dimension(250, 100));
        exportPanel.setName("exportPanel"); // NOI18N
        exportPanel.setPreferredSize(new java.awt.Dimension(250, 100));
        exportPanel.setLayout(new java.awt.GridBagLayout());

        resolutionWarnLabel.setVisible(true);
        resolutionWarnLabel.setIcon(resourceMap.getIcon("resolutionWarnLabel.icon")); // NOI18N
        resolutionWarnLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        resolutionWarnLabel.setName("resolutionWarnLabel"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        exportPanel.add(resolutionWarnLabel, gridBagConstraints);

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        exportPanel.add(jLabel1, gridBagConstraints);

        fileTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { types[0].getDescription(), types[1].getDescription(), types[2].getDescription() }));
        fileTypeComboBox.setSelectedIndex(0);
        fileTypeComboBox.setName("fileTypeComboBox"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 59;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        exportPanel.add(fileTypeComboBox, gridBagConstraints);

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        exportPanel.add(jLabel2, gridBagConstraints);

        resolutionTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        resolutionTextField.setText(resourceMap.getString("resolutionTextField.text")); // NOI18N
        resolutionTextField.setToolTipText(resourceMap.getString("resolutionTextField.toolTipText")); // NOI18N
        resolutionTextField.setInputVerifier(new NumberVerifier(0, 8192));
        resolutionTextField.setMaximumSize(new java.awt.Dimension(2147483647, 20));
        resolutionTextField.setMinimumSize(new java.awt.Dimension(65, 20));
        resolutionTextField.setName("resolutionTextField"); // NOI18N
        resolutionTextField.setPreferredSize(new java.awt.Dimension(65, 20));
        resolutionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resolutionTextFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        exportPanel.add(resolutionTextField, gridBagConstraints);

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        exportPanel.add(jLabel3, gridBagConstraints);

        buttonPanel.setMaximumSize(new java.awt.Dimension(9999, 9999));
        buttonPanel.setMinimumSize(new java.awt.Dimension(300, 35));
        buttonPanel.setName("buttonPanel"); // NOI18N
        buttonPanel.setPreferredSize(new java.awt.Dimension(300, 35));
        buttonPanel.setLayout(new java.awt.GridBagLayout());

        exportButton.setText(resourceMap.getString("exportButton.text")); // NOI18N
        exportButton.setActionCommand(resourceMap.getString("exportButton.actionCommand")); // NOI18N
        exportButton.setName("exportButton"); // NOI18N
        exportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 4);
        buttonPanel.add(exportButton, gridBagConstraints);

        cancelButton.setText(resourceMap.getString("cancelButton.text")); // NOI18N
        cancelButton.setName("cancelButton"); // NOI18N
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 4, 0, 0);
        buttonPanel.add(cancelButton, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exportPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
            .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(exportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportButtonActionPerformed
        doFileChoose();
    }//GEN-LAST:event_exportButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        doCancel();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void resolutionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resolutionTextFieldActionPerformed
        resolutionTextField.validate();
    }//GEN-LAST:event_resolutionTextFieldActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // This only seems to run when the dialog is closed with the close box
        option = CANCEL_OPTION;
    }//GEN-LAST:event_formWindowClosing


    /** State is set to reflect selection of the cancel button with CANCEL_OPTION
     * to be returned to the context calling showDialog()
     */
    private void doCancel() {
        option = CANCEL_OPTION;
        System.out.println("doCancel()");
        doExit();
    }

    /** Final close out of the window, hiding it
     */
    private void doExit() {
        setVisible(false);
    }

    /** Launch a modal JFileChooser to select the directory and file of the
     * image to be exported. If the chooser returns APPROVE_OPTION, then option
     * is set to APPROVE_OPTION and the selected file, type, and resolution are
     * stored to be accessed from the context that initiated the showDialog() call.
     * If the chooser responds with CANCEL_OPTION, so does this dialog
     */
    private void doFileChoose() {
        JFileChooser fc = new JFileChooser();
        //fc.setSelectedFile(new File(directoryTextField.getText(), filenameTextField.getText()));
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        fc.setFileFilter(types[fileTypeComboBox.getSelectedIndex()].getFf());
        fc.setAcceptAllFileFilterUsed(false);
        // This simulates modality that isn't present
        // when java.swing.JFileChooser is opened from a modal dialog
        this.setEnabled(false);
        selectedFile = null;
        if (fc.showDialog(this, "Select") == JFileChooser.APPROVE_OPTION) {
            selectedFile = fc.getSelectedFile();
            String path = selectedFile.getParent();
            String file = selectedFile.getName();
            String base = PlatformUtilities.getBasename(file);
            String ext = PlatformUtilities.getExtension(file);
            if (ext.equals("")) {
                ext = types[fileTypeComboBox.getSelectedIndex()].getExtension();
                selectedFile = new File(new File(selectedFile.getParent()), base + ext);
            }
            System.out.println("doBrowse(): path: "+path);
            System.out.println("doBrowse(): file: "+file);
            System.out.println("doBrowse(): file base: "+base);
            System.out.println("doBrowse(): file ext: "+ext);
            // TODO: check for bad file/directory ?
            ImageExportChooser.option = APPROVE_OPTION;
            selectedType = types[fileTypeComboBox.getSelectedIndex()].getType();
            selectedResolution = Integer.parseInt(resolutionTextField.getText());
            doExit();
        }
        // This simulates modality that isn't present
        // when java.swing.JFileChooser is opened from a modal dialog
        this.setEnabled(true);
        if (myParent != null)
            myParent.toFront();
        this.toFront();
        this.requestFocus();
        this.repaint();
    }



    /** return the selected resolution in pixels as int
     *
     * @return int pixels resolution e.g., 600
     */
    public static int getSelectedResolution() {
       return selectedResolution;
    }

    /** return the selected file type
     *
     * @return selected file type
     */
    public static String getSelectedFileType() {
        return selectedType;
    }


    /** return the selected file as a File
     *
     * @return File the file selected for exporting
     */
    public static File getSelectedFile() {
        return selectedFile;
    }

    /** return selected user option
     *
     * @return option, APPROVE_OPTION or CANCEL_OPTION
     */
    public static int getOption() {
        return option;
    }

    /** display modal dialog and return user selection option
     *
     * @return user selection option as int, described by Options enum
     */
    public static int showDialog(Component parent) {
        ImageExportChooser chooser = new ImageExportChooser();
        chooser.myParent = (JFrame) parent;
        chooser.setLocationRelativeTo(parent);
        chooser.setModal(true);
        chooser.setVisible(true);
        return ImageExportChooser.getOption();
    }

    /** the dialog can be run standalone
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ImageExportChooser exporter = new ImageExportChooser();
                exporter.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton exportButton;
    private javax.swing.JPanel exportPanel;
    private javax.swing.JComboBox fileTypeComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField resolutionTextField;
    private javax.swing.JLabel resolutionWarnLabel;
    // End of variables declaration//GEN-END:variables

    // End of variables declaration

    /** Class to verify resolution number input
     *
     */
    private class NumberVerifier extends InputVerifier {

        private Integer min = null;
        private Integer max = null;

        /** creates a new instance of the number verifier
         *
         */
        public NumberVerifier() {
        }

        /** creates a new instance of the number verifier
         *
         * @param min is the minium value allowed
         * @param max is the maximum value allowed
         */
        public NumberVerifier(Integer min, Integer max) {
            this.min = min;
            this.max = max;
        }

        /** verifies correctness of the input; it must be between
         * min and max inclusive and be all-numeric
         *
         * @param input the input to verify
         * @return true if verified ok, false otherwise
         */
        @Override
        public boolean verify(JComponent input) {
            boolean result = true;
            JTextField textField = (JTextField) input;
            String valStr = textField.getText();

            try {
                Integer val = Integer.parseInt(valStr);
                if (min != null && val < min) {
                    resolutionTextField.setText(min.toString());
                    result = false;
                }
                if (max != null && val > max) {
                    resolutionTextField.setText(max.toString());
                    result = false;
                }
            } catch (NumberFormatException ex) {
                result = false;
                resolutionTextField.setText("600");
            }

            return result;
        }

    }


    /** Class for holding file type information including file filter,
     * description, extension, and type to be used for convenience and
     * flexibility in the code. Simply create and add a new one of these
     * to the array and the file chooser and image export are handled
     */
    private class FileType {
        private JFileFilter ff;
        private String description;
        private String extension;
        private String type;

        /** Creates a new FileType instance
         *
         * @param description text description of the image (E.g., "PNG (*.png)"
         * @param extension extension e.g., ".png"
         * @param type the type to submit for image exporting (e.g., "png")
         */
        public FileType(String description, String extension, String type) {
            ff = new JFileFilter(description, extension);
            this.description = description;
            this.extension = extension;
            this.type = type;
        }

        /** get the associated file filter
         * @return the ff
         */
        public JFileFilter getFf() {
            return ff;
        }

        /** set a file filter
         * @param ff the ff to set
         */
        public void setFf(JFileFilter ff) {
            this.ff = ff;
        }

        /** get the description
         * @return the description
         */
        public String getDescription() {
            return description;
        }

        /** set the description
         * @param description the description to set
         */
        public void setDescription(String description) {
            this.description = description;
        }

        /** get the extension
         * @return the extension
         */
        public String getExtension() {
            return extension;
        }

        /** set the extension
         * @param extension the extension to set
         */
        public void setExtension(String extension) {
            this.extension = extension;
        }

        /** get the image type
         * @return the image type
         */
        public String getType() {
            return type;
        }

        /** set the image type
         * @param type the image type to set
         */
        public void setType(String type) {
            this.type = type;
        }
    }
}
