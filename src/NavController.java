import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NavController {
    
    NavModel n_model;
    NavView n_view;
    OptionsModel o_model;
    OptionsView o_view;
    OptionsController o_Controller;
    StoryModel s_model;        
    MainView m_view;
    InstructionsView i_view = new InstructionsView();
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
        
        n_view.addInstructionsButtonListener(new InstructionsButtonListener());
        
        n_view.addCreditsButtonListener(new CreditsButtonListener());
        
              
    }
    class OptionsButtonListener implements ActionListener {            
        public void actionPerformed(ActionEvent e)
        {            
            n_view.switchToOptionsPanel(o_view);
        }
    }     
 
    class MainButtonListener implements ActionListener {            
        public void actionPerformed(ActionEvent e)
        {            
            n_view.switchToMainPanel(m_view);
            m_view.setOptionsData(o_model.getName(), o_view.getDiff(), o_model.getStudentType(), o_model.getPath());
        }
    }

    class InstructionsButtonListener implements ActionListener {            
        public void actionPerformed(ActionEvent e)
        {            
            n_view.switchToInstuctionsPanel(i_view);
        }
    }

    class CreditsButtonListener implements ActionListener {            
        public void actionPerformed(ActionEvent e)
        {            
            n_view.switchToCreditsPanel(c_view);
        }
            
    }         
    
  
    
}
