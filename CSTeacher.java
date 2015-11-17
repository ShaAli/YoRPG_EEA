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

}//end class CSTeacher

