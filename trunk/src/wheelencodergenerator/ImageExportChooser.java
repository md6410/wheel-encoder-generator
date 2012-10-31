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
        directoryTextField.setText(new File("").getAbsolutePath());
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

        filePanel = new javax.swing.JPanel();
        fileWarnLabel = new javax.swing.JLabel();
        directoryWarnLabel = new javax.swing.JLabel();
        filenameTextField = new javax.swing.JTextField();
        directoryTextField = new javax.swing.JTextField();
        browseButton = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        exportPanel = new javax.swing.JPanel();
        resolutionWarnLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fileTypeComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        resolutionTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        exportButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(wheelencodergenerator.WheelEncoderGeneratorApp.class).getContext().getResourceMap(ImageExportChooser.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setMinimumSize(new java.awt.Dimension(440, 235));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setName("Form"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        filePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("filePanel.border.title"))); // NOI18N
        filePanel.setMaximumSize(new java.awt.Dimension(9999, 9999));
        filePanel.setMinimumSize(new java.awt.Dimension(400, 90));
        filePanel.setName("filePanel"); // NOI18N
        filePanel.setPreferredSize(new java.awt.Dimension(400, 90));
        filePanel.setLayout(new java.awt.GridBagLayout());

        fileWarnLabel.setVisible(true);
        fileWarnLabel.setIcon(resourceMap.getIcon("fileWarnLabel.icon")); // NOI18N
        fileWarnLabel.setText(resourceMap.getString("fileWarnLabel.text")); // NOI18N
        fileWarnLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        fileWarnLabel.setName("fileWarnLabel"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        filePanel.add(fileWarnLabel, gridBagConstraints);

        directoryWarnLabel.setVisible(true);
        directoryWarnLabel.setIcon(resourceMap.getIcon("directoryWarnLabel.icon")); // NOI18N
        directoryWarnLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        directoryWarnLabel.setName("directoryWarnLabel"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        filePanel.add(directoryWarnLabel, gridBagConstraints);

        filenameTextField.setText(resourceMap.getString("filenameTextField.text")); // NOI18N
        filenameTextField.setMaximumSize(new java.awt.Dimension(9999, 20));
        filenameTextField.setMinimumSize(new java.awt.Dimension(150, 20));
        filenameTextField.setName("filenameTextField"); // NOI18N
        filenameTextField.setPreferredSize(new java.awt.Dimension(9999, 20));
        filenameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filenameTextFieldActionPerformed(evt);
            }
        });
        filenameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                filenameTextFieldFocusLost(evt);
            }
        });
        filenameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filenameTextFieldKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        filePanel.add(filenameTextField, gridBagConstraints);

        directoryTextField.setText(resourceMap.getString("directoryTextField.text")); // NOI18N
        directoryTextField.setMaximumSize(new java.awt.Dimension(9999, 20));
        directoryTextField.setMinimumSize(new java.awt.Dimension(200, 20));
        directoryTextField.setName("directoryTextField"); // NOI18N
        directoryTextField.setPreferredSize(new java.awt.Dimension(9999, 20));
        directoryTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directoryTextFieldActionPerformed(evt);
            }
        });
        directoryTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                directoryTextFieldFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        filePanel.add(directoryTextField, gridBagConstraints);

        browseButton.setText(resourceMap.getString("browseButton.text")); // NOI18N
        browseButton.setName("browseButton"); // NOI18N
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        filePanel.add(browseButton, gridBagConstraints);

        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        filePanel.add(jLabel4, gridBagConstraints);

        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        filePanel.add(jLabel5, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(filePanel, gridBagConstraints);

        exportPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(resourceMap.getString("exportPanel.border.title"))); // NOI18N
        exportPanel.setMaximumSize(new java.awt.Dimension(9999, 9999));
        exportPanel.setMinimumSize(new java.awt.Dimension(200, 100));
        exportPanel.setName("exportPanel"); // NOI18N
        exportPanel.setPreferredSize(new java.awt.Dimension(200, 100));
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
        fileTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileTypeComboBoxActionPerformed(evt);
            }
        });
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
        resolutionTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                resolutionTextFieldKeyReleased(evt);
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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(exportPanel, gridBagConstraints);

        jPanel1.setMaximumSize(new java.awt.Dimension(9999, 9999));
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(75, 33));

        exportButton.setText(resourceMap.getString("exportButton.text")); // NOI18N
        exportButton.setActionCommand(resourceMap.getString("exportButton.actionCommand")); // NOI18N
        exportButton.setEnabled(false);
        exportButton.setName("exportButton"); // NOI18N
        exportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportButtonActionPerformed(evt);
            }
        });
        jPanel1.add(exportButton);

        cancelButton.setText(resourceMap.getString("cancelButton.text")); // NOI18N
        cancelButton.setName("cancelButton"); // NOI18N
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cancelButton);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fileTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileTypeComboBoxActionPerformed
        validateFile();
    }//GEN-LAST:event_fileTypeComboBoxActionPerformed

    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
        doBrowse();
    }//GEN-LAST:event_browseButtonActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // Initialize stuff here
        if (selectedFile != null) {
            filenameTextField.setText(selectedFile.getName());
            directoryTextField.setText(selectedFile.getParent());
        }
        validateFile();
        validateDirectory();
    }//GEN-LAST:event_formComponentShown

    private void filenameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_filenameTextFieldFocusLost
        validateFile();
    }//GEN-LAST:event_filenameTextFieldFocusLost

    private void filenameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filenameTextFieldActionPerformed
        validateFile();
    }//GEN-LAST:event_filenameTextFieldActionPerformed

    private void directoryTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directoryTextFieldActionPerformed
        validateDirectory();
    }//GEN-LAST:event_directoryTextFieldActionPerformed

    private void directoryTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_directoryTextFieldFocusLost
        validateDirectory();
    }//GEN-LAST:event_directoryTextFieldFocusLost

    private void exportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportButtonActionPerformed
        doExport();
    }//GEN-LAST:event_exportButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        doCancel();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        System.out.println("formWindowActivated()");
    }//GEN-LAST:event_formWindowActivated

    private void resolutionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resolutionTextFieldActionPerformed
        resolutionTextField.validate();
    }//GEN-LAST:event_resolutionTextFieldActionPerformed

    private void filenameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filenameTextFieldKeyReleased
        exportButton.setEnabled(validDirectory && validFile && !filenameTextField.getText().equals(""));
    }//GEN-LAST:event_filenameTextFieldKeyReleased

    private void resolutionTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_resolutionTextFieldKeyReleased
        /* different behavior possible -- validate, warn while typing */
    }//GEN-LAST:event_resolutionTextFieldKeyReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // This only seems to run when the dialog is closed with the close box
        option = CANCEL_OPTION;
    }//GEN-LAST:event_formWindowClosing

    /** return the basename of a file (extension removed)
     *
     * @param filename is the name of a file as a String
     * @return the basename of the file with extension removed
     */
    public static String getBasename(String filename) {
        String result="";

        if (filename != null && !filename.equals("")) {
            int lastDot = filename.lastIndexOf(".");
            if (lastDot >= 0)
                result = filename.substring(0, lastDot);
            else
                result = filename;
        }

        return result;
    }

    /** extract the extension of a file string
     *
     * @param filename is the name of a file
     * @return the extension (e.g., ".txt") or "" if no extension present
     */
    public static String getExtension(String filename) {
        String result="";

        if (filename != null && !filename.equals("")) {
            int lastDot = filename.lastIndexOf(".");
            if (lastDot >= 0)
                result = filename.substring(lastDot, filename.length());
        }

        return result;
    }

    /** Display warning icon and set invalid file state
     *
     * @param msg used to set tooltip text for the warning icon
     */
    public void fileWarning(String msg) {
        if (msg == null || msg.equals("")) {
            fileWarnLabel.setToolTipText("Ok");
            fileWarnLabel.setIcon(blankIcon);
            validFile = true;
        } else {
            fileWarnLabel.setToolTipText(msg);
            fileWarnLabel.setIcon(warningIcon);
            validFile = false;
        }
        exportButton.setEnabled(validDirectory && validFile && !filenameTextField.getText().equals(""));
    }

    /** Display warning icon and set invalid directory state
     *
     * @param msg used to set tooltip text for the warning icon
     */
    public void directoryWarning(String msg) {
        if (msg == null || msg.equals("")) {
            directoryWarnLabel.setToolTipText("Ok");
            directoryWarnLabel.setIcon(blankIcon);
            validDirectory = true;
        } else {
            directoryWarnLabel.setToolTipText(msg);
            directoryWarnLabel.setIcon(warningIcon);
            validDirectory = false;
        }
        exportButton.setEnabled(validDirectory && validFile && !filenameTextField.getText().equals(""));
    }

    /** Validate directory input and set appropriate warnings
     * 
     */
    public void validateDirectory() {
        /* validate directory */
        File d = new File(this.directoryTextField.getText());
        if (d == null || !d.exists() || !d.isDirectory()) {
            directoryWarning("Invalid directory");
        } else if (!d.canWrite()) {
            directoryWarning("Can't open directory");
        } else {
            directoryWarning(null);
        }
    }

    // TODO: if the selected file is actually a directory it'd be nice if we just blanked out the filename and changed the directory accordingly

    /** Validate file user input and set appropriate warnings
     *
     */
    public void validateFile() {
        /* validate file */
        File file = new File(filenameTextField.getText());
        String fn = file.getName();
        String f = getBasename(fn);
        String e = getExtension(fn);
        /* fix extension only if filename not blank */
        if (fn.equals("")) {
            fileWarning(null);
        } else {
            /* if extension blank, set to current selected type */
            if (e.equals("")) {
                int sel = fileTypeComboBox.getSelectedIndex();
                e = types[sel].getExtension();
                filenameTextField.setText(f + e);
            }
            /* validate extension */
            boolean invalid = true;
            for (int i=0; i < types.length; i++) {
                if (types[i].getExtension().equals(e)) {
                    /* if extension is valid, update the selected file type to match */
                    fileTypeComboBox.setSelectedIndex(i);
                    invalid = false;
                }
            }
            if (invalid) {
                fileWarning("Invalid file type selected");
            } else {
                /* check file */
                if (file == null) {
                    fileWarning("Null filename");
                } else {
                    fileWarning(null);
                }
            } // if (invalid) else
        } // if fn not blank
    } // validateInput()


    /** Upon user selection of the export button, if the input is valid
     * set the object's state: the option selected is set to APPROVE_OPTION or
     * CANCEL_OPTION, the selected file, type, and resolution are stored to be
     * accessed from the context that initiated the showDialog() call.
     */
    private void doExport() {
        validateFile();
        validateDirectory();
        if (validFile && validDirectory) {
            option = APPROVE_OPTION;
            System.out.println("doExport(): filename: "+filenameTextField.getText());

            File d = new File(directoryTextField.getText());
            selectedFile = new File(directoryTextField.getText(), filenameTextField.getText());
            selectedType = types[fileTypeComboBox.getSelectedIndex()].getType();
            selectedResolution = Integer.parseInt(resolutionTextField.getText());
            doExit();
        }
    }

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
        System.out.println("doExit(): filename: "+filenameTextField.getText());
    }

    /** Launch a modal JFileChooser to select the directory and file of the
     * image to be exported.
     */
    private void doBrowse() {
        JFileChooser fc = new JFileChooser();
        System.out.println("doBrowse(): filename: "+filenameTextField.getText());
        fc.setSelectedFile(new File(directoryTextField.getText(), filenameTextField.getText()));
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        // This simulates modality that isn't present
        // when java.swing.JFileChooser is opened from a modal dialog
        this.setEnabled(false);
        if (fc.showDialog(this, "Select") == JFileChooser.APPROVE_OPTION) {
            File selected = fc.getSelectedFile();
            String path = selected.getParent();
            String file = selected.getName();
            String base = getBasename(file);
            String ext = getExtension(file);
            System.out.println("doBrowse(): path: "+path);
            System.out.println("doBrowse(): file: "+file);
            System.out.println("doBrowse(): file base: "+base);
            System.out.println("doBrowse(): file ext: "+ext);
            directoryTextField.setText(path);
            filenameTextField.setText(file);
            validateDirectory();
            validateFile();
        }
        // This simulates modality that isn't present
        // when java.swing.JFileChooser is opened from a modal dialog
        this.setEnabled(true);
        myParent.toFront();
        this.toFront();
        this.requestFocus();
        this.repaint();
    }

    /** set the filename field (deprecated)
     *
     * @param filename the filename to be set
     */
    public void setFilename(String filename) {
        filenameTextField.setText(filename);
        validateDirectory();
    }


    /** set the directory field (deprecated)
     *
     * @param directory the directory to set
     */
    public void setDirectory(String directory) {
        directoryTextField.setText(directory);
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
    private javax.swing.JToggleButton browseButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField directoryTextField;
    private javax.swing.JLabel directoryWarnLabel;
    private javax.swing.JButton exportButton;
    private javax.swing.JPanel exportPanel;
    private javax.swing.JPanel filePanel;
    private javax.swing.JComboBox fileTypeComboBox;
    private javax.swing.JLabel fileWarnLabel;
    private javax.swing.JTextField filenameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
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
