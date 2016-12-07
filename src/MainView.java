//ours
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 *  The View for your main gameplay or user interaction could go here.
 * 
 * @author jrimland
 */



public class MainView extends JPanel implements ActionListener{
    
    private JLabel mainStatus;
    
    private JLabel promptText;
    public JButton promptChoiceA;
    public JButton promptChoiceB;
    public JButton promptChoiceC;
    
    private String currentScene;
    private boolean pass;
    private int choice;
    
    StoryModel myStory = new StoryModel();
    OptionsModel o_model = new OptionsModel();
    
    int path;
    int stage;
    int stageFinished;
      
    MainView()
    {   
        mainStatus = new JLabel("Options have not been set");
        //add(mainStatus);
        
        promptText = new JLabel("Click options to set your quest.");
        //add(promptText);
        
        promptChoiceA = new JButton("");
        promptChoiceA.addActionListener(this);
        //add(promptChoiceA);
        
        promptChoiceB = new JButton("");
        promptChoiceB.addActionListener(this);
        //add(promptChoiceB);
        
        
        promptChoiceC = new JButton("");
        promptChoiceC.addActionListener(this);
        
        
        JPanel content = new JPanel();
        
        GridLayout grid = new GridLayout(0,1);
        content.setLayout(grid);
        
        content.add(mainStatus);
        content.add(promptText);
        content.add(promptChoiceA);
        content.add(promptChoiceB);
        content.add(promptChoiceC);
        
        add(content);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton eventSource = (JButton)e.getSource();
        
        //NERD PATH
        //STAGE 1
        if (eventSource == promptChoiceA && path == 0 && stage == 1) {
            myStory.setChoice(1);

            String result = myStory.getNerd1Fail1();
         
            
            promptText.setText(result);
            removeButtons();
        }
        
        else if (eventSource == promptChoiceB && path == 0 && stage == 1) {
 
            String result = myStory.getNerd1Fail2();
   
            
            promptText.setText(result);
            removeButtons();
        }
        
        else if (eventSource == promptChoiceC && path == 0 && stage == 1) {
       
            String result = myStory.getNerd2();

            
            promptText.setText(result);
            promptChoiceA.setText(myStory.getNerd2Option1());
            promptChoiceB.setText(myStory.getNerd2Option2());
            promptChoiceC.setText(myStory.getNerd2Option3());
            
            stage = 2;
 
        
        }
        
        //STAGE 2
        else if (eventSource == promptChoiceA && path == 0 && stage == 2) {
            String result = myStory.getNerd2Fail1();
           
            promptText.setText(result);
            removeButtons();
        }
        
        else if (eventSource == promptChoiceB && path == 0 && stage == 2) {
            String result = myStory.getNerd3();
            
            
            promptText.setText(result);
            promptChoiceA.setText(myStory.getNerd3Option1());
            promptChoiceB.setText(myStory.getNerd3Option2());
            promptChoiceC.setText(myStory.getNerd3Option3());
            
            stage = 3;
            
        }
        
        else if (eventSource == promptChoiceC && path == 0 && stage == 2) {
            String result = myStory.getNerd2Fail3();
          
            promptText.setText(result);
            removeButtons();
        }
        
        //STAGE 3
        else if (eventSource == promptChoiceA && path == 0 && stage == 3) {
            String result = myStory.getNerd3Fail1();
          
            promptText.setText(result);
            removeButtons();
        }
        
        else if (eventSource == promptChoiceB && path == 0 && stage == 3) {
            String result = myStory.getNerd3Fail2();
          
            promptText.setText(result);
            removeButtons();
        }
        
        else if (eventSource == promptChoiceC && path == 0 && stage == 3) {
            String result = myStory.getNerd4();
         
            
            promptText.setText(result);
            promptChoiceA.setText(myStory.getNerd4Option1());
            promptChoiceB.setText(myStory.getNerd4Option2());
            promptChoiceC.setText(myStory.getNerd4Option3());
            
            stage = 4;

        }
        
        //STAGE 4
        else if (eventSource == promptChoiceA && path == 0 && stage == 4) {
            String result = myStory.getNerd4Fail1();
      
            promptText.setText(result);
            removeButtons();
        }
        
        else if (eventSource == promptChoiceB && path == 0 && stage == 4) {
            String result = myStory.getNerd4Fail2();
       
            promptText.setText(result);
            removeButtons();
        }
        
        else if (eventSource == promptChoiceC && path == 0 && stage == 4) {
            String result = myStory.getNerd5();
  
            promptText.setText(result);
            promptChoiceA.setText(myStory.getNerd5Option1());
            promptChoiceB.setText(myStory.getNerd5Option2());
            promptChoiceC.setText(myStory.getNerd5Option3());
            
            stage = 5;
           
        }
        
        //STAGE 5
        else if (eventSource == promptChoiceA && path == 0 && stage == 5) {
            String result = myStory.getNerd5Fail1();
        
            promptText.setText(result);
            removeButtons();
        }
        
        else if (eventSource == promptChoiceB && path == 0 && stage == 5) {
            String result = myStory.getNerd5Fail2();
      
            promptText.setText(result);
            removeButtons();
        }
        
        else if (eventSource == promptChoiceC && path == 0 && stage == 5) {
            String result = myStory.getWinNerd();
        
            promptText.setText(result);
            removeButtons();
            
            stage = 6;
         
        }
        
        //FRAT PATH
                //STAGE 1
        if(eventSource == promptChoiceA && path == 1 && stage == 1) {
          
            String result = myStory.getFrat2();

            
            promptText.setText(result);
            promptChoiceA.setText(myStory.getFrat2Option1());
            promptChoiceB.setText(myStory.getFrat2Option2());
            promptChoiceC.setText(myStory.getFrat2Option3());
            
            stage = 2;

        }        
                
        else if (eventSource == promptChoiceB && path == 1 && stage == 1) {
            myStory.setChoice(1);
          
            String result = myStory.getFrat1Fail2();
           
            
            promptText.setText(result);
            removeButtons();
        }
        
        else if (eventSource == promptChoiceC && path == 1 && stage == 1) {
          
            String result = myStory.getFrat1Fail3();
        
            
            promptText.setText(result);
            removeButtons();
        }
        
 
        
        //STAGE 2
        else if (eventSource == promptChoiceA && path == 1 && stage == 2) {
            String result = myStory.getFrat2Fail1();
            promptText.setText(result);
            removeButtons();
        }
        
        else if (eventSource == promptChoiceB && path == 1 && stage == 2) {
            String result = myStory.getFrat3();
            promptText.setText(result);
            promptChoiceA.setText(myStory.getFrat3Option1());
            promptChoiceB.setText(myStory.getFrat3Option2());
            promptChoiceC.setText(myStory.getFrat3Option3());
            
            stage = 3;
        }
        
        else if (eventSource == promptChoiceC && path == 1 && stage == 2) {
            String result = myStory.getFrat2Fail3();
            promptText.setText(result);
            removeButtons();
        }
        
        //STAGE 3
        else if (eventSource == promptChoiceA && path == 1 && stage == 3) {
            String result = myStory.getFrat3Fail1();
            promptText.setText(result);
            removeButtons();
        }
        
        else if (eventSource == promptChoiceB && path == 1 && stage == 3) {
            String result = myStory.getFrat3Fail2();
            promptText.setText(result);
            removeButtons();
        }
        
        else if (eventSource == promptChoiceC && path == 1 && stage == 3) {
            String result = myStory.getFrat4();
            
            promptText.setText(result);
            promptChoiceA.setText(myStory.getFrat4Option1());
            promptChoiceB.setText(myStory.getFrat4Option2());
            promptChoiceC.setText(myStory.getFrat4Option3());
            
            stage = 4;
   
        }
        
        //STAGE 4
        else if (eventSource == promptChoiceA && path == 1 && stage == 4) {
            String result = myStory.getFrat4Fail1();
  
            promptText.setText(result);
            removeButtons();
        }
        
           else if (eventSource == promptChoiceB && path == 1 && stage == 4) {
            String result = myStory.getFrat5();
  
            
            promptText.setText(result);
            promptChoiceA.setText(myStory.getFrat5Option1());
            promptChoiceB.setText(myStory.getFrat5Option2());
            promptChoiceC.setText(myStory.getFrat5Option3());
            
            stage = 5;
        }
        
        else if (eventSource == promptChoiceC && path == 1 && stage == 4) {
            String result = myStory.getFrat4Fail1();
     
            promptText.setText(result);
            removeButtons();
        }
        
     
        
        //STAGE 5
        else if (eventSource == promptChoiceA && path == 1 && stage == 5) {
            String result = myStory.getFrat5Fail1();
   
            promptText.setText(result);
            removeButtons();
        }
        
        else if (eventSource == promptChoiceB && path == 1 && stage == 5) {
            String result = myStory.getFratWin();
       
            promptText.setText(result);
            removeButtons();
            
            stage = 6;
       }
        
        else if (eventSource == promptChoiceC && path == 1 && stage == 5) {
            String result = myStory.getFrat5Fail3();
    
            promptText.setText(result);
            removeButtons();
        }
        
        
        






        //AVG PATH
                //STAGE 1
        if (eventSource == promptChoiceA && path == 2 && stage == 1) {
            myStory.setChoice(1);
   
            String result = myStory.getAvg1Fail1();

            
            promptText.setText(result);
            removeButtons();
        }
        
        else if (eventSource == promptChoiceB && path == 2 && stage == 1) {

            String result = myStory.getAvg1Fail2();

            
            promptText.setText(result);
            removeButtons();
        }
        
        else if (eventSource == promptChoiceC && path == 2 && stage == 1) {

            String result = myStory.getAvg2();

            
            promptText.setText(result);
            promptChoiceA.setText(myStory.getAvg2Option1());
            promptChoiceB.setText(myStory.getAvg2Option2());
            promptChoiceC.setText(myStory.getAvg2Option3());
            
            stage = 2;
 

        }
        
        //STAGE 2
        
        
        else if (eventSource == promptChoiceA && path == 2 && stage == 2) {
            String result = myStory.getAvg2Fail1();

            promptText.setText(result);
            removeButtons();
        }
        
        else if (eventSource == promptChoiceB && path == 2 && stage == 2) {
            String result = myStory.getAvg2Fail2();

            promptText.setText(result);
            removeButtons();
        }
        
        else if (eventSource == promptChoiceC && path == 2 && stage == 2) {
            String result = myStory.getAvg3();
         
            
            promptText.setText(result);
            promptChoiceA.setText(myStory.getAvg3Option1());
            promptChoiceB.setText(myStory.getAvg3Option2());
            promptChoiceC.setText(myStory.getAvg3Option3());
            
            stage = 3;
            
        }
        //STAGE 3
        
       
        
        else if (eventSource == promptChoiceA && path == 2 && stage == 3) {
            String result = myStory.getAvg3Fail1();
            promptText.setText(result);
            removeButtons();
        }
        
           else if (eventSource == promptChoiceB && path == 2 && stage == 3) {
            String result = myStory.getAvg4();
            
            promptText.setText(result);
            promptChoiceA.setText(myStory.getAvg4Option1());
            promptChoiceB.setText(myStory.getAvg4Option2());
            promptChoiceC.setText(myStory.getAvg4Option3());
            
            stage = 4;
        }
        
        else if (eventSource == promptChoiceC && path == 2 && stage == 3) {
            String result = myStory.getAvg3Fail3();
            promptText.setText(result);
            removeButtons();
        }
        
      
        
        //STAGE 4
        else if (eventSource == promptChoiceA && path == 2 && stage == 4) {
            String result = myStory.getAvg4Fail1();
            promptText.setText(result);
            removeButtons();
        }
        
          else if (eventSource == promptChoiceB && path == 2 && stage == 4) {
            String result = myStory.getAvg5();
            
            promptText.setText(result);
            promptChoiceA.setText(myStory.getAvg5Option1());
            promptChoiceB.setText(myStory.getAvg5Option2());
            promptChoiceC.setText(myStory.getAvg5Option3());
            
            stage = 5;
        }
        
        else if (eventSource == promptChoiceC && path == 2 && stage == 4) {
            String result = myStory.getAvg4Fail3();
            promptText.setText(result);
            removeButtons();
        }
        
      
        
        //STAGE 5
          else if (eventSource == promptChoiceA && path == 2 && stage == 5) {
            String result = myStory.getAvgWin();
            promptText.setText(result);
            removeButtons();
            
            stage = 6;
        }
        
        else if (eventSource == promptChoiceB && path == 2 && stage == 5) {
            String result = myStory.getAvg5Fail2();
            promptText.setText(result);
            removeButtons();
        }
        
        else if (eventSource == promptChoiceC && path == 2 && stage == 5) {
            String result = myStory.getAvg5Fail3();
            promptText.setText(result);
            removeButtons();
        }
        
      
        






    }
    
