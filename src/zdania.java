public class zdania {
    public static void main(String[] args) {
        String komunikat = "Dziś jest ciepło i świeci słońce";
        String komunikat2 = "Niebo jest troche pochmurne ale deszcz nie pada";
        String komunikat3 = "Noc jest ciepła. Można spać przy otwartym oknie";
        System.out.println(komunikat);
        System.out.println(komunikat2);
        System.out.println(komunikat3);
        int dlugosc = komunikat.length()+ komunikat2.length()+komunikat3.length();
        System.out.println("Suma znaków trzech poprzednich zdań wynosi: " + dlugosc);
    }
}
