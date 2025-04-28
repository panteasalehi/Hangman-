import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;
import java.io.IOException;
import java.io.Console;
import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.FileNotFoundException;  // Import this class to handle errors

enum Color {
    //Color end string, color reset
    RESET("\033[0m"),

    // Regular Colors. Normal color, no bold, background color etc.
    YELLOW("\033[0;33m"),   // YELLOW
    MAGENTA("\033[0;35m"),  // MAGENTA
    RED_BRIGHT("\033[0;91m"),       // RED
    GREEN_BRIGHT("\033[0;92m");     // GREEN
    private final String code;

    Color(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}
class hidePassword {
     String passwordExample() {
        Console console = System.console();
        if (console == null) {
            System.out.println("Couldn't get Console instance");
            System.exit(0);
        }

        console.printf("Testing password%n");
        char[] passwordArray = console.readPassword("Enter your secret password: ");
        return new String(passwordArray);
    }
}
class user{
    int score;
    String username;
    String password = "[\\w@#$%&^*!]{6,}";
    user(){}
    user(String name , String pass){
        username = name;
        password  = pass;

    }

}
class signUp extends user{
    Scanner input = new Scanner(System.in);
String creat(String pass){
        Pattern pattern = Pattern.compile(password);
        Matcher matcher = pattern.matcher(pass);
        while (matcher.matches()==false){
            System.out.println("the password should be at least 6 characters and must contain letters or numbers or characters such as #,@");
            pass = input.nextLine();
            matcher = pattern.matcher(pass);
        }
        return pass;
    }

}
class rand_word{
     int m =(int)(Math.random()*50);
     String[] word = {"tehran", "pizza", "banana", "new york", "advanced programming","michael jordan",
            "lionel messi", "apple", "macaroni", "university", "intel", "kitten", "python", "java",
            "data structures", "algorithm", "assembly", "basketball", "hockey", "leader", "javascript",
            "toronto", "united states of america", "psychology", "chemistry", "breaking bad", "physics",
            "abstract classes", "linux kernel", "january", "march", "time travel", "twitter", "instagram",
            "dog breeds", "strawberry", "snow", "game of thrones", "batman", "ronaldo", "soccer",
            "hamburger", "italy", "greece", "albert einstein", "hangman", "clubhouse", "call of duty",
            "science", "theory of languages and automata"};
    String chosenWord = word[m];
}
class guess extends rand_word{
     int length;
     guess(){
         length=chosenWord.length();
     }

}


class wrong0{
    protected void dar0(){
        System.out.print(Color.YELLOW);
        System.out.println("|----");
        System.out.print(Color.RESET);

    }
}
class wrong1 extends wrong0{
static wrong0 w0 = new wrong0();
    protected static void dar1(){
        w0.dar0();
        System.out.print(Color.YELLOW);
        System.out.println("| |");
        System.out.print(Color.RESET);
    }
}
class wrong2 extends wrong1{
   static wrong1 w1 = new wrong1();
   protected static void dar2(){
       w1.dar1();
       System.out.print(Color.YELLOW);
        System.out.print("|");
       System.out.print(Color.RESET);
       System.out.print(Color.MAGENTA);
        System.out.println("(* *)");
       System.out.print(Color.RESET);
    }
}
class wrong3 extends wrong2{
   static wrong2 w2 = new wrong2();
protected static void dar3(){
    w2.dar2();
    System.out.print(Color.YELLOW);
    System.out.print("|");
    System.out.print(Color.MAGENTA);
    System.out.print("   \\");
    System.out.print(Color.RESET);

}
}
class wrong4 extends wrong2{
  static   wrong2 w2 = new wrong2();
protected static void dar4(){
    w2.dar2();
    System.out.print(Color.YELLOW);
    System.out.print("|");
    System.out.print(Color.MAGENTA);
    System.out.print(" / \\");
    System.out.print(Color.RESET);

}
}
class wrong5 extends wrong2{
   static wrong2 w2 = new wrong2();
protected static void dar5(){
    w2.dar2();
    System.out.print(Color.YELLOW);
    System.out.print("|");
    System.out.print(Color.MAGENTA);
    System.out.println(" /|\\");
    System.out.print(Color.RESET);
}
}
class wrong6 extends wrong5{
   static wrong5 w5 = new wrong5();
protected static void dar6(){
    w5.dar5();
    System.out.print(Color.YELLOW);
    System.out.print("|   ");
    System.out.print(Color.MAGENTA);
    System.out.println("\\");
    System.out.print(Color.RESET);
}
}
class wrong7 extends wrong5{
   static wrong5 w5 = new wrong5();
protected static void dar7(){

    w5.dar5();
    System.out.print(Color.YELLOW);
    System.out.print("| ");
    System.out.print(Color.MAGENTA);
    System.out.print("/ \\");
    System.out.print(Color.RESET);

}
}
class numberofwrong{
    private static int size;
    static void wrongcount(int wrong,int size){
        if(size<=9){
            size =7;
        }
        else{
            size = 14;
        }
        for (int i = 0; i < wrong; i++) {
            System.out.print(Color.RED_BRIGHT);
            System.out.print("X");
        }
            for (int i = wrong; i < size; i++) {
                System.out.print(Color.GREEN_BRIGHT);
                System.out.print("Y");
            }
            System.out.println();
            System.out.println(Color.RESET);


    }
}
public class hangman{
    public static void main(String[] args)throws IOException, InterruptedException {
        File myObj = new File("filename.txt");
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to this game! do you have an account?");
        int choice,playAgain=0,wrong, num = 0,not, finish = 0 , numberOfhint;
        double False;
        boolean f ,repete = false;
        user[] myUsers  = new user[0];
        System.out.println("1_start a new game  2_continue previous game");
        choice = input.nextInt();
        if(choice==2){
            try {
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    myUsers = Arrays.copyOf(myUsers,myUsers.length+1);
                    myUsers[num] = new user();
                    String data = myReader.nextLine();
                    myUsers[num].username = data;
                     data = myReader.nextLine();
                    myUsers[num].password = data;
                     data = myReader.nextLine();
                    myUsers[num].score = Integer.valueOf(data);
                    num++;
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
            do {


                user player = new user();
                do {

                    System.out.println("1_sign up");
                    System.out.println("2_log in");

                    choice = input.nextInt();
                    input.nextLine();

                    if (choice == 1) {
                        signUp p = new signUp();
                        String myName, pass;

                        System.out.println("enter your username: ");
                        myName = input.nextLine();
                        System.out.println("enter your password: do you want to hide it? 1_yes 2_no");

                        choice = input.nextInt();
                        input.nextLine();
                        if (choice == 1) {
                            pass = new hidePassword().passwordExample();
                        } else {

                            choice = 1;
                            pass = input.nextLine();
                        }

                        pass = p.creat(pass);
                        player = new user(myName, pass);
                        myUsers = Arrays.copyOf(myUsers, myUsers.length + 1);
                        myUsers[myUsers.length - 1] = player;
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                    } else if (choice == 2) {
                        System.out.println("1_start game 2_show leader board");
                        choice = input.nextInt();
                        input.nextLine();
                        if (choice == 2) {
                            choice = 0;
                            for (int i = 0; i < myUsers.length - 1; i++) {
                                for (int j = 0; j < myUsers.length - i - 1; j++) {

                                    if (myUsers[j].score > myUsers[j + 1].score) {

                                        int temp = myUsers[j].score;
                                        myUsers[j].score = myUsers[j + 1].score;
                                        myUsers[j + 1].score = temp;
                                        String Temp = myUsers[j].username;
                                        myUsers[j].username = myUsers[j + 1].username;
                                        myUsers[j + 1].username = Temp;
                                        String temp2 = myUsers[j].password;
                                        myUsers[j].password = myUsers[j + 1].password;
                                        myUsers[j + 1].password = temp2;
                                    }
                                }
                            }

                            for (int i = myUsers.length - 1; i >= 0; i--) {
                                System.out.println(myUsers[i].username + "......" + myUsers[i].score);

                            }
                            TimeUnit.SECONDS.sleep(1);
                            finish++;

                        } else {
                            System.out.println("enter your username: ");
                            String name = input.nextLine();
                            String pass;
                            System.out.println("enter your password: do you want to hide it? 1_yes 2_no");

                            choice = input.nextInt();
                            input.nextLine();
                            if (choice == 1) {
                                pass = new hidePassword().passwordExample();
                            } else {
                                pass = input.nextLine();
                            }
                            choice = 2;
                            boolean logIn = false;
                            for (int i = 0; i < myUsers.length; i++) {
                                if (pass.equals(myUsers[i].password) && myUsers[i].username.equals(name)) {
                                    logIn = true;
                                }
                                if (logIn) {
                                    player = myUsers[i];
                                    break;
                                }
                            }
                            if (!logIn) {
                                System.out.println("no such a user sign up first");
                                TimeUnit.SECONDS.sleep(1);
                                choice = 0;
                            }
                        }

                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    } else {
                        System.out.println("1 or 2 :/");
                    }
                } while (choice != 1 && choice != 2);

                guess g = new guess();
                System.out.println("the word is " + g.chosenWord + " and the length is " + g.chosenWord.length());


                char[] word = new char[g.chosenWord.length()];
                char[] chosen = new char[0];
                for (int i = 0; i < g.chosenWord.length(); i++) {
                    word[i] = '_';
                }
                wrong = 0;
                finish = 0;
                False = 0;
                not = 0;
                numberOfhint = 0;
                f = false;
                while ((g.chosenWord.length() > 9 && False < 7) || (g.chosenWord.length() <= 9 && wrong < 7)) {//a pause should be added

                    System.out.println("guess an alphabet of this word! ");
                    if (chosen.length > 0) {
                        System.out.println("but dont choose this alphabets because you have choosen them before: ");

                        for (int i = 0; i < chosen.length; i++) {
                            for (int j = i - 1; j >= 0; j--) {
                                if (chosen[j] == chosen[i]) {
                                    repete = true;
                                    break;
                                }
                            }
                            if (repete) {
                                repete = false;
                                continue;
                            }
                            System.out.print(chosen[i] + ",");

                        }
                        System.out.println();
                    }
                    if (numberOfhint == 0) {
                        System.out.println("you can use a hint in this game, do you want to use it now? 1_yes 2_no");
                        numberOfhint = input.nextInt();
                        int index;
                        if (numberOfhint == 1) {
                            if (player.score >= 10) {
                                player.score -= 10;
                                do {
                                    numberOfhint = 0;
                                    index = (int) (Math.random() * g.length);
                                    for (int i = 0; i < chosen.length; i++) {
                                        if (g.chosenWord.charAt(index) == chosen[i]) {
                                            numberOfhint++;
                                            break;
                                        }
                                    }
                                } while (numberOfhint > 0);
                                System.out.println("one of the letters is:" + g.chosenWord.charAt(index));
                            } else {
                                System.out.println("your score is not enough :(");
                            }
                            numberOfhint = 1;

                        } else {
                            numberOfhint = 0;
                        }
                        input.nextLine();
                    }

                    String n = input.nextLine();
                    char alphabet = n.charAt(0);
                    //a pause should be added
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    if (chosen.length > 0) {
                        do {
                            repete = false;

                            for (int i = 0; i < chosen.length; i++) {
                                if (chosen[i] == alphabet) {
                                    System.out.println("you have already choose this alphabet choose another one");
                                    n = input.nextLine();
                                    alphabet = n.charAt(0);
                                    repete = true;
                                    break;
                                }
                            }
                        } while (repete);
                    }
                    chosen = Arrays.copyOf(chosen, chosen.length + 1);
                    chosen[chosen.length - 1] = alphabet;
                    int true_false = g.chosenWord.indexOf(alphabet);
                    if (true_false == -1) {
                        System.out.println("this alphabet dose not exist in the word! :(");
                        if (g.chosenWord.length() <= 9) {
                            wrong++;
                            switch (wrong) {
                                case 1:
                                    wrong1.dar1();
                                    break;
                                case 2:
                                    wrong2.dar2();
                                    break;
                                case 3:
                                    wrong3.dar3();
                                    break;
                                case 4:
                                    wrong4.dar4();
                                    break;
                                case 5:
                                    wrong5.dar5();
                                    break;
                                case 6:
                                    wrong6.dar6();
                                    break;
                                case 7:
                                    wrong7.dar7();
                                    System.out.println("game over!");
                                    break;

                            }
                            for (int i = 0; i < 5 - wrong; i++) {
                                System.out.println("|");
                            }
                            numberofwrong.wrongcount(wrong, g.chosenWord.length());
                        } else {
                            False += 0.5;
                            if (False == (int) False) {
                                switch ((int) False) {
                                    case 1:
                                        wrong1.dar1();
                                        break;
                                    case 2:
                                        wrong2.dar2();
                                        break;
                                    case 3:
                                        wrong3.dar3();
                                        break;
                                    case 4:
                                        wrong4.dar4();
                                        break;
                                    case 5:
                                        wrong5.dar5();
                                        break;
                                    case 6:
                                        wrong6.dar6();
                                        break;
                                    case 7:
                                        wrong7.dar7();
                                        System.out.println("game over!");
                                        break;
                                }
                                for (int i = 0; i < 5 - False; i++) {
                                    System.out.println("|");
                                }
                                numberofwrong.wrongcount((int) False, g.chosenWord.length());
                            }
                        }
                        TimeUnit.SECONDS.sleep(1);

                        TimeUnit.SECONDS.sleep(1);
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    } else {
                        int index = g.chosenWord.indexOf(alphabet);
                        word[g.chosenWord.indexOf(alphabet)] = alphabet;
                        while (index >= 0) {
                            if (g.chosenWord.indexOf(alphabet, index + 1) != -1) {
                                word[g.chosenWord.indexOf(alphabet, index + 1)] = alphabet;
                                index = g.chosenWord.indexOf(alphabet, index + 1);
                            } else {
                                index = -1;
                            }

                        }

                    }
                    System.out.println();
                    for (int i = 0; i < g.chosenWord.length(); i++) {
                        System.out.print(word[i]);
                    }
                    System.out.println();
                    for (int i = 0; i < g.chosenWord.length(); i++) {
                        if (word[i] != '_' || word[i] == ' ') {
                            not++;
                        }
                        if (not == g.chosenWord.length()) {
                            f = true;
                            break;
                        }

                    }

                    if (f)
                        break;
                    not = 0;
                }
                not = 0;
                for (int i = 0; i < g.chosenWord.length(); i++) {
                    if (word[i] != '_' || word[i] == ' ') {
                        not++;
                    }
                }
                if (not == g.chosenWord.length()) {
                    System.out.println("you won!");
                    player.score += 5;
                    playAgain++;
                    TimeUnit.SECONDS.sleep(1);
                }
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                    System.out.println("do you want to exit? 1_yes 2_no");
                    int exit = input.nextInt();
                    if (exit == 1) {
                        System.out.println("1_save and exit 2_exit ");
                        exit = input.nextInt();
                    if (exit == 1) {
                        try {
                            try {
                                FileWriter myWriter = new FileWriter("filename.txt");
                                for (int i = 0; i < myUsers.length; i++) {
                                    myWriter.write(myUsers[i].username + "\n");
                                    myWriter.write(myUsers[i].password + "\n");
                                    myWriter.write(String.valueOf(myUsers[i].score) + "\n");
                                }

                                myWriter.close();
                                System.out.println("Successfully wrote to the file.");
                            } catch (IOException e) {
                                System.out.println("An error occurred.");
                                e.printStackTrace();
                            }
                            Scanner myReader = new Scanner(myObj);
                            while (myReader.hasNextLine()) {
                                String data = myReader.nextLine();
                                System.out.println(data);

                            }
                            myReader.close();
                        } catch (FileNotFoundException e) {
                            System.out.println("An error occurred.");
                            e.printStackTrace();
                        }
                    }
                    return;
                }
            } while (playAgain >= 0);

    }
}