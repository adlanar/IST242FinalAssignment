
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

// added 12/5 to get the buttons to work
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adam Clarkson
 */
public class StoryController {
    private StoryModel s_model;
    
    // this is added because mainview is being used as the view for the story
    // at time of adding not positive this wont screw stuff up as it might be in 
    //other areas of program
    private MainView m_view;
    
   StoryController(StoryModel s_model, MainView m_view) {
    
    
    class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
                JButton clickSource = (JButton) e.getSource();
                
                if (clickSource == m_view.getChoiceA()) {
                    s_model.setChoice(1);
                }
                
                if (clickSource == m_view.getChoiceB()) {
                    s_model.setChoice(2);
                }
                
                if (clickSource == m_view.getChoiceC()) {
                    s_model.setChoice(3);
                }
    
        }//action performed
   
    }// ButtonListener
    
   } //StoryController
    
    
}// StoryController class
