//ours
import java.awt.GridLayout;
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

public class MainView extends JPanel{
    private JLabel mainStatus;
    
    private JLabel promptText;
    private JButton promptChoiceA;
    private JButton promptChoiceB;
    
    private enum Scenes {
    sc1,
    sc2;
    }
    
    private Scenes myScene;
    
    
    
    MainView()
    {   
        mainStatus = new JLabel("Options have not been set");
        //add(mainStatus);
        
        promptText = new JLabel("Story here");
        //add(promptText);
        
        promptChoiceA = new JButton("Choice A");
        //add(promptChoiceA);
        
        promptChoiceB = new JButton("Choice B");
        //add(promptChoiceB);
        
        JPanel content = new JPanel();
        
        GridLayout grid = new GridLayout(0,1);
        content.setLayout(grid);
        
        content.add(mainStatus);
        content.add(promptText);
        content.add(promptChoiceA);
        content.add(promptChoiceB);
        
        add(content);
        
    }
    
    public void setOptionsData(String name, int difficulty, String studentType) {
        if (name != null && studentType != "-Type not selected-"){
        mainStatus.setText("Name: " + name + " Difficulty: " + difficulty + " Type: " + studentType);
        sc1();
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
    
    //SCENES
    public void sc1() {
        setPrompt("asasasas");
        setChoiceA("efweff");
        setChoiceB("dfvbffdb");
        
    }
    
}
