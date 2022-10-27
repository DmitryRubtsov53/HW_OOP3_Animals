public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание урока ООР3 Животные *********************************************" + "\n");

        Mammals[] mammal = new Mammals[6];   System.out.println("Млекопитающие животные:" + "\n");

        mammal[0] = new Herbivores("Газель",7, "саванна", 50, "трава и кустарник");
        mammal[1] = new Herbivores("Жираф",5, "лесостепь", 35, "листья деревьев");
        mammal[2] = new Herbivores("Лошадь",6, "лесостепь", 35, "трава и кустарник");
        mammal[3] = new Predators("Гиена",5,"саванна", 40, "падаль");
        mammal[4] = new Predators("Тигр",6, "джунгли", 60, "свежее мясо");
        mammal[5] = new Predators("Медведь",6, "тайга", 55, "мясо и ягоды");

        Mammals.printMammals (mammal);
        System.out.println();
        System.out.println("Сравним Жирафа с Газелью : " + mammal[0].equals(mammal[1]) + ", Жирафа с Лошадью : " + mammal[2].equals(mammal[1]) + ".");
        System.out.println();

        mammal[5].go(); mammal[5].eat(); mammal[5].slip();
        System.out.println("\n");

        Amphibians[] amphibian = new Amphibians[2];   System.out.println("Земноводные:" + "\n");

        amphibian[0] = new Amphibians("Лягушка", 10,"болото");
        amphibian[1] = new Amphibians("Уж пресноводный", 1,"озеро");

        Amphibians.printAmphibians (amphibian);
        System.out.println();
        System.out.println("Сравним Лягушку и Ужа : " + amphibian[0].equals(amphibian[1]) + ".");
        System.out.println();

        amphibian[0].go(); amphibian[0].eat(); amphibian[0].slip();
        System.out.println("\n");

        Birds[] bird = new Birds[6];   System.out.println("Птицы:" + "\n");

        bird[0] = new Flightless("Павлин", 9, "пустыня", "пеший");
        bird[1] = new Flightless("Пингвин", 3, "Антарктида", "гуськом");
        bird[2] = new Flightless("Птица Додо", 2, "тропики", "бегом");
        bird[3] = new Flying("Чайка", 9, "море", "маховый");
        bird[4] = new Flying("Альбатрос", 4, "океан", "планирующий");
        bird[5] = new Flying("Сокол", 4, "горы", "молненосный");

        Birds.printBirds (bird);
        System.out.println();
        System.out.println("Сравним Пингвина с Павлином : " + bird[0].equals(bird[1]) + ", Альбатроса с Соколом : " + bird[4].equals(bird[5]) + ".");
        System.out.println();

        bird[5].go(); bird[5].eat(); bird[5].slip();

    }
} // class ***************************************************************************************************