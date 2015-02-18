/**
 * Created by amineboufatah on 13/02/15.
 */

/**
 * Etat Operation
 */

public class StateOperation implements State {

    Calculator calculator ;


    public StateOperation(Calculator calculator){
        this.calculator = calculator ;
    }

    /**
     * When an operator has been pressed
     * @param op
     * @return
     */
    @Override
    public void operateurCall(Character op) {
        calculator.setCurrentOperator(op);
        calculator.setCurrentState(new StateOperande(calculator));

    }

    @Override
    public void operandeCall(String op) throws OperationNotAllowed {
        throw new OperationNotAllowed();
    }

    /**
     * When = has been pressed
     * @return
     */
    @Override
    public void resultCall() throws OperationNotAllowed {
        throw new OperationNotAllowed();
    }
}
