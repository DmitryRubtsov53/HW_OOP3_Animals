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
        System.out.println("Охотится в воде.");
    }
    @Override
    public String toString() {
        return getNickname() + ": земноводное, " + getAge() + " лет, среда обитания - " + getLivingEnvironment() +
                ".";
    }
    public static void printAmphibians (Amphibians[] amphibian) {
        for (Amphibians el : amphibian) {
            System.out.println(el);
        }
    }

    @Override
    public void eat() {
        if (getNickname().equals("Лягушка"))
            System.out.print("Днём ловит мух и ест.");
        if (getNickname().equals("Уж пресноводный"))
            System.out.print("Днём выслеживает Лягушек, убивает и ест. ");

    }
    @Override
    public void slip() {
        if (getNickname().equals("Лягушка"))
            System.out.print(" Ночю не спит - квакает во всё горло. ");
        if (getNickname().equals("Уж пресноводный"))
                     System.out.print(" Ночью спит.");
    }
    @Override
    public void go() {
        if (getNickname().equals("Лягушка"))
            System.out.print("СПРАВКА: " + getNickname() + " перемещается по земле прыжками, в воде - плывёт. ");
        if (getNickname().equals("Уж пресноводный")) {
            System.out.print("СПРАВКА: " + getNickname() + " ползает по земле, в воде - извиваясь плывёт. ");
        }
    }

} // class ************************************************************************************************
