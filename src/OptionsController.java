import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

//ours
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jrimland-air
 */
public class OptionsController {
    private OptionsModel o_model;
    private OptionsView o_view;
    private StoryModel myStory = new StoryModel();
    
    OptionsController(OptionsModel o_model, OptionsView o_view) {
        this.o_model = o_model;
        this.o_view = o_view;
    
    
    class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e)
            {
                JButton clickSource = (JButton) e.getSource();
                
                if (clickSource == o_view.getNerdButton()) {
                    //o_model.setStudentType("Nerd");
                    o_view.setStudentLabel("Nerd");
                    //aaron sets storyline to path 0.
                    o_model.setPath(0);
                    myStory.setPath(0);
            
                }
                
                if (clickSource == o_view.getFratButton()) {
                    //o_model.setStudentType("Frat guy");
                    o_view.setStudentLabel("Frat Guy");
                    //Sets storyline to path 1.
                    o_model.setPath(1);
                    myStory.setPath(1);
              
                }
                
                if (clickSource == o_view.getavgButton()) {
                    //o_model.setStudentType("Average person");
                    o_view.setStudentLabel("Average Person");
                    //Sets storyline to path 2.
                    o_model.setPath(2);
                    myStory.setPath(2);
                   
                }
                
                if (clickSource == o_view.getSaveButton())
                {
                    o_model.setName(o_view.getName());
                    o_model.setDiff(o_view.getDiff());
                    o_model.setStudentType(o_view.getStudentType());

                }  
        }
    }
        o_view.addButtonListener(new ButtonListener());
    }
}