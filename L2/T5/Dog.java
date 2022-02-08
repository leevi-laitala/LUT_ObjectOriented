public class Dog {
    private String mName, mSays;

    public Dog(String name) {
        mName = (name.trim().isEmpty()) ? "Doge" : name;
        mSays = "Much wow!";
        System.out.println("Hey, my name is " + mName);
    }
    
    boolean speak(String str) {
        String[] parsed = str.split(" ");
        boolean empty = str.trim().isEmpty();
        
        //System.out.println(mName + ": " + ((empty) ? mSays : str));

        for (String s : parsed) {
            if (s.trim().toLowerCase().equals("true") || s.trim().toLowerCase().equals("false")) {
                System.out.println("Such boolean: " + s);
                continue;
            }

            try {
                Integer.parseInt(s);
                System.out.println("Such integer: " + s);
                continue;
            } catch (NumberFormatException ex) {
                System.out.println(s);
            }
        }

        return empty;
    }
}

