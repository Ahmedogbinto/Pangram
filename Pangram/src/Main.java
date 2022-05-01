
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

            Boolean again = true;
            while (again) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Please enter your phrase:");
                String phrase;
                phrase = sc.nextLine();

                phrase = phrase.replace(" ", "");
                phrase = phrase.toUpperCase();

                char phraseArray[] = phrase.toCharArray();

                int size = phraseArray.length;

                int y[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};


                int i = 0;
                while (i != size) {
                    int index = phraseArray[i] - 65;
                    y[index] = 1;
                    i++;
                }
                i = 0;
                while (i != 26) {
                    if (y[i] == 1) {
                        i++;
                    } else {
                        System.out.println("Your phrase is not a pangram");
                        System.exit(0);
                        continue;
                    }
                }
                System.out.println("Your phrase is  a pangram");

                continue;

            }

    }
}




