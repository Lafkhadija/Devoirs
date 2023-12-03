package PkD;

	import java.util.Objects;


	public class Personne implements Comparable <Personne>, Cloneable {
	    private int id;
	    private  String nom;
	    private String  prenom;
	    
	    public Personne(int id, String nom, String prenom) {
	        this.id = id;
	        this.nom = nom;
	        this.prenom = prenom;
	       
	    }


		@Override
	    public String toString() {
	        return "Personne{" +
	                "id=" + id +
	                ", Nom='" + nom + '\'' +
	                ", Prenom='" + prenom + '\'' +
	           
	                '}';
	    }

	    public int getId() {
	        return id;
	    }

	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (!(o instanceof Personne personne)) return false;
	        return Objects.equals(getId(), personne.getId()) && Objects.equals(getNom(), personne.getNom()) && Objects.equals(getPrenom(), personne.getPrenom()) ;
	    }

	    

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getNom() {
	        return nom;
	    }

	    public void setNom(String nom) {
	        this.nom = nom;
	    }

	    public String getPrenom() {
	        return prenom;
	    }

	    public void setPrenom(String prenom) {
	        this.prenom = prenom;
	    }

	   

	    protected Personne clone()  {
	    	// TODO Auto-generated method stub
	    	try {
	    		return (Personne) super.clone();
	    	} catch (CloneNotSupportedException e) {
	    		// TODO Auto-generated catch block
	    		e.printStackTrace();
	    	}
	    	return null;
	    }


	    public int compareTo(Personne o) {
	    	// TODO Auto-generated method stub
	    	return this.nom.compareTo(o.nom);
	    }

		
	}



