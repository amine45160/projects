/**
 * Created by amineboufatah on 13/02/15.
 */

/**
 * Etat Operande
 */

public class StateOperande implements State {

    Calculator calculator ;

    /**
     * Default Constructor
     */
    public StateOperande(Calculator calculator){
        this.calculator = calculator;
    }

    @Override
    public void operateurCall(Character op) {
        calculator.setCurrentOperator(op);
        calculator.setCurrentState(new StateOperande(calculator));
    }

    @Override
    public void operandeCall(String op) throws OperationNotAllowed {

        String resultat;
        int res ;
        int operande = Integer.parseInt(String.valueOf(calculator.getCurrentOperande()));
        int operande2 = Integer.parseInt(String.valueOf(op));

        if (calculator.getCurrentOperator()!=null) {

            switch (calculator.getCurrentOperator()) {

                case '+':

                    res = operande + operande2 ;
                    resultat = String.valueOf(res);
                    break;

                case '-':
                    res = operande - operande2 ;
                    resultat = String.valueOf(res);
                    break;

                case '*':
                    res = operande * operande2 ;
                    resultat = String.valueOf(res);
                    break;

                default:
                    throw new OperationNotAllowed();
            }
        } else {
            resultat = op;
        }

        calculator.setCurrentOperande(resultat);
        calculator.setCurrentState(new StateOperation(calculator));

    }

    @Override
    public void resultCall() throws OperationNotAllowed {
        throw new OperationNotAllowed();
    }
}
