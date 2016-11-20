//ours
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

/**
 *
 * @author jrimland-air
 */
public class OptionsView extends JPanel{
        //didnt add ret button cus idk wtf its supposed to be
        JButton retButton;
        JTextField playerName;
        JLabel EnterDiff;
        JSlider difficulty;
        
        //adam added
        JButton nerdButton;
        JButton avgPersonButton;
        JButton fratGuyButton;
        
        OptionsModel o_model;
        
        OptionsView(OptionsModel o_model)
        {
            this.o_model = o_model;
                   
            
            playerName = new JTextField("--Enter Player Name--");
            difficulty = new JSlider(JSlider.HORIZONTAL, 1,10,5);
            difficulty.setMajorTickSpacing(1);
            difficulty.setPaintLabels(true);
            difficulty.setPaintTicks(true);

            EnterDiff = new JLabel("  Enter Difficulty:");

            // It may be useful to have a Save & Return button
            
            //retButton = new JButton("Save and Return");

            add(playerName);
            add(EnterDiff);
            add(difficulty);
            
            //adam added
            JLabel buttonsLabel = new JLabel("Pick your character type: ");
            add(buttonsLabel);
            
            nerdButton = new JButton("Nerd");
            add(nerdButton);
            
            fratGuyButton = new JButton("Frat Guy");
            add(fratGuyButton);
            
            avgPersonButton = new JButton("Average Person");
            add(avgPersonButton);
            
            
            //add(retButton);               
        }
}
