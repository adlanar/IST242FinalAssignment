// Adam added whole class
import javax.swing.*;
import java.awt.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adam Clarkson
 */
// for some reason this tab doesnt work if it doesnt extend jframe so i used a very long jlabel
// also for some reason i get an error message if i add a second jlabel alignd to the west
public class InstructionsView extends JPanel {

    InstructionsView()
    {
        JLabel intstrLabel = new JLabel("<html>Welcome to the Instructions!<br>"
                + "<br>This is a text based game with the theme of college life."
                + "<br> The option has of this game is rather simeple: survive college!<br>"
                + "You get three different character types to start with: Nerd, Average, and Frat Guy<br>"
                + "The game provies you with different situations depending on your choices, and the game can end in"
                + "differnt ways.<br>"
                + "<br><br> GOOD LUCK AND TRY NOT TO DROP OUT!<html>");
        add(intstrLabel);
        
        
                
                
                
                 
        
        
        
        
        
    
    }

    
    
}
