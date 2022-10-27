public class Amphibians extends Animals {

    private String livingEnvironment;

// getters **********************************************************************************************
    public String getLivingEnvironment() { return livingEnvironment;
    }
// setters **********************************************************************************************

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = ( livingEnvironment != null && !livingEnvironment.isEmpty() &&
                !livingEnvironment.isBlank() ) ? livingEnvironment : "default";
    }
// constructors *******************************************************************************************
    public Amphibians(String nickname,int age, String livingEnvironment) {
        super(nickname, age);

        setLivingEnvironment(livingEnvironment);
    }
// Methods ************************************************************************************************
    public void walk() {
        System.out.println("Плыву охотиться.");
    }
} // class ************************************************************************************************
