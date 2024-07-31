package service.requests;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;



public class ResolveRequest {
    private Request request;
    private boolean concluded = false;

    public ResolveRequest(Request request){
        this.request = request;
    }

    public void run(){
         //....

        setConcluted(true);
    }

    // Getters & Setters 
    public boolean isConcluded() {
        return concluded;
    }

    public void setConcluted(boolean concluded) {
        this.concluded = concluded;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

}


class EvalExpression {
    public static void main(String[] args) {
        // Cria uma instância do ScriptEngineManager
        ScriptEngineManager manager = new ScriptEngineManager();
        // Obtém uma instância do ScriptEngine para JavaScript
        ScriptEngine engine = manager.getEngineByName("JavaScript");

        String expression = "5 * 2";
        
        try {
            // Avalia a expressão
            Object result = engine.eval(expression);
            // Imprime o resultado
            System.out.println("Resultado: " + result);
        } catch (ScriptException e) {
            System.out.println(e);
        }
    }
}