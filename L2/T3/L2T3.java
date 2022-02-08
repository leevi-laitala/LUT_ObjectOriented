import java.util.Scanner;

class Mainclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Give a name to the dog: ");
        Dog dog = new Dog(sc.nextLine());

        System.out.print("What does a dog say: ");
        dog.speak(sc.nextLine());
    }
}
