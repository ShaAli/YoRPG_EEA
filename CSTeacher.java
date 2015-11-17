/*=============================================
  class CSTeacher -- protagonist of Ye Olde RPG
  =============================================*/
 
public class CSTeacher extends Character {

    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public CSTeacher() {
	_hitPts = 999;
	_strength = 999;
	_defense = 40;
	_attack = .4;
    }


    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public CSTeacher( String name ) {
	this();
	_name = name;
    }
    
    public String about(){
  	return "The CS Teacher seeks the education of all in the most holy of pursuits, computer science. Literally a living god, select this class only if you always like to win.";
	}
public void specialize(){
  _defense = 100;
  _attack = 5.0;
}

public void normalize(){
	_defense = 40;
	_attack = .4;
}

}//end class CSTeacher

