package catest;

public class SinoTibetan extends Language{
	  
	  protected SinoTibetan(String langName, int langNumSpeakers){
	    super(langName, langNumSpeakers, "Asia", "subject-object-verb");
	    if (langName.contains("Chinese")) {
	        this.wordOrder = "subject-verb-object";
	        
	        // HEJ THITI!! HITTA DU MIG?
	    }
	  }
	}
