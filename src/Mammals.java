public class Mammals extends Animals {
    private String livingEnvironment;  // среда проживания
    private int travelSpeed;           // скорость перемещения в км/ч.

// getters **********************************************************************************************

    public String getLivingEnvironment() { return livingEnvironment;
    }
    public int getTravelSpeed() { return travelSpeed;
    }
// setters **********************************************************************************************

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = ( livingEnvironment != null && !livingEnvironment.isEmpty() &&
                                          !livingEnvironment.isBlank() ) ? livingEnvironment : "default";
    }
    public void setTravelSpeed(int travelSpeed) {
        this.travelSpeed = travelSpeed != 0 ? travelSpeed : 10;
    }

// constructors *******************************************************************************************
    public Mammals(String nickname,int age, String livingEnvironment, int travelSpeed) {
        super(nickname, age);

        setLivingEnvironment(livingEnvironment);
        setTravelSpeed(travelSpeed);
    }

// Methods ************************************************************************************************
    public void walk() {
        System.out.println("Гуляю в хорошую погоду.");
    }
} // class ************************************************************************************************
