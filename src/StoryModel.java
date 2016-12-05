/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aaron Yu
 */
public class StoryModel {
 int choice = 0;
    StoryModel(){
        
    }

public void setChoice(int myChoice){
    choice = myChoice;
}

public int getChoice(){
    return choice;
}

public String setNerd1(){
    return "These buttons are not working";
}

public String setNerd1Option1(){
    return "make";
}

public String setNerd1Fail1(){
    return "";
}

public String setNerd1Option2(){
    return "it";
}

public String setNerd1Option3(){
    return "work";
}

public String setNerd1Fail3(){
    return "";
}

public String setFrat1(){
    return "These buttons are def not working";
}

public String setFrat1Option1(){
    return "do";
}

public String setFrat1Option2(){
    return "useful";
}

public String setFrat1Option3(){
    return "work";
}

public String setAvg1(){
    return "These buttons are sure not working";
}

public String setAvg1Option1(){
    return "the";
}

public String setAvg1Option2(){
    return "biggest";
}

public String setAvg1Option3(){
    return "problem";
}

}
