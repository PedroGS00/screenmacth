public class Main {
    public static void main(String[] args) {

        System.out.println("Esse é o Screen Match");

        System.out.println("Filme: Planeto dos Macacos: O Reinado");

        int anoDeLacamento = 2024;
        /*System.out.println("O ano de lançamento: " + anoDeLacamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 9.0;*/

        double media = (10.0 + 7.0 + 8.5) /3;
        System.out.println(media);

        String sinopse;
        sinopse = """
                Planeta dos macacos
                Filme sobre a vida dos macacos, pós extinsão da raça humano
                Muito top!
                Ano de lançamento
              """ + anoDeLacamento;
        System.out.println(sinopse);

        int classificacao; classificacao = (int) (media /2);
        System.out.println(classificacao);

        System.out.println();
    }
}