
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adlan Ramly
 */
public class PopupWindow extends MainView{
    public JLabel popImage;
    PopupWindow() {
    popImage = new JLabel(new ImageIcon("src/images/gameover.png"));
    
    }
    
}
