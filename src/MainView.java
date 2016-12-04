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
    
    private String currentScene;
    
    MainView()
    {   
        mainStatus = new JLabel("Options have not been set");
        //add(mainStatus);
        
        promptText = new JLabel("Story here");
        //add(promptText);
        
        promptChoiceA = new JButton("Choice A");
        promptChoiceA.addActionListener(this);
        //add(promptChoiceA);
        
        promptChoiceB = new JButton("Choice B");
        promptChoiceB.addActionListener(this);
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
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton eventSource = (JButton)e.getSource();
        if (eventSource == promptChoiceA) {
            System.out.println("button a pressed!");
            gameOverScreen();
        }
        if (eventSource == promptChoiceB) {
            
        }
        
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
        currentScene = "sc1";
        setPrompt("asasasas");
        setChoiceA("efweff"); // go to sc2a
        setChoiceB("dfvbffdb"); // go to sc2b
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
