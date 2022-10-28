public class Flying extends Birds {

    private String typeOfMove;

// getters & setters **************************************************************************************

    public String getTypeOfMove() { return typeOfMove;
    }
    public void setTypeOfMove(String typeOfMove) {
        this.typeOfMove = (typeOfMove != null && !typeOfMove.isEmpty() && !typeOfMove.isBlank()) ? typeOfMove : "fly" ;
    }
// constructors *******************************************************************************************
    public Flying(String nickname,int age, String livingEnvironment, String typeOfMove) {
        super(nickname,age, livingEnvironment);
        setTypeOfMove(typeOfMove);
    }
// Methods ************************************************************************************************
@Override
public String toString() {
    return getNickname() +": летающая птица, " + getAge() + " лет, среда обитания - " + getLivingEnvironment() +
            ", тип передвижения " + getTypeOfMove() +  ".";
}
    public void fly() {
        System.out.println("Летает над морем и сушей.");
    }
} // class ************************************************************************************************
