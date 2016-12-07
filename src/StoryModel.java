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

int choice;
int path;
OptionsModel o_model = new OptionsModel();


    StoryModel(){
     
    }


public void setChoice(int myChoice){
    choice = myChoice;
}


public int getChoice(){
    return choice;
}


public void setPath(int myPath) {
path = myPath;    
}


public int getPath() {
    return o_model.getPath();
}


//NERD
public String getNerd1(){
    return "You have a very important midterm tommorow and it is 1am. What do you do? ";
}


public String getNerd1Option1(){
    return "Freak out and wheeze.";
}


public String getNerd1Fail1(){
    return "You get an asthma attack and go to the hospital and miss the test!";
}


public String getNerd1Option2(){
    return "Stay up until classtime and try your best!";
}


    public String getNerd1Fail2(){
    return " You fall asleep as soon as you pick up your pencil.";
}


public String getNerd1Option3(){
    return "Go to bed and forget about it.";
}


public String getNerd2(){
    return "You wake up in a dream world where happiness doesn't exist. How do you proceed?";
}


public String getNerd2Option1(){
    return "Sit down and wait to wake up.";
}


public String getNerd2Fail1(){
    return "You never wake up and end up in a coma for 100 years. You have long missed that test, along with the rest of humanity.";
}


public String getNerd2Option2(){
    return "Head to the library.";
}


public String getNerd2Option3(){
    return "Head to the graveyard.";
}


public String getNerd2Fail3(){
    return "A gang of ghosts beat you up and steal your money.";
}


public String getNerd3(){
    return "You run into a beautiful woman in the lobby. What do you say?";
}


public String getNerd3Option1(){
    return "Get nervous and don't say anything.";
}


public String getNerd3Fail1(){
    return "She stares back at you and you get a heart attack. And everyone knows if you die in a dream you die in real life.";
}


public String getNerd3Option2(){
    return "Say Hello.";
}


public String getNerd3Fail2(){
    return "\"Ugh, don't talk to me you loser!\" she says. You drown in your own tears.";
}


public String getNerd3Option3(){
    return "Ask her who she is.";
}


public String getNerd4(){
    return "She turns into a giant killer version of the midterm and tries to eat you.";
}


public String getNerd4Option1(){
    return ".Slay it with a sword.";
}


public String getNerd4Fail1(){
    return "No amount of swords can solve your personal problems.";
}


public String getNerd4Option2(){
    return "Slay it with a pencil";
}


public String getNerd4Fail2(){
    return "The pencil lead snaps as soon as it hits her paper body. And you don't have a sharpener.";
}


public String getNerd4Option3(){
    return "Slay it with a pen.";
}


public String getNerd5(){
    return "It appears the pen is mightier than the sword. How do you finish the midterm?";
}


public String getNerd5Option1(){
    return "Use your pen and poke holes in it.";
}


public String getNerd5Fail1(){
    return "You wake up in class with countless holes in your midterm.";
}


public String getNerd5Option2(){
    return "Let it live.";
}


public String getNerd5Fail2(){
    return "The midterm suddenly leaps up and starts to bite you. You wake up screaming in class and everyone is judging you.";
}


public String getNerd5Option3(){
    return "Scribble over it furiously.";
}


public String getWinNerd(){
    return "You wake up in class with a finished midterm. The smoke clears from your paper as time runs out. You get 101%! YOU WIN!";
}


//FRAT GUY
public String getFrat1(){
    return "You are rushing your desired frat. What do you wear?";
}


public String getFrat1Option1(){
    return "Vineyard Vines EVERYTHING.";
}


public String getFrat1Option2(){
    return "Salmon shorts.";
}


public String getFrat1Fail2(){
    return "Those were so last season. You die from embarrassment. ";
}


public String getFrat1Fail3(){
    return "You get arrested for public indecency.";
}


public String getFrat1Option3(){
    return "Nothing.";
}


public String getFrat2(){
    return "Your next challenge to join is to test your drinking ability. How do you handle it?";
}


public String getFrat2Option1(){
    return "You drink everything the frat gives you.";
}


public String getFrat2Fail1(){
    return "Your liver goes supernova and you vaporize instantly.";
}


public String getFrat2Option2(){
    return "You don't drink because you're not 21.";
}


public String getFrat2Fail3(){
    return "\"Don't shoot!\" you say when the police suddenly bust through the door to shut down the party. Your criminal history prevents you from ever having a happy life.";
}


public String getFrat2Option3(){
    return "You reluctantly take a sip.";
}


public String getFrat3(){
    return "Excellent! Drinking even a day before your 21th birthday can result in death. However in doing so, you have disappointed every single frat brother.";
}


public String getFrat3Option1(){
    return "Let it go because you don't care what anyone else thinks.";
}


