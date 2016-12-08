
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class OptionsView extends JPanel{
        JTextField nameText;
        JLabel EnterDiff;
        JLabel typeText;
        JSlider difficulty;
        JButton nerdButton;
        JButton avgPersonButton;
        JButton fratGuyButton;
        
        JButton saveButton;
        
        OptionsModel o_model;
        
        OptionsView(OptionsModel o_model)
        {
            this.o_model = o_model;
                   
            
            nameText = new JTextField("--Enter Player Name--");
            difficulty = new JSlider(JSlider.HORIZONTAL, 18,25,20);
            difficulty.setMajorTickSpacing(1);
            difficulty.setPaintLabels(true);
            difficulty.setPaintTicks(true);

            EnterDiff = new JLabel("  Enter Age:");
            
            JLabel buttonsLabel = new JLabel("Pick your character type: ");
            
            nerdButton = new JButton("Nerd");
            fratGuyButton = new JButton("Frat Guy");
            avgPersonButton = new JButton("Average Person");

            typeText = new JLabel("-Type not selected-");

            saveButton = new JButton("Save");
            
            JPanel content = new JPanel();
            
            GridLayout grid = new GridLayout(0,1);
            content.setLayout(grid);
            content.add(nameText);
            content.add(EnterDiff);
            content.add(difficulty);
            
            content.add(buttonsLabel);
            content.add(nerdButton);
            content.add(fratGuyButton);
            content.add(avgPersonButton);
            content.add(typeText);
            content.add(saveButton);
            
            add(content);
             
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
