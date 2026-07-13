package woche_08.mvcPattern;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class View implements ActionListener{
    private Controller controller;
    private JButton button; // Use this Button
    private JFrame frame;

    public View(Controller controller, Model model) {
        this.controller = controller;
        //TODO add JFrame and Button
        this.frame = new JFrame();
        this.button = new JButton();

        frame.setSize(400, 400);
        button.setText(model.getText());

        //Don't forget to register the actionListener
        button.addActionListener(
                e -> controller.notifyButtonClick()
        );

        frame.add(button);
        frame.setVisible(true);
    }

    public void update(Model model) {
        //TODO Change Text of Button based on this model
        button.setText(model.getText());
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            controller.notifyButtonClick();
        }
    }
}
