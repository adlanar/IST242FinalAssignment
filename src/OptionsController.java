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
    
    OptionsController(OptionsModel o_model, OptionsView o_view) {
        this.o_model = o_model;
        this.o_view = o_view;
    
    
    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e)
            {
                JButton clickSource = (JButton) e.getSource();
                
                if (clickSource == o_view.getNerdButton()) {
                    //o_model.setStudentType("Nerd");
                    o_view.setStudentLabel("Nerd");
                }
                
                if (clickSource == o_view.getFratButton()) {
                    //o_model.setStudentType("Frat guy");
                    o_view.setStudentLabel("Frat guy");
                }
                
                if (clickSource == o_view.getavgButton()) {
                    //o_model.setStudentType("Average person");
                    o_view.setStudentLabel("Average person");
                }
                
                if (clickSource == o_view.getSaveButton())
                {
                    o_model.setName(o_view.getName());
                    o_model.setDiff(o_view.getDiff());
                    o_model.setStudentType(o_view.getStudentType());
                    //System.out.println(o_model.getName() + " " + o_view.getDiff() + " " + o_model.getStudentType());
                }  
        }
    }
        o_view.addButtonListener(new ButtonListener());
    }
}