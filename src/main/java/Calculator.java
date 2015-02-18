

/**
 * Created by amineboufatah on 13/02/15.
 */
public class Calculator implements ModeleCalculatriceInterface {

    State currentState = new StateOperande(this);
    String currentOperande = "0" ;
    Character currentOperator;

    public Calculator(){

    }

    public Calculator(State currentState){
        this.currentState = currentState ;
    }

    @Override
    public void saisieChiffre(String c) {
        try {

            currentState.operandeCall(c);

        } catch (OperationNotAllowed operationNotAllowed) {

            operationNotAllowed.printStackTrace();

        }
    }

    @Override
    public void saisieSymbole(char c) {
        try {

            currentState.operateurCall(c);

        } catch (OperationNotAllowed operationNotAllowed) {

            operationNotAllowed.printStackTrace();

        }
    }

    @Override
    public int valider() {
        try {

            currentState = new StateResult(this);
            currentState.resultCall();

        } catch (OperationNotAllowed operationNotAllowed) {

            operationNotAllowed.printStackTrace();

        }

        return Integer.valueOf(currentOperande);
    }

    @Override
    public void reset() {

       this.currentOperande = "0";
       this.currentOperator = null ;
       this.currentState = new StateOperande(this);

    }

    // GETTERS AND SETTERS

    @Override
    public String getResultatPrecedent() {

        return currentOperande.toString();
    }

    @Override
    public String getOperandeCourante() {

        return currentOperande.toString();

    }

    public void setCurrentState(State currentState) {

        System.out.println("Je suis dans l'etat :"+currentState.getClass().getName());
        this.currentState = currentState;

    }

    public String getCurrentOperande() {

        return currentOperande;

    }

    public void setCurrentOperande(String currentOperande) {

        this.currentOperande = currentOperande;

    }

    public Character getCurrentOperator() {

        return currentOperator;

    }

    public void setCurrentOperator(Character currentOperator) {

        this.currentOperator = currentOperator;

    }

}
