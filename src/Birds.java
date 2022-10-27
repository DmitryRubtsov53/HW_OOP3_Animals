public class Birds extends Animals {

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
    public Birds (String nickname,int age, String livingEnvironment) {
            super(nickname, age);

        setLivingEnvironment(livingEnvironment);
    }
    // Methods ************************************************************************************************
    public void hunt() {
        System.out.println("Лечу охотиться.");
    }
} // class ************************************************************************************************
