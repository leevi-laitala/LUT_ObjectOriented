class Mainclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Character character = new Character();

        while(true) {
            System.out.println("*** BATTLE SIMULATOR ***\n1) Create a character\n2) Fight with character\n0) Quit\nYour choice: ");
            int opt = Integer.parseInt(Scanner.nextLine());
            
            switch(opt) {
            case 0:
                System.exit();
            case 1:
                System.out.println("Choose your character:\n1) King\n2) Knight\n3) Queen\n4) Troll\nYour choice: ");
                String optChar = sc.nextLine();
                
                System.out.println("Choose your weapon:\n1) Knife\n2) Axe\n3) Sword\n4) Club\nYour choice: ");
                String optWeap = sc.nextLine();



                break;
            case 2:
            default:
                System.out.println("Unknown option, try again.");
            }
        }
    }
}
