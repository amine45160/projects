/**
 * Created by amineboufatah on 13/02/15.
 */
public interface ModeleCalculatriceInterface {

    /**
     * Le caractere saisi doit etre un entier
     * les erreurs de mauvaise saisie ne sont pas gerees.
     * @param c
     */
    public abstract void saisieChiffre(String c);

    /**
     * Le caractere saisi doit etre un symbole : +, -, * ou /.
     * les erreurs de mauvaise saisie ne sont pas gerees.
     * @param c
     */
    public abstract void saisieSymbole(char c);


    /**
     * Cette methode doit etre appelee quand nous appuyons sur la touche =
     * @return le resultat de la derniere operation effectuee
     */

    public abstract int valider();

    /**
     * Permet de remettre a 0 l'operande courante.
     */
    public abstract void reset();

    /**
     * Permet d'avoir le dernier resultat calcule (meme si une operande est en cours de saisie)
     * @return le dernier resultat calcule
     */
    public abstract String getResultatPrecedent();


    /**
     * Permet d'avoir l'operande en cours. Attention, si la saisie d'operande n'est pas initiee, alors
     * la valeur null sera retournee.
     * @return l'operande courante quand c'est possible
     */
    public abstract String getOperandeCourante();

}