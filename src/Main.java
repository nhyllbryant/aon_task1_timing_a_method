import abstraction.IncDec;
import abstraction.implementation.MyIncDec;
import abstraction.implementation.TimedIncDec;

public class Main {
    public static void main(String[] args) {

        IncDec obj = new TimedIncDec(new MyIncDec(10));
        obj.increment();
        obj.decrement();


    }
}
