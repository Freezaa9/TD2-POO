/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td2.poo;
import java.util.*;

/**
 *
 * @author Geoffrey
 */
public class ListePolygone {

	private List<Polygone> listePolygone;

	public ListePolygone() {
            listePolygone=new ArrayList<Polygone>();
	}

	public void ajoutPolygone(Polygone p) {
            this.listePolygone.add(p);
	}

	public void afficheInfos() {
            StringBuffer buff = new StringBuffer();
            for(Polygone p : listePolygone){
                buff.append(p.toString()); 
                buff.append(" Perimètre : ");
                buff.append(p.perimetre());
                buff.append(" Surface : ");
                buff.append(p.surface());
                buff.append("\n");
            }
            System.out.println(buff);
	}

        @Override
	public String toString() {
            StringBuffer buff = new StringBuffer();
            buff.append("Liste de ");
            buff.append(this.listePolygone.size());
            buff.append(" polygones.");
            return buff.toString();
	}

}