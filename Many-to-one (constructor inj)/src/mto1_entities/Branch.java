package mto1_entities;


// Dependent object
public class Branch {
	private String bifsc;
	private String bloc;
	
	
	public Branch(String bifsc, String bloc) {
		
		this.bifsc = bifsc;
		this.bloc = bloc;
				
	}


	public String getBifsc() {
		return bifsc;
	}


	public String getBloc() {
		return bloc;
	}
	
	
	
}
