
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author jrimland
 */
public class NavViewBottomMenuPanel extends JPanel{
    JButton mainButton;
    JButton optionsButton;
    JButton instructionsButton;
    JButton creditsButton;  
    public NavViewBottomMenuPanel() {
        super();       
        mainButton = new JButton("Main");
        optionsButton = new JButton("Options");
        instructionsButton = new JButton("Instructions");
        creditsButton = new JButton("Credits");
                                  
        add(mainButton);
        add(optionsButton);
        add(instructionsButton);
        add(creditsButton);   
        

    }          
}
