public class Dog {
    private String mName;

    public Dog(String name) {
        mName = name;
        System.out.println("Hey, my name is " + mName + "!");
    }

    void speak(String str) {
        System.out.println(mName + ": " + str);
    }
}

