package PkD;

import java.util.Arrays;

public class GererPersonne {
    Personne[] personnes;

    public GererPersonne(Personne[] personnes) {
        this.personnes = personnes;
    }
    public void trierTableau(){
        Arrays.sort(this.personnes);
    }
    public Personne[] ajouterPersonne(Personne p){
        int newSize= personnes.length+1;
        Personne[] nouveauPersonnes= Arrays.copyOf(personnes,newSize);
        nouveauPersonnes[nouveauPersonnes.length-1] = p;
        return nouveauPersonnes;
    }
    public Personne[] supprimerPersonne(Personne p){
        Personne[] nouveauPersonnes = new Personne[personnes.length-1];
        for (int i = 0; i < personnes.length ; i++) {
            if(personnes[i]!= p){
                nouveauPersonnes[i]=personnes[i];
            }

        }
        return nouveauPersonnes;
    }

    public int compteElements(){
        return personnes.length;
    }
    public Personne[] inverserTable(){
        Personne[] personnesInverser = new Personne[personnes.length];
        int count=0;
        for (int i = personnes.length; i >=0; i--) {
           personnesInverser[count]=personnes[i];
           count++;
        }
        return personnesInverser;

    }
    public Personne maxPersonne(){
        return Arrays.stream(this.personnes).max((o1, o2) -> o1.compareTo(o2)).get();
    }
    public int testeTableaux(Personne[] personnes1){
        return Arrays.compare(this.personnes,personnes1);
    }



}

