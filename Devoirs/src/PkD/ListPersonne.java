package PkD;

import java.util.*;

public class ListPersonne{
  

	List<Personne> personneList;

    public void alimenterList(){
        personneList.add(new Personne(1,"Peter","Griffin"));
        personneList.add(new Personne(2,"Stewie","Griffin"));
        personneList.add(new Personne(3,"Cleveland","Brown"));
        personneList.add(new Personne(4,"Lois","Griffin"));
        personneList.add(new Personne(5,"Mayor","West"));
        personneList.add(new Personne(6,"Brian","The dog"));
        
    }
    public void afficherList(){
        for(Personne p:personneList){
            p.toString();
        }
    }
    public void iteratorList(){
        Iterator<Personne> personneIterator=personneList.iterator();
        while(personneIterator.hasNext()){
            Personne personne = personneIterator.next();
            System.out.println(personne);
        }
    }
    public void InsererPersonne(Personne p){
        personneList.add(p);
    }
    public Personne getPersonne(int id){
           return personneList.get(id);
    }
    public void supprimerPersonne(Personne p){
        personneList.remove(p);
    }
    public boolean chercherPersonne(Personne p){
        return personneList.contains(p);
    }
    public void trierList(){
        Collections.sort(personneList);
    }

    public void copierList(){
        List<Personne> personneList2 = new ArrayList<>();
        Collections.copy(personneList2,personneList);
    }
    public void melangerList(){
        Collections.shuffle(personneList);
    }
    public void cutList(){
        personneList.subList(1,6);
    }
    public void comparerList(List<Personne> personneList2){
    List<Personne> personnes =new ArrayList<>();
    personneList.equals(personnes);
    }
    public void echangePersonne(Personne p, Personne p1){
        Collections.swap(personneList,p.getId(),p1.getId());
    }
    public void viderList(){
        personneList.clear();
    }
    public boolean testVideList(){
        return personneList.isEmpty();
    }
}
