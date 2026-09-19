package Model;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.UIManager;
import javax.swing.border.Border;

public class DarkMetalTheme {

    private static final Color BACKGROUND = new Color(35, 35, 38);
    private static final Color PANEL = new Color(45, 45, 48);
    private static final Color CONTROL = new Color(55, 55, 58);
    private static final Color CONTROL_DARK = new Color(30, 30, 33);
    private static final Color TEXT = new Color(235, 235, 235);
    private static final Color TEXT_SECONDARY = new Color(180, 180, 180);
    private static final Color BORDER = new Color(85, 85, 90);
    private static final Color SELECTION = new Color(70, 100, 130);

    public static void apply() {

        UIManager.put("Panel.background", PANEL);

        UIManager.put("OptionPane.background", BACKGROUND);
        UIManager.put("OptionPane.messageForeground", TEXT);

        UIManager.put("Label.foreground", TEXT);

        UIManager.put("Button.background", CONTROL);
        UIManager.put("Button.foreground", TEXT);
        UIManager.put("Button.select", SELECTION);
        UIManager.put("Button.focus", BORDER);

        UIManager.put("TextField.background", CONTROL_DARK);
        UIManager.put("TextField.foreground", TEXT);
        UIManager.put("TextField.caretForeground", TEXT);
        UIManager.put("TextField.selectionBackground", SELECTION);
        UIManager.put("TextField.selectionForeground", TEXT);

        UIManager.put("FormattedTextField.background", CONTROL_DARK);
        UIManager.put("FormattedTextField.foreground", TEXT);

        UIManager.put("PasswordField.background", CONTROL_DARK);
        UIManager.put("PasswordField.foreground", TEXT);
        UIManager.put("PasswordField.caretForeground", TEXT);

        UIManager.put("ComboBox.background", CONTROL);
        UIManager.put("ComboBox.foreground", TEXT);
        UIManager.put("ComboBox.selectionBackground", SELECTION);
        UIManager.put("ComboBox.selectionForeground", TEXT);

        UIManager.put("List.background", CONTROL_DARK);
        UIManager.put("List.foreground", TEXT);
        UIManager.put("List.selectionBackground", SELECTION);
        UIManager.put("List.selectionForeground", TEXT);

        UIManager.put("Table.background", CONTROL_DARK);
        UIManager.put("Table.foreground", TEXT);
        UIManager.put("Table.selectionBackground", SELECTION);
        UIManager.put("Table.selectionForeground", TEXT);
        UIManager.put("Table.gridColor", BORDER);

        UIManager.put("TableHeader.background", CONTROL);
        UIManager.put("TableHeader.foreground", TEXT);

        UIManager.put("ScrollPane.background", BACKGROUND);

        UIManager.put("TextArea.background", CONTROL_DARK);
        UIManager.put("TextArea.foreground", TEXT);
        UIManager.put("TextArea.caretForeground", TEXT);

        UIManager.put("CheckBox.background", PANEL);
        UIManager.put("CheckBox.foreground", TEXT);

        UIManager.put("RadioButton.background", PANEL);
        UIManager.put("RadioButton.foreground", TEXT);

        UIManager.put(
            "TitledBorder.titleColor",
            TEXT
        );

        Border border = BorderFactory.createLineBorder(BORDER);

        UIManager.put("TextField.border", border);
        UIManager.put("ComboBox.border", border);
        UIManager.put("ScrollPane.border", border);
    }
}