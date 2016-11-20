// Adam added whole class file

// The main problem I noticed with these is the things i added persist when you click on something else

import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adam Clarkson
 */
public class CreditsView extends JPanel {
    
    CreditsView()
    {
        JLabel creditsLabel = new JLabel("<html>CREDITS: <br><br><br>"
                + "Adam 'what does the semicolon do' Clarkson<br>"
                + "Aaron 'dude weed lmao' Yu<br>"
                + "Adlan 'you guys know nothing' Ramly<html>");
        add(creditsLabel);
    }
}
