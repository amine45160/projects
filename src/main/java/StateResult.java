/**
 * Created by amineboufatah on 13/02/15.
 */
public class StateResult implements State {

    Calculator calculator ;

    public StateResult(Calculator calculator){
        this.calculator = calculator ;
    }

    @Override
    public void operateurCall(Character op) throws OperationNotAllowed {
        throw new OperationNotAllowed();
    }

    @Override
    public void operandeCall(String op) throws OperationNotAllowed {
        throw new OperationNotAllowed();
    }

    @Override
    public void resultCall() {
         System.out.println("Le resultat : " + calculator.getOperandeCourante());
         calculator.setCurrentState(new StateOperande(calculator));
    }
}
