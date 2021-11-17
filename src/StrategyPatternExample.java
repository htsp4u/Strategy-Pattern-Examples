import java.io.IOException;

public class StrategyPatternExample {

    public static void main(String[] args) throws IOException {

        Context context = new Context(args[0]);


        //System.out.println("\n* Default (All):");
        //context.filter();

        System.out.println("\n* StartsWithT:");
        context.changeStrategy(new StartsWithT());
        context.filter();

        System.out.println("\n* LongerThan5:");
        context.changeStrategy(new LongerThan5());
        context.filter();

        System.out.println("\n* Palindrome:");
        context.changeStrategy(new Palindrome());
        context.filter();

    }
}
