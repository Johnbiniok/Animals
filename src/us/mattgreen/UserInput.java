package us.mattgreen;
import javax.naming.NamingException;
import java.util.Scanner;

public class UserInput {
    Scanner keyboard = new Scanner(System.in);

    public int getMousesKilled(){
        boolean validNumber = true;

        int miceKilled = 0;
        while(!validNumber) {
            System.out.println("Please enter how many mice your cat has killed. ");
            try {
                miceKilled = Integer.parseInt(keyboard.nextLine());
                validNumber = false;
            } catch (NumberFormatException e) {
                System.out.println(e.getLocalizedMessage());
            } catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
                validNumber = false;
            }
        }
        return miceKilled;
    }
    public String getName(){
        String name="";
        boolean validName = false;
        while(validName == false) {
            System.out.println("Please enter name. ");
            name = keyboard.nextLine();
            if(name.isEmpty() && name != null && name != "Bob"){
                validName = true;
            }
        }
        return name;
    }

    public boolean checkName(String name){
        return (!name.isEmpty() && name != null && name != "Bob");
    }
}
