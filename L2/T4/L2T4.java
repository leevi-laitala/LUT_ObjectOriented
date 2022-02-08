import java.util.Scanner;

class Mainclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Give a name to the dog: ");
        Dog doge = new Dog(sc.nextLine());
        
        do {
            System.out.print("What does a dog say: ");
        } while (doge.speak(sc.nextLine()));
    }
}
