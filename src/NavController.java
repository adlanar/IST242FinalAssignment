// ours
/**
 *
 *  The Nav Controller handles logic to switch between Views
 * 
 * @author jrimland
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NavController {
    
    NavModel n_model;
    NavView n_view;
    
    //Instance Variables for Options Model, View, and Controller
    OptionsModel o_model;
    OptionsView o_view;
    OptionsController o_Controller;  
           
    // TODO: Create instances of your MainModel and MainController once you implement them
    MainView m_view;
    
    // added by adam creates instuctions view
    InstructionsView i_view = new InstructionsView();
    
    // added by adam
    CreditsView c_view = new CreditsView();
    
    
    public NavController(NavModel n_model, NavView n_view ) {
        this.n_model = n_model;
        this.n_view = n_view;
        
        o_model = new OptionsModel();        
        o_view = new OptionsView(o_model);
        o_Controller = new OptionsController(o_model, o_view); 
        
        m_view = new MainView();
                
        n_view.addOptionsButtonListener(new OptionsButtonListener());
        n_view.addMainButtonListener(new MainButtonListener());
        
       // added by adam listener for instructions button
        n_view.addInstructionsButtonListener(new InstructionsButtonListener());
        
        //added by adam
        n_view.addCreditsButtonListener(new CreditsButtonListener());
       
        
    }
    class OptionsButtonListener implements ActionListener {            
        public void actionPerformed(ActionEvent e)
        {            
            //Pass an Options View object to our Navigation View
            n_view.switchToOptionsPanel(o_view);
        }
    }     
 
    class MainButtonListener implements ActionListener {            
        public void actionPerformed(ActionEvent e)
        {            
            //Pass a Main View object to our Navigation View
            n_view.switchToMainPanel(m_view);
        }
    }
        
    // added by adam
    class InstructionsButtonListener implements ActionListener {            
        public void actionPerformed(ActionEvent e)
        {            
            //Pass a  View object to our Navigation View
            n_view.switchToInstuctionsPanel(i_view);
        }
    }
    //added by adam   
    class CreditsButtonListener implements ActionListener {            
        public void actionPerformed(ActionEvent e)
        {            
            //Pass a  View object to our Navigation View
            n_view.switchToCreditsPanel(c_view);
        }
            
    }         
    
    //TODO: Add listeners on buttons to switch to other Panels
    
}
