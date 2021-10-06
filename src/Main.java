import java.util.*;

public class Main {

    public static void main(String[] args) {
        String hash = "AcoDQeYjrSlByFtyzQhvjoCNVpsaLeQPtGUjQHVzbgabJuAiMHDxwfkNvCwIGmZCTInlSiKvRKxAGzJsgmPeUBAReDzmLzqgJgrXobzfoWiwvRPdFgJzIkSoJscWtVdEbuIRYhXOdHkayBdFIMHSyzIJtmGMhJTiFBaDIzrngCngdSnngUHFWpQpCwElHxunYWsiXKvFOkntcAHiXopTgIKkeovoLrBlPTtMfqTTAgnejUPgKeBsolCtAAjNtKBjf";

        // Transformando o hash em array de caracteres
        char[] list = hash.toCharArray();

        // Iniciando uma lista com 1
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(1);

        // String buider usado para unir os caracteres conforme forém encontrados
        StringBuilder builder = new StringBuilder();


        // Loop para percorrer a lista de caracteres enquanto não houver 10 caracteres no builder

        for (int i = 0; i < list.length && builder.length() <= 10; i++) {
            // Descubro se já tenho mais de um resultado na conta da lista de fibonacci, se tiver eu somo os dois últimos números, se não tiver eu pego o primeiro da lista no caso 1
            int valor = fibonacci.size() > 1 ? sumTwoLastValues(fibonacci) : fibonacci.get(0);

            // Adiciono o resultado a lista de fibonacci
            fibonacci.add(valor);

            // Pego o caractere do hash correspondende a posição do resultado
            char val = list[valor];

            // Faço a inclusão do caractere a lista
            builder.append(val);
        }


        // Separo os 5 primeiros caracteres, adiciono um ponto e pego os 5 últimos caracteres. Depois eu concateno com o domínio do e-mail.
        String email = builder.substring(0, 5) + "." + builder.substring(5, 10) + "@aoop.com.br";

        // Transformo tudo em letras mínusculas e exibo o resultado
        System.out.println(email.toLowerCase());

    }

    // Função para somar os dois últimos números da lista
    private static int sumTwoLastValues(List<Integer> value) {
        return value.get(value.size() - 2) + value.get(value.size() - 1);
    }
}
