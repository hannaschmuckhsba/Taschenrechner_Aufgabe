public class Main {
    public static void main(String[] args) {
        Taschenrechner_Backend calculator = new Taschenrechner_Backend();

        try {
            double result = calculator.add(0.5,2);
            System.out.println("Das Ergebnis ist: "+ result);
        }

        catch (Exception e) {
            System.out.println("Irgendwas ist falsch. " + e.getMessage());
        }
    }
}