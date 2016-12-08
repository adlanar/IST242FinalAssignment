import javax.swing.*;


public class CreditsView extends JPanel {
    
    CreditsView()
    {
        JLabel creditsLabel = new JLabel("<html>CREDITS: <br><br><br>"
                + "Adam Clarkson<br>"
                + "Aaron Yu<br>"
                + "Adlan Ramly<html>");
        add(creditsLabel);
    }
}
