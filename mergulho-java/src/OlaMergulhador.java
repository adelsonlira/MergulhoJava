public class OlaMergulhador {
    public static void main(String[] args) {
        System.out.println("Olá, Mundo!");

        String nomeCompelto;

        nomeCompelto = "Lula da Silva";

        System.out.println("Nome: "+nomeCompelto);

        int minhaIdade = 65;
        int suaIdade = 37;
        int totalIdades = minhaIdade + suaIdade;

        System.out.println("Total das idades: "+totalIdades+" anos");

        double peso = 87.5;
        System.out.println("Peso: "+peso);

        float taxa = 1294.93f;
        System.out.println("Taxa: "+taxa);

        boolean compraAprovada = false;
        System.out.println("A compra foi aprovada? "+compraAprovada);

        boolean maiorDeIdade = minhaIdade > 18;
        System.out.println("A afirmação é: "+maiorDeIdade);
    }
}
