/*=============================================
  class Lawyer -- protagonist of Ye Olde RPG
  =============================================*/
 
public class Lawyer extends Character {

    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Lawyer() {
	_hitPts = 150;
	_strength = 60;
	_defense = 40;
	_attack = .4;
    }


    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Lawyer( String name ) {
	this();
	_name = name;
    }
    
   public string about(){
  	return "The Lawyer wields his words as his weapon. He prefers battle in the courtroom and his eloquence is feared throughout the land.";
	}
public void specialize(){
  _defense = 100;
  _attack = 0.1;
}

public void normalize(){
	_defense = 40;
	_attack = .4;
}

}//end class CSTeacher
/*=============================================
  class CSTeacher -- protagonist of Ye Olde RPG
  =============================================*/
