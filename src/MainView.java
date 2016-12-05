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

//GAME MECHANISM PSEUDOCODE by Adlan

//private num Scenes { //list all of the states here
//sc1; 
//};
//
//private Scenes myScene;
//
//void Start() {
//	myScene = Scenes.sc1;
//}
//
//void Update() {
//Print (myScene);
//
//if (myScene == Scenes.sc1) {scene_sc1();}
//}
//
//void sc1() {
//Text.text = "//prompt here"
//Button choice1 = "A";
//Button choice2 = "B";
//
//if (choice1) {
//myScene = Scenes.nextSceneA;
//}
//
//if(choice2){
//myScene = Scenes.nextSceneB;
//}
//
//void nextSceneA(){
//}
//
//void nextSceneB(){
//}
//}

public class MainView extends JPanel implements ActionListener{
    
    private JLabel mainStatus;
    
    private JLabel promptText;
    private JButton promptChoiceA;
    private JButton promptChoiceB;
    private JButton promptChoiceC;
    
    private String currentScene;
    private boolean pass;
    private int choice;
    StoryModel myStory = new StoryModel();
      
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
        if (eventSource == promptChoiceA) {
            myStory.setChoice(1);
        }
        else if (eventSource == promptChoiceB) {
            myStory.setChoice(2);
        }
        else if (eventSource == promptChoiceB) {
            myStory.setChoice(3);
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
    
    //SCENES
    
    
    
    public void startGame(int path) {
     
    if(path == 0){
        setPrompt(myStory.setNerd1());
        setChoiceA(myStory.setNerd1Option1());
        setChoiceB(myStory.setNerd1Option2());
        setChoiceC(myStory.setNerd1Option3());
     
    }
      if(path == 1){
        setPrompt(myStory.setFrat1());
        setChoiceA(myStory.setFrat1Option1());
        setChoiceB(myStory.setFrat1Option2());
        setChoiceC(myStory.setFrat1Option3());
    }
    if(path == 2){
        setPrompt(myStory.setAvg1());
        setChoiceA(myStory.setAvg1Option1());
        setChoiceB(myStory.setAvg1Option2());
        setChoiceC(myStory.setAvg1Option3());
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
