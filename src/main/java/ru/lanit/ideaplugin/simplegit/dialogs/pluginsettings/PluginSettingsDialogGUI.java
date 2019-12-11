package ru.lanit.ideaplugin.simplegit.dialogs.pluginsettings;

import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import javax.swing.*;
import java.awt.*;

public class PluginSettingsDialogGUI extends JDialog {
    JPanel contentPane;
    JCheckBox isPluginActive;
    JTextField commonTags;
    TextFieldWithBrowseButton featureCatalog;

    public PluginSettingsDialogGUI() {
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.weightx = 1;
        constraints.fill = 1;
        featureCatalog = new TextFieldWithBrowseButton();
        featureCatalog.setEnabled(false);
        featureCatalog.setEditable(false);
        contentPane.add(featureCatalog, constraints);

        setContentPane(contentPane);
        setModal(true);
        pack();
        validate();
    }
}