public String getFrat3Fail1(){
    return "Then why are you joining a frat? The hypocrisy kills you.";
}


public String getFrat3Option2(){
    return "You do your own rendition of the dance from \"Thriller\" to impress everyone.";
}


public String getFrat3Fail2(){
    return "Michael Jackson rises from the grave to reclaim his throne. You are banished to the shadow realm.";
}


public String getFrat3Option3(){
    return "Give up all morals and drink to please others.";
}


public String getFrat4(){
    return "Uh oh! The PSA in the last question apparantly did not phase you! You wake up on Mars. The atmosphere will kill you in 15 minutes.";
}


public String getFrat4Option1(){
    return "Make a breathing apparatus out of a plastic bag.";
}


public String getFrat4Fail1(){
    return "Suffocation Hazard! I don't know why you thought that was a good idea because now you're dead.";
}


public String getFrat4Option2(){
    return "Head north.";
}


public String getFrat4Fail3(){
    return "Your panicking causes you to lose air at an even faster rate. You don't last 5 minutes.";
}


public String getFrat4Option3(){
    return "Panic!";
}


public String getFrat5(){
    return "You see a spaceship waiting for you! It will not start however.";
}


public String getFrat5Option1(){
    return "Violently push all the buttons.";
}


public String getFrat5Fail1(){
    return "The buttons violently push back!";
}


public String getFrat5Option2(){
    return "Say please.";
}


public String getFratWin(){
    return "The spaceship roars to life and safely takes you back home, where you are hailed as a hero by the frat. YOU WIN!";
}


public String getFrat5Option3(){
    return "Get out and kick it.";
}


public String getFrat5Fail3(){
    return "The spaceship slowly tips, eventually toppling over and crushing you like a vending machine would.";
}


//AVERAGE
public String getAvg1(){
    return "You have to finish a huge project, but your best friend has invited you out to party. What do you do?";
}


public String getAvg1Option1(){
    return "Stay home and finish the project.";
}


public String getAvg1Fail1(){
    return "Your computer crashes at the last minute and you lose everything, including your life.";
}


public String getAvg1Option2(){
    return "Don't do either.";
}


public String getAvg1Fail2(){
    return "You don't do either and waste your life.";
}


public String getAvg1Option3(){
    return "Abandon responsibilities for one night and party.";
}


public String getAvg2(){
    return "You arrive at the party, and everyone is just starting to arrive. Where do you go first?";
}


public String getAvg2Option1(){
    return "The bar.";
}


public String getAvg2Fail1(){
    return "Right before you reach for a drink, you get ID'd by the party thrower. He kicks you out for being 20.9 years old and kicks you out.";
}


public String getAvg2Option2(){
    return "The dance floor.";
}


public String getAvg2Fail2(){
    return "Your weak moves causes everyone at the party to turn on you. Good job.";
}


public String getAvg2Option3(){
    return "Home, because of excess anxiety.";
}


public String getAvg3(){
    return "Before you head out the door, a cute girl grabs you by the hand and asks you to dance.";
}


public String getAvg3Option1(){
    return "Still go home.";
}


public String getAvg3Fail1(){
    return "You go home, where regret consumes every single being of you.";
}


public String getAvg3Option2(){
    return "Tell her you can't dance.";
}


public String getAvg3Fail3(){
    return "You can't dance.";
}


public String getAvg3Option3(){
    return "Dance with her.";
}


public String getAvg4(){
    return "She laughs and says it's ok. She looks a little familiar to you. Wait, she's one of your project group members!";
}


public String getAvg4Option1(){
    return "Tell her she should be working on your project.";
}


public String getAvg4Fail1(){
    return "Ugh! she says. You get slapped so hard that you get transported to another dimension.";
}


public String getAvg4Option2(){
    return "Ask her what she's doing here instead of doing the project.";
}


public String getAvg4Option3(){
    return "Ignore the fact that you abandoned your project.";
}


public String getAvg4Fail3(){
    return "A week later, when you get a 0, you trash your GPA. The girl is not happy.";
}


public String getAvg5(){
    return "She tells you she toooootallllllly forgot.";
}


public String getAvg5Option1(){
    return "Invite her to your place to finish it.";
}


public String getAvg5Option2(){
    return "Blame her.";
}


public String getAvg5Fail2(){
    return "She starts to cry, and everyone thinks you did it. They all beat you up.";
}


public String getAvgWin(){
    return "You two finish the project, get an A, and get married. You live happily ever after!";
}
        
public String getAvg5Option3(){
    return "Brush it off and continue to party.";
}


public String getAvg5Fail3(){
    return "You feel time starting to slow down to a complete standstill. You are forever trapped at that party.";
}


}


