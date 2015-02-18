/**
 * Created by amineboufatah on 13/02/15.
 */

/**
 * Interface Etat
 */

public interface State {

    /**
     * When an operateur has been called
     * @param op
     * @throws OperationNotAllowed
     */
    public  void operateurCall(Character op) throws OperationNotAllowed;

    /**
     * When any operande has been called
     * @param op
     * @throws OperationNotAllowed
     */
    public  void operandeCall(String op) throws OperationNotAllowed;

    /**
     * When the symbol equal has been called
     * @throws OperationNotAllowed
     */
    public  void resultCall() throws OperationNotAllowed;

}
