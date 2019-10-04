package com.sydauto.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author  刘朝
 * @since  2019/9/20
 */
public class ErrorDialog extends JFrame {

    private JPanel contentPane;
    private JTextPane editTP;
    private JButton okButton;
    private JScrollPane scrollPane;

    public ErrorDialog(String errorInfo) {
        setContentPane(contentPane);
        setTitle("Error Info");
        getRootPane().setDefaultButton(okButton);
        this.setAlwaysOnTop(true);
        editTP.setText(errorInfo);
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        editTP.setCaretPosition(0);

    }
}
