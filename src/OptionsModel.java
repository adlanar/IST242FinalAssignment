import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;


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
public class OptionsModel {
    
    OptionsModel()
    {}
    
    private int diffSetting;
    private String playersName;
    
    public void setPlayersName(String name)
    {
        playersName = name;
    }
    
    public void setDiffSetting(int setting)
    {
        diffSetting = setting;
    }
    
    int getDiffSetting()
    {
        return diffSetting;
    }
    
    String getPlayersName()
    {
        return playersName;
    }
    
    
}
