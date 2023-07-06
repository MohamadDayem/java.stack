
import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {

public static void main(String[] args) {
PuzzleJava generator = new PuzzleJava();
int[] randomRolls = generator.getTenRolls();
for (int i = 0; i < randomRolls.length; i++) {
   //1 
    System.out.println(randomRolls[i]);
}
//2
char v=generator.getRandomLetter();
    System.out.println(v);

System.out.println(generator.generatePassword());
System.out.println(generator.getNewPasswordSet(10));
}



}