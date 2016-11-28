//ours
import java.awt.event.ActionListener;
import javax.swing.JFrame;


/**
 *
 *  The Nav View exposes methods to the Nav Controller that allow it to switch panels
 * 
 * @author jrimland
 */
public class NavView extends JFrame{
    
    NavModel model;
    NavViewPanel nVpanel;
    
    NavView(NavModel model)
    {
        super("The College Struggle");
        this.model = model;
                          
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        nVpanel = new NavViewPanel();
        
        add(nVpanel);    
    }
    
    public void switchToOptionsPanel(OptionsView o_view)
    {
        nVpanel.removeSplash();
        nVpanel.removeMain();
        nVpanel.removeInstructions();
        nVpanel.removeCredits();
        nVpanel.addOptions(o_view);        
    }
    
    public void switchToMainPanel(MainView m_view)
    {
        nVpanel.removeSplash();
        nVpanel.removeOptions();
        nVpanel.removeInstructions();
        nVpanel.removeCredits();
        nVpanel.addMain(m_view);        
    }
    
    // Adam added same format as template 
    public void switchToInstuctionsPanel(InstructionsView i_view)
    {
        nVpanel.removeSplash();
        nVpanel.removeMain();
        nVpanel.removeOptions();
        nVpanel.removeCredits();
        nVpanel.addInstructions(i_view);        
    }
    
    public void switchToCreditsPanel(CreditsView c_view)
    {
        nVpanel.removeSplash();
        nVpanel.removeMain();
        nVpanel.removeOptions();
        nVpanel.removeInstructions();
        nVpanel.addCredits(c_view);        
    }
    
    
    public void addOptionsButtonListener(ActionListener al) 
    {    
        nVpanel.menu.optionsButton.addActionListener(al);
    }    
                    
    public void addMainButtonListener(ActionListener al) 
    {    
        nVpanel.menu.mainButton.addActionListener(al);
    } 

    // Adam added same format as template
    public void addInstructionsButtonListener(ActionListener al) 
    {    
        nVpanel.menu.instructionsButton.addActionListener(al);
    }
    
    public void addCreditsButtonListener(ActionListener al) 
    {    
        nVpanel.menu.creditsButton.addActionListener(al);
    } 
    
    
    //TODO: Add listeners to switch to other Panels
    
}
