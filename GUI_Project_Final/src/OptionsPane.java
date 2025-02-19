import javax.swing.*;
import java.awt.*;

public class OptionsPane extends JPanel {
    JButton saveBtn = new JButton("Save");

    public OptionsPane() {
        setLayout(new FlowLayout());
        add(saveBtn);
    }
}
