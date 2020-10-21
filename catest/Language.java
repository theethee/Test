package catest;

public class Language{
 
  protected String name;
  protected int numSpeakers; // HEJHEJHEJ
  protected String regionSpoken;
  protected String wordOrder;

protected Language(String langName, int langNumSpeakers, String langRegionSpoken, String langWordOrder){
  name = langName;
  numSpeakers = langNumSpeakers;
  regionSpoken = langRegionSpoken;
  wordOrder = langWordOrder;
}
  public static void main(String[] args){

Language swedish = new Language("Swedish", 10000000, "Sweden", "subject - verb - object");
Language ixil = new Mayan("Ixil", 83600);
Language mandarinChinese = new SinoTibetan("Mandarin Chinese", 920000000);
Language burmese = new SinoTibetan("Burmese", 33000000);

swedish.getInfo();
ixil.getInfo();
mandarinChinese.getInfo();
burmese.getInfo();
// TESTAR GIT


  }

  public void getInfo(){

    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionSpoken + ". \nThe language follows the word order: " + this.wordOrder + ".");
  }
}
