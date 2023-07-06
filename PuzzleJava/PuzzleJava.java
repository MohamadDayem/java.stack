import java.util.ArrayList;
import java.util.Random;


public class PuzzleJava{

    public int[] getTenRolls() {
        int[] arrayOfRand;
        arrayOfRand = new int[10];
        for (int i = 0; i <10; i++) {
            Random randMachine = new Random();
            arrayOfRand[i]= randMachine.nextInt(20); 
        }
return arrayOfRand;
    }
public char getRandomLetter() {
        
        
            Random randMachine = new Random();
            char arrayOfLet = (char)(randMachine.nextInt(26) + 'a');
        
        
return arrayOfLet;
    }

public String generatePassword() {
    String Password = ""; 
    for (int i=0 ;i<8;i++){
        Password+=getRandomLetter();
        
    }
    return Password;
}
public ArrayList <String> getNewPasswordSet(int x){
    ArrayList <String> enzo = new ArrayList<String>();
    for (int i=0 ;i<x;i++){
    enzo.add(generatePassword());
}
return enzo;
}
}

