public class Herbivores extends Mammals{

    private  String food;

// getters & setters **************************************************************************************
    public String getFood() { return food;
    }
    public void setFood(String food) {
        this.food = (food != null && !food.isEmpty() && !food.isBlank()) ? food : "is fast";
    }
// constructors *******************************************************************************************

    public Herbivores (String nickname,int age, String livingEnvironment, int travelSpeed, String food) {
        super(nickname, age, livingEnvironment, travelSpeed);
        setFood(food);
    }

// Methods ************************************************************************************************
    public void graze() {
        System.out.println("Пастись на лугу так приятно!");
    }
} // class ************************************************************************************************
