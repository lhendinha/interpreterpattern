public class InterpreterClient {

    private InterpreterEngine ie;

    public InterpreterClient(InterpreterEngine ie) {
        this.ie = ie;
    }

    public int interpret(String input) {

        Expression exp = null;

        if(input.contains("ADD")) {
            exp = new AddExpression(input);
        } else if(input.contains("SUBTRACT")) {
            exp = new SubtractExpression(input);
        }

        int result = exp.interpret(ie);
        System.out.println(input);

        return result;
    }
}