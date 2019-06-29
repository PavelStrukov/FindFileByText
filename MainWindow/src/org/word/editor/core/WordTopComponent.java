/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.word.editor.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.util.Exceptions;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(
        dtd = "-//org.word.editor.core//Word//EN",
        autostore = false
)
@TopComponent.Description(
        preferredID = "WordTopComponent",
        //iconBase="SET/PATH/TO/ICON/HERE", 
        persistenceType = TopComponent.PERSISTENCE_ALWAYS
)
@TopComponent.Registration(mode = "editor", openAtStartup = true)
@ActionID(category = "Window", id = "org.word.editor.core.WordTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_WordAction",
        preferredID = "WordTopComponent"
)
@Messages({
    "CTL_WordAction=Word",
    "CTL_WordTopComponent=Word Window",
    "HINT_WordTopComponent=This is a Word window"
})
public final class WordTopComponent extends TopComponent {

    //private Component component;
    public WordTopComponent() {
        initComponents();
        setName(Bundle.CTL_WordTopComponent());
        setToolTipText(Bundle.HINT_WordTopComponent());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Filter = new javax.swing.JButton();
        typeOfFile = new javax.swing.JTextField();
        rootDirectory = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        TabPanel = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        FileTextArea = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPaneSystemFiles = new javax.swing.JScrollPane();
        TreeSystemFiles = new javax.swing.JTree();
        SelectAll = new javax.swing.JButton();

        org.openide.awt.Mnemonics.setLocalizedText(Filter, org.openide.util.NbBundle.getMessage(WordTopComponent.class, "WordTopComponent.Filter.text")); // NOI18N
        Filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilterActionPerformed(evt);
            }
        });

        typeOfFile.setText(org.openide.util.NbBundle.getMessage(WordTopComponent.class, "WordTopComponent.typeOfFile.text")); // NOI18N
        typeOfFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeOfFileActionPerformed(evt);
            }
        });

        rootDirectory.setText(org.openide.util.NbBundle.getMessage(WordTopComponent.class, "WordTopComponent.rootDirectory.text")); // NOI18N
        rootDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootDirectoryActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(WordTopComponent.class, "WordTopComponent.jLabel1.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(WordTopComponent.class, "WordTopComponent.jLabel2.text")); // NOI18N

        text.setColumns(20);
        text.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        text.setRows(5);
        text.setText(org.openide.util.NbBundle.getMessage(WordTopComponent.class, "WordTopComponent.text.text")); // NOI18N
        jScrollPane1.setViewportView(text);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        TabPanel.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                TabPanelInputMethodTextChanged(evt);
            }
        });

        FileTextArea.setEditable(false);
        FileTextArea.setColumns(20);
        FileTextArea.setRows(5);
        jScrollPane2.setViewportView(FileTextArea);

        TabPanel.addTab("tab1", jScrollPane2);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        TreeSystemFiles.setModel(null);
        jScrollPaneSystemFiles.setViewportView(TreeSystemFiles);

        org.openide.awt.Mnemonics.setLocalizedText(SelectAll, org.openide.util.NbBundle.getMessage(WordTopComponent.class, "WordTopComponent.SelectAll.text")); // NOI18N
        SelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPaneSystemFiles, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(typeOfFile, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addGap(120, 120, 120)
                                .addComponent(Filter, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rootDirectory, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
                                .addGap(99, 99, 99)))
                        .addGap(0, 43, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TabPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(SelectAll, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rootDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeOfFile, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Filter, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TabPanel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SelectAll, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneSystemFiles)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    ArrayList<File> allDirectories = new ArrayList<>();
    ArrayList<File> allFilteredFiles = new ArrayList<>();
    ArrayList<File> allFilesAndDirectories = new ArrayList<>();

    private void FilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilterActionPerformed
        allFilesAndDirectories.clear();
        String findText = text.getText();
        File homeDirectory = new File(rootDirectory.getText());

        if (rootDirectory.getText().equals("")) {
            System.out.println("Path is empty");
        }

        allDirectories.add(homeDirectory);
        getDirs(homeDirectory);

        //Filtering Files and Directories
        for (File currentDirectory : allDirectories) {
            File[] arrayFilteredFiles = currentDirectory.listFiles(new Filter(getTypeOfFile(), findText));
            if (arrayFilteredFiles.length == 0) {
                continue;
            }
            ArrayList<File> listFilteredFilesTemp = new ArrayList<>(Arrays.asList(arrayFilteredFiles));
            allFilesAndDirectories.add(currentDirectory);
            allFilesAndDirectories.addAll(listFilteredFilesTemp);
        }

        getFiles(allFilesAndDirectories);

        createTree(homeDirectory);

        //tree that allows one selection at a time.
        TreeSystemFiles.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);

        //Listen for when the selection changes.
        TreeSystemFiles.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) TreeSystemFiles.getLastSelectedPathComponent();
                String selectedFileString = selectedNode.getUserObject().toString();
                File selectedFile = findFile(selectedFileString);
                getContentFile(selectedFile);
            }

        });

        //clear all at the end of action
        allDirectories.clear();
        allFilteredFiles.clear();

    }//GEN-LAST:event_FilterActionPerformed

    void createTree(File homeDir) {
        DefaultMutableTreeNode top = new DefaultMutableTreeNode(homeDir.getName());

        createNodes(top, allFilesAndDirectories);
        TreeSystemFiles = new JTree(top);
        jScrollPaneSystemFiles.setViewportView(TreeSystemFiles);

    }

    void createNodes(DefaultMutableTreeNode top, ArrayList<File> filesAndDirectories) {
        top.removeAllChildren();
        DefaultMutableTreeNode dir = null;
        DefaultMutableTreeNode file = null;
        int count = 0;

        //create a hierarchy of directories
        for (File directory : allDirectories) {
            if (count == 0) {//pass root
                dir = top;
                count++;
                continue;
            }
            if (checkParentDir(dir, directory)) {//if true -> dir is a parent of fileOrDirectory
                dir.add(new DefaultMutableTreeNode(directory.getName()));//just add directory
            } else {
                dir = dir.getLastLeaf();//change last dir
                dir.add(new DefaultMutableTreeNode(directory.getName()));
            }
            count++;
        }

        //enumeration of directories in the tree
        Enumeration e = top.breadthFirstEnumeration();

        //add Files
        for (File tempFile : allFilteredFiles) {
            file = new DefaultMutableTreeNode(tempFile.getName());
            e = top.breadthFirstEnumeration();//because the structure of the tree have already changed
            while (e.hasMoreElements()) {
                dir = (DefaultMutableTreeNode) e.nextElement();
                if (checkParentDir(dir, tempFile)) {
                    dir.add(file);
                    break;
                }
            }
        }
        e = top.breadthFirstEnumeration();
        //clear empty dirs
        while (e.hasMoreElements()) {
            dir = (DefaultMutableTreeNode) e.nextElement();
            if (dir.isLeaf() && nodeIsDirectory(dir)) {
                DefaultMutableTreeNode parent = (DefaultMutableTreeNode) dir.getParent();
                parent.remove(dir);
                e = top.breadthFirstEnumeration();
            }

        }

    }

    File findDir(String dir) {
        for (File directory : allFilesAndDirectories) {
            if (directory.getName().equals(dir)) {
                return directory;
            }
        }
        return null;
    }

    File findFile(String file) {
        for (File filteredFile : allFilesAndDirectories) {
            if (filteredFile.getName().equals(file)) {
                return filteredFile;
            }
        }
        return null;
    }

    boolean nodeIsFile(DefaultMutableTreeNode node) {
        String nodeString = node.getUserObject().toString();
        for (File file : allFilteredFiles) {
            if (file.getName().equals(nodeString)) {
                return true;
            }
        }
        return false;
    }

    boolean nodeIsDirectory(DefaultMutableTreeNode node) {
        String nodeString = node.getUserObject().toString();
        for (File dir : allDirectories) {
            if (dir.getName().equals(nodeString)) {
                return true;
            }
        }
        return false;
    }

    //is dirNode a parent to File?
    boolean checkParentDir(DefaultMutableTreeNode dirNode, File File) {
        String parentDirString = dirNode.getUserObject().toString();//get possible parent as string
        for (File possibleParent : allDirectories) {
            if (possibleParent.getName().equals(parentDirString)) {//get possible parent
                if (File.getParent().equals(possibleParent.toString())) {//compare possible parent with real one
                    return true;
                }
            }
        }
        return false;
    }

    void getDirs(File dir) {
        for (File item : dir.listFiles()) {

            if (item.isDirectory() && item.list().length != 0) {
                allDirectories.add(item);
                getDirs(item);
            }
        }
    }

    void getFiles(ArrayList<File> filesAndDirectories) {
        for (File item : filesAndDirectories) {

            if (item.isFile()) {
                allFilteredFiles.add(item);
            }
        }
    }

    public String getTypeOfFile() {
        return this.typeOfFile.getText();
    }

    void getContentFile(File file) {
        FileInputStream fis;
        try {
            fis = new FileInputStream(file.getAbsolutePath());
            BufferedReader br;
            try {
                br = new BufferedReader(new InputStreamReader(fis, "UTF-8"));
                try {
                    FileTextArea.read(br, null);
                    br.close();
                } catch (IOException ex) {
                    Exceptions.printStackTrace(ex);
                }
            } catch (UnsupportedEncodingException ex) {
                Exceptions.printStackTrace(ex);
            }
        } catch (FileNotFoundException ex) {
            Exceptions.printStackTrace(ex);
        }

        TabPanel.add(file.getName(), jScrollPane2);
    }

    private void rootDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rootDirectoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rootDirectoryActionPerformed

    private void typeOfFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeOfFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeOfFileActionPerformed

    private void TabPanelInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_TabPanelInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_TabPanelInputMethodTextChanged

    private void SelectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectAllActionPerformed
        FileTextArea.requestFocus();
        FileTextArea.selectAll();
    }//GEN-LAST:event_SelectAllActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea FileTextArea;
    private javax.swing.JButton Filter;
    private javax.swing.JButton SelectAll;
    private javax.swing.JTabbedPane TabPanel;
    private javax.swing.JTree TreeSystemFiles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPaneSystemFiles;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField rootDirectory;
    private javax.swing.JTextArea text;
    private javax.swing.JTextField typeOfFile;
    // End of variables declaration//GEN-END:variables
    public void componentOpened() {

    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }
}
