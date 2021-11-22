public class Main {
    public static void main(String args[]) {

        InterpreterClient ic = new InterpreterClient(new InterpreterEngine());

        System.out.println("Result = " + ic.interpret("ADD 12 and 13"));
        System.out.println("Result = " + ic.interpret("SUBTRACT 76 from 621"));
    }
}
