//ours
import javax.swing.JButton;
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
    MainView()
    {
        JButton welcomeButton = new JButton("Welcome to the Main View!");
        add(welcomeButton);
    }
}
