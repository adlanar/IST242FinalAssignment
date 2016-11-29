
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
    OptionsModel o_model;
    OptionsView o_view;
    
    OptionsController(OptionsModel o_model, OptionsView o_view)
    {
       this.o_model = o_model;
       this.o_view = o_view;
        
       /* class ButtonListener implements ActionListener
        {            
            @Override
            public void actionPerformed(ActionEvent e)
            {
                JButton eventSource = (JButton)e.getSource();
                if(eventSource == o_view.saveButton)
                {
                    o_view.savefName();
                    o_view.savelName();
                    o_view.saveAge();
                } 
            }
        }
        view.saveButtonListener(new ButtonListener());
        view.loadButtonListener(new ButtonListener());
    } */
    } 
    
} 
