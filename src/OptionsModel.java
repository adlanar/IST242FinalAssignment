public class OptionsModel {
     private String name;
     private int diffLevel;
     private String studentType;
     private int path;
     
     OptionsModel() {
         
     }
     
     public String getName() {
        return name;
     }
     
     public String getStudentType() {
         return studentType;
     }
     
     public int getPath() {
         return path;
     }
          
     public void setName(String playerName) {
         name = playerName;
     }
     
     public void setDiff(int difficulty) {
         diffLevel = difficulty;
     }
     
     public void setStudentType(String student) {
         studentType = student;
     }
     
    public void setPath(int playerPath)
    {
        path = playerPath;
    }
    

    
     
     
}
