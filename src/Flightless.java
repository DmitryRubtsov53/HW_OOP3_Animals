public class Flightless extends Birds {

    private String typeOfMove;

// getters & setters **************************************************************************************

    public String getTypeOfMove() { return typeOfMove;
    }
    public void setTypeOfMove(String typeOfMove) {
        this.typeOfMove = (typeOfMove != null && typeOfMove.isEmpty() && typeOfMove.isBlank()) ? typeOfMove : "fly" ;
    }
    // constructors *******************************************************************************************
    public Flightless (String nickname,int age, String livingEnvironment, String typeOfMove) {
        super(nickname,age, livingEnvironment);

        setTypeOfMove(typeOfMove);
    }

    // Methods ************************************************************************************************
    public void walk() {
        System.out.println("Гуляю, пока нет хищников.");
    }
} // class ************************************************************************************************
