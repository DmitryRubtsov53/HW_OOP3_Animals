import java.time.LocalDate;

public abstract class Animals {

    private String nickname;
    private  int age;

// getters **********************************************************************************************
    public String getNickname() { return nickname;
    }
    public int getAge() { return age;
    }
// setters **********************************************************************************************

// constructors *******************************************************************************************
    public Animals(String nickname, int age) {
        this.nickname = (nickname != null && !nickname.isEmpty() && !nickname.isBlank()) ? nickname : "animal";
        this.age = age >= 0 ? age : 0;
    }
// Methods ************************************************************************************************
    public abstract void eat();
    public abstract void slip();
    public abstract void go();

} // class ************************************************************************************************
