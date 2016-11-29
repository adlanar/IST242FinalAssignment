
//ours
import java.awt.event.ActionListener;
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
        //adlan added variables
        private String name;
        private int diffLevel;
        private String studentType;
        
        
        JTextField nameText;
        JLabel EnterDiff;
        JLabel typeText;
        JSlider difficulty;
        
        //adam added
        JButton nerdButton;
        JButton avgPersonButton;
        JButton fratGuyButton;
        
        JButton saveButton;
        
        OptionsModel o_model;
        
        OptionsView(OptionsModel o_model)
        {
            this.o_model = o_model;
                   
            
            nameText = new JTextField("--Enter Player Name--");
            difficulty = new JSlider(JSlider.HORIZONTAL, 1,10,5);
            difficulty.setMajorTickSpacing(1);
            difficulty.setPaintLabels(true);
            difficulty.setPaintTicks(true);

            EnterDiff = new JLabel("  Enter Difficulty:");

            // It may be useful to have a Save & Return button
            
            //retButton = new JButton("Save and Return");

            add(nameText);
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
            
            typeText = new JLabel("-Type not selected-");
            add(typeText);
            
            saveButton = new JButton("Save");
            add(saveButton);
              
            
        }
        
         public void addButtonListener(ActionListener al) {   
            nerdButton.addActionListener(al);
            fratGuyButton.addActionListener(al);
            avgPersonButton.addActionListener(al);
            saveButton.addActionListener(al);
         }
         
         public void SetCurrentWord(String newWord){
             nameText.setText(newWord);
             typeText.setText(newWord);
         }
         
         public String getName(){
             return nameText.getText();
         }
         
         public int getDiff(){
            return difficulty.getValue(); 
         }
         
         public String getStudentType() {
             return typeText.getText();
         }
         
         public JButton getSaveButton() {
            return this.saveButton;
        }
        
        public JButton getNerdButton() {
            return this.nerdButton;
        }
        
        public JButton getFratButton() {
            return this.fratGuyButton;
        }
        
        public JButton getavgButton() {
            return this.avgPersonButton;
        }
          
        public void setStudentLabel(String newType) {
            typeText.setText(newType);
        }
}
