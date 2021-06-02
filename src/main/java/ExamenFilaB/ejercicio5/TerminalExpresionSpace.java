package ExamenFilaB.ejercicio5;


public class TerminalExpresionSpace extends AbstractExpresion{
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith(",")){
            context.output=context.output+" ";
            context.input=context.input.substring(1);
        }
    }
}
