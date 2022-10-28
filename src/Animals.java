import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(nickname, animals.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname, age);
    }
} // class ************************************************************************************************
