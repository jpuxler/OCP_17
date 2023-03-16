package chapter_one;

public class Swan {
    int numberEggs;     // Instance Variable

    public static void main(String[] args) {
        Swan mother = new Swan();
        mother.numberEggs = 1;      // set variable
        System.out.println(mother.numberEggs);  // read variable
    }
}
