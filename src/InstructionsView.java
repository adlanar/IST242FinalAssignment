// Adam added whole class
import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adam Clarkson
 */
public class InstructionsView extends JPanel {

    InstructionsView()
    {
        JButton helloButton = new JButton("Welcome to the Instructions");
        add(helloButton);
        
        System.out.print("This is a simple text based game, with the the of the trials of college.");
    
    }

    
    
}
