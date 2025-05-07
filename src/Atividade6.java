public class Atividade6 {
    public static void main(String[] args) {
        double preco = 150.00;

        if(preco < 50) {
            System.out.println("Economico");
        } else if(preco > 50 && preco < 200) {
            System.out.println("Intermediário");
        } else {
            System.out.println("Premium");
        }
    }
}
