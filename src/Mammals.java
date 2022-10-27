import java.util.Objects;

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
    public static void printMammals (Mammals[] mammal) {
        for (Mammals el : mammal) {
            System.out.println(el);
        }
    }

    @Override
    public void eat() {
        if (getNickname().equals("Газель") || getNickname().equals("Жираф") || getNickname().equals("Лошадь"))
            System.out.print("Днём ищет сочную траву или листья и ест.");
        if (getNickname().equals("Гиена") || getNickname().equals("Тигр")) {
            System.out.print("Днём выслеживает добычу, убивает и ест. ");
        } else System.out.print("Днём ищет ягоды и ест, иногда убивает коров на мясо. ");
    }
    @Override
    public void slip() {
        System.out.print("Ночью спит.");
    }
    @Override
    public void go() {
        if (getNickname().equals("Газель") || getNickname().equals("Жираф") || getNickname().equals("Лошадь"))
            System.out.print("СПРАВКА: " + getNickname() + " перемещается по земле рысью или голопом. ");
        if (getNickname().equals("Гиена") || getNickname().equals("Тигр")) {
            System.out.print("СПРАВКА: " + getNickname() + " может перемещаеться по земле быстро и незаметно. ");
        } else  System.out.print("СПРАВКА: " + getNickname() + " может перемещаеться по земле и лазить по деревьям. ");
    }


} // class ************************************************************************************************
