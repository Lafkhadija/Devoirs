package PkD;


import java.util.Objects;

public class Employe extends Personne {
    String poste;

    public Employe(int id, String nom, String prenom) {
        super(id, nom, prenom);
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "poste='" + poste + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employe employe)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getPoste(), employe.getPoste());
    }
    
    @Override
    protected Employe clone()  {
    	return (Employe) super.clone();
    	
    }

   
}

