public class Main {

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstancia();
        logger1.log("Primeira mensagem de log");

        Logger logger2 = Logger.getInstancia();
        logger2.log("Segunda mensagem de log");

        System.out.println("As instâncias são iguais? " + (logger1 == logger2));
    }
}
