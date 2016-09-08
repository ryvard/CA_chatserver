/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatGui;

import javax.swing.*;

/**
 *
 * @author Jmach
 */
public class chatGui
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("chatGUI");
        JButton button = new JButton("click me");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.getContentPane().add(button);
        
        frame.setSize(300, 300);
        frame.setVisible(true);
        
    }
    
}
