import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

public class Mainframe extends JFrame implements ActionListener {
    JTextArea textArea = new JTextArea();
    OptionsPane buttonField = new OptionsPane();

    public Mainframe(){

        super("Simple Word Editor");
        setVisible(true);
        setLocation(500,150);
        setSize(1000, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new BorderLayout());
        add(textArea, BorderLayout.CENTER);

        add(buttonField, BorderLayout.NORTH);

        buttonField.saveBtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Save"))
        {
            try{
                FileWriter writer = new FileWriter("E:\\uni\\3rd Trimester\\resources\\OOP lab\\Java codes\\GUI_Project\\src\\output.txt");
                writer.write(textArea.getText());
                writer.close();
                textArea.setText("");
            }catch(Exception exception){
                textArea.setText(exception.getMessage());
            }
        }
    }
}
