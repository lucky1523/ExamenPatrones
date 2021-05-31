package Examen.ejercicio5;

public class terminalExpresionResta extends AbstractExpresion{
    public terminalExpresionResta(int amountDigit){
        this.amountDigit=amountDigit;

    }

    @Override
    public void interpreter(ContextOperacionArit context) {
        if (context.input.startsWith("restar")){
            context.signo=-1;
            context.input=context.input.substring(this.amountDigit);
        }
    }
}


