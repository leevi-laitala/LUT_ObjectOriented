public class Dog {
    private String mName, mSays;

    public Dog(String name) {
        mName = (name.trim().isEmpty()) ? "Doge" : name;
        mSays = "Much wow!";
        System.out.println("Hey, my name is " + mName + "!");
    }

    boolean speak(String str) {
        boolean empty = str.trim().isEmpty();
        System.out.println(mName + ": " + ((empty) ? mSays : str));
        return empty;
    }
}

