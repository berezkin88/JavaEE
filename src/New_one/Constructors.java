package New_one;

public class Constructors {

    String classValue = "I'm parent";

    public Constructors() {
        System.out.println(classValue);
    }

}

class InnerClass extends Constructors{
    String classValue = "I'm child";

    public InnerClass() {
        System.out.println(classValue);
    }

    public static void main(String[] args) {
        InnerClass in = new InnerClass();
    }
}
