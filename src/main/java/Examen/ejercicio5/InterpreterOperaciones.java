package Examen.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class InterpreterOperaciones extends AbstractExpresion{
    private List<AbstractExpresion> parseTree = new ArrayList<>();
    private ContextOperacionArit context;
    public InterpreterOperaciones(String word){
        this.interpretacion(word);
    }
    public void interpretacion(String words){
        String input = words;
        context= new ContextOperacionArit(input.replace(" ",""));
        for (String word : input.split(" ")){
            switch (word){
                case "sumar":
                    parseTree.add(new terminalExpresionSuma(word.length()));
                    break;
                case "restar" :
                    parseTree.add(new terminalExpresionResta(word.length()));
                    break;
                default:
                    parseTree.add(new TerminalExpresionNumber(word.length()));
                    break;
            }

        }

    }
    public int interpretar(){
        for (AbstractExpresion terminalExpresion:parseTree){
            terminalExpresion.interpreter(context);
        }
        return context.output;
    }

    @Override
    public void interpreter(ContextOperacionArit context) {

    }
}
