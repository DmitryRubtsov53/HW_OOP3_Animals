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
    public static void printBirds (Birds[] bird) {
        for (Birds el : bird) {
            System.out.println(el);
        }
    }

    @Override
    public void eat() {
       if (getNickname().equals("Чайка") || getNickname().equals("Албатрос") || getNickname().equals("Пингвин"))
           System.out.print("Днём ловит в море рыбу и ест.");
       if (getNickname().equals("Павлин") || getNickname().equals("Птица Додо")) {
            System.out.print("Днём выкапывает червей из земли и ест. ");
        } else System.out.print("Днём высматривает мелких животных, убивает с лёту клювом и ест. ");
    }
    @Override
    public void slip() {
        System.out.print("Ночью спит. ");
    }
    @Override
    public void go() {
        if (getNickname().equals("Чайка") || getNickname().equals("Албатрос") || getNickname().equals("Сокол"))
            System.out.print("Например, " + getNickname() + " перемещается по воздуху. ");
        if (getNickname().equals("Павлин") || getNickname().equals("Птица Додо") || getNickname().equals("Пингвин")) {
            System.out.print("Например, " + getNickname() + "перемещается по земле. ");
        }
    }
} // class ************************************************************************************************
