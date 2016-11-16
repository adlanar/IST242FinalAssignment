
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 *  The View for your main gameplay or user interaction could go here.
 * 
 * @author jrimland
 */
public class MainView extends JPanel{
    MainView()
    {
        JButton welcomeButton = new JButton("Welcome to the Main View!");
        add(welcomeButton);
    }
}
