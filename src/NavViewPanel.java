//ours
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author jrimland
 */
public class NavViewPanel extends JPanel{

    NavViewBottomMenuPanel menu;
    NavViewSplashPanel splash;
    
    OptionsView o_view;
    MainView m_view;
    // Adam added
    InstructionsView i_view;
    
    //Adam added
    CreditsView c_view;
    
    public NavViewPanel() {
        super();
        setLayout(new BorderLayout());     
        menu = new NavViewBottomMenuPanel();
        splash = new NavViewSplashPanel();
        
        add(menu, BorderLayout.SOUTH);        
        add(splash, BorderLayout.CENTER);                        
    }
    
    //Note: Splash scrren is only shown on startup.  No need to navigate back to it.
    
    
    public void addOptions(OptionsView o_view)
    {
        this.o_view = o_view; //maintain handle to this view so we can remove it
        add(o_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    public void addMain(MainView m_view)
    {
        this.m_view = m_view;  //maintain handle to this view so we can remove it
        add(m_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
        
   // Added by Adam used same format as the others for the instructions view
    public void addInstructions(InstructionsView i_view)
    {
        this.i_view = i_view;  //maintain handle to this view so we can remove it
        add(i_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    //adam added
    public void addCredits(CreditsView c_view)
    {
        this.c_view = c_view;  //maintain handle to this view so we can remove it
        add(c_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    public void addSplash(NavView n_view)
    {
        add(n_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    
    public void removeOptions()
    {
        if (this.o_view != null)
            remove(this.o_view);
    }
    
    public void removeMain()
    {
        if (this.m_view != null)
            remove(this.m_view);
    }    
    
    // Added by Adam method to remove Intsructions
    public void removeInstructions()
    {
        if (this.i_view != null)
            remove(this.i_view);
    } 
    
    //adam added
     public void removeCredits()
    {
        if (this.c_view != null)
            remove(this.c_view);
    } 
    
    
    
    public void removeSplash()
    {
        remove(splash);
    }      
}
