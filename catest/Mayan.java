package catest;

public class Mayan extends Language{
	  
	   protected Mayan(String langName, int langNumSpeakers) {
		super(langName, langNumSpeakers, "Central America", "verb-object-subject");
	
	}
	   @Override
	   public void getInfo(){
		   
		   // THITIIIIIIIIIII HELLO

	       System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionSpoken + ". \nThe language follows the word order: " + this.wordOrder + ".\nFun fact:" + this.name +" is an ergative language.");
	     }
	
	}