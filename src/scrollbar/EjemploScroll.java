/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrollbar;

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import static javax.swing.SwingConstants.HORIZONTAL;

/**
 *
 * @author Carolina EM
 */
public class EjemploScroll {

    public EjemploScroll() {
        JFrame f = new JFrame("Practica 2 Parcial 2");
        final JTextField text1 = new JTextField();
        text1.setHorizontalAlignment(JLabel.CENTER);
        text1.setBounds(20, 20, 170, 40);
        final JTextField text2 = new JTextField();
        text2.setHorizontalAlignment(JLabel.CENTER);
        text2.setBounds(20, 70, 170, 40);
        final JScrollBar s1 = new JScrollBar();
        s1.setBounds(340, 0, 50, 360);
        final JScrollBar s2 = new JScrollBar();
        s2.setOrientation(HORIZONTAL);
        s2.setBounds(0, 310, 335, 50);
        final JButton B1 = new JButton("Borrar");
        B1.setBounds(20, 150, 250, 50);
        f.setLocationRelativeTo(null);
        f.add(B1);
        f.add(s1);
        f.add(s2);
        f.add(text1);
        f.add(text2);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        s1.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                text1.setText("Vertical Scrollbar value is:" + s1.getValue());
            }
        });
        s2.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                text2.setText("Horizontal Scrollbar value is:" + s2.getValue());
            }
        });
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text1.setText("");
                text2.setText("");
            }
        });
    }
  
}  
    
    

