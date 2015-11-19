/**
 * <h1>{@code ListePolygone} - Abstraction d'un point</h1>
 * <p>
 * Cette classe encapsule les propriétés et les comportements propres à la
 * classe {@code ListePolygone}</p>
 *
 * @author Geoffrey Harrazi &amp; Lucas Morel
 * @version 1.0.0
 * @since 1.0.0
 *
 * 
 */
package td2.poo;

import java.util.*;

/**
 *
 * @author Geoffrey
 */
public class ListePolygone {

    /**
     * Liste de Polygones
     */
    private List<Polygone> listePolygone;

    /**
     * <p>
     * Constructeur {@code ListePolygone} sans paramètres</p>
     * 
     *
     * @since V1.0.0
     */
    public ListePolygone() {
        listePolygone = new ArrayList<Polygone>();
    }

    /**
     * <p>
     * Méthode permettant l'ajout d'un polygone à la liste.
     * </p>
     *
     * @param p un Polygone
     *
     * @since V1.0.0
     */
    public void ajoutPolygone(Polygone p) {
        this.listePolygone.add(p);
    }

    /**
     * <p>
     * Méthode affichant les informations des polygones contenus dans la liste
     * </p>
     *
     * @since V1.0.0
     */
    public void afficheInfos() {
        StringBuffer buff = new StringBuffer();
        for (Polygone p : listePolygone) {
            buff.append(p.toString());
            buff.append(" Perimètre : ");
            buff.append(p.perimetre());
            buff.append(" Surface : ");
            buff.append(p.surface());
            buff.append("\n");
        }
        System.out.println(buff);
    }

    /**
     * <p>
     * Méthode qui retourne un string qui représente l'objet.
     * <p>
     *
     * @return String : un string qui représente l'objet.
     *
     * @since V1.0.0
     */
    @Override
    public String toString() {
        StringBuffer buff = new StringBuffer();
        buff.append("Liste de ");
        buff.append(this.listePolygone.size());
        buff.append(" polygones.");
        return buff.toString();
    }

}