    public void setOptionsData(String name, int difficulty, String studentType, int playerPath) {
        if (name != null && studentType != "-Type not selected-"){
        mainStatus.setText("Name: " + name + " Difficulty: " + difficulty + " Type: " + studentType);
        startGame(playerPath);
        }
    }
    
    public void setPrompt(String story){
        promptText.setText(story);
    }
    
    public void setChoiceA(String textA){
        promptChoiceA.setText(textA);
    }
    
    public void setChoiceB(String textB) {
        promptChoiceB.setText(textB);
    }
    
    public void setChoiceC(String textC) {
        promptChoiceC.setText(textC);
    }
    
    public void removeButtons() {
        promptChoiceA.setVisible(false);
        promptChoiceB.setVisible(false);
        promptChoiceC.setVisible(false);
    }
    
    
    //SCENES
    public void startGame(int path) {
     
    if(path == 0){
        setPrompt(myStory.getNerd1());
        setChoiceA(myStory.getNerd1Option1());
        setChoiceB(myStory.getNerd1Option2());
        setChoiceC(myStory.getNerd1Option3());
        this.path = 0;
        stage = 1;
    
     
    }
      if(path == 1){
        setPrompt(myStory.getFrat1());
        setChoiceA(myStory.getFrat1Option1());
        setChoiceB(myStory.getFrat1Option2());
        setChoiceC(myStory.getFrat1Option3());
        this.path = 1;
        stage = 1;
       
    }
    if(path == 2){
        setPrompt(myStory.getAvg1());
        setChoiceA(myStory.getAvg1Option1());
        setChoiceB(myStory.getAvg1Option2());
        setChoiceC(myStory.getAvg1Option3());
        this.path = 2;
        stage = 1;
     
    }
    }
    
    //WHICH ONE?
    //a. while sc1(), do        b.if(evSource == choice && button.getText() == "choice") do
    
    public void gameOverScreen() {
//    jpanel.remove(component); //remove component from your jpanel in this case i used jpanel
//    jpanel.revalidate();
//    jframe.repaint();//repaint a JFrame jframe in this case
//
//    jpanel.add(component); //add component to jpanel in this case i used jpanel
//    jpanel.revalidate();
//    jframe.repaint();//repaint a JFrame jframe in this case
    remove(promptText);
    remove(promptChoiceA);
    remove(promptChoiceB);
    revalidate();
    }
    
}