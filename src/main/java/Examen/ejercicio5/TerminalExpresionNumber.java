package Examen.ejercicio5;

public class TerminalExpresionNumber extends AbstractExpresion{
    public TerminalExpresionNumber(int amountDigit){
        this.amountDigit=amountDigit;

    }
    @Override
    public void interpreter(ContextOperacionArit context) {
        context.output=context.output + Integer.parseInt(context.input.substring(0,amountDigit))*(context.signo);
        context.input=context.input.substring(this.amountDigit);
    }
}
