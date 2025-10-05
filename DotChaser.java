import java.util.*;

public class DotChaser {
    public static void main(String[] args) {
        int N = 200;
        int steps = 20; // finite number of steps for testing
        if (args.length != 0)
            N = Integer.parseInt(args[0]);

    ThingList things = new ThingList();
    java.util.Random rand = new java.util.Random(0); // deterministic for testing
        int count = 0;

        while (count < steps) { 
            if (count % N == 0) {
                things.addThing(new TypeA(45, 50, 'r'));
                things.addThing(new TypeB(55, 50, 'b'));
                things.addThing(new TypeC(50, 50, 'y'));
            }

            things.moveAll(rand);
            things.printAll();

            System.out.println("done");
            System.out.flush();
            count++;
        }
    }
}
