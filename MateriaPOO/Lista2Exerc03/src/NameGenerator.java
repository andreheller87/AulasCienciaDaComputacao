//contribuição felipe
/*public class NameGenerator {
    public static String generateStarWarsName(String[] entrada) {
        String nome = "";
        String primeiraletranome = "";
        String restonome = "";
        String sobrenome = "";
        String sobrenomecidade = "";
        String[] nomes = entrada[0].split(" ");
        String nomeultimo = nomes[nomes.length-1];
   
       
        primeiraletranome += nomeultimo.charAt(0);
        primeiraletranome = primeiraletranome.toUpperCase();
       
        restonome += "" + nomeultimo.charAt(1) + nomeultimo.charAt(2) + entrada[0].charAt(0) + entrada[0].charAt(1);
        restonome =restonome.toLowerCase();
       
        nome = primeiraletranome + restonome;
       
        sobrenome += "" + entrada[1].charAt(0) + entrada[1].charAt(1);
        sobrenomecidade += "" +entrada[2].charAt(0) + entrada[2].charAt(1) + entrada[2].charAt(2);
        sobrenomecidade = sobrenomecidade.toLowerCase();
        sobrenome += sobrenomecidade;
       
        return nome + " " + sobrenome;
    }
   
}*/

//contribuição jonathan

/*public class NameGenerator {
   
    public static String generateStarWarsName(String[] entrada) {
               
        String resultadoFinal = "";
        String[] vetorNome = entrada[0].split(" "); // separa a frase em palavras
        String ultimoNome = vetorNome[vetorNome.length - 1]; // pega o último item do vetor
   
        for (int i = 0; i < 3 ; i++) {
            resultadoFinal = resultadoFinal + ultimoNome.charAt(i);
        }
       
        for (int i = 0; i < 2 ; i++) {
            resultadoFinal = resultadoFinal + entrada[0].charAt(i);
        }
       
        resultadoFinal = resultadoFinal + " ";
       
        for (int i = 0; i < 2 ; i++) {
            resultadoFinal = resultadoFinal + entrada[1].charAt(i);
        }
       
        for (int i = 0; i < 3 ; i++) {
            resultadoFinal = resultadoFinal + entrada[2].charAt(i);
        }
       
        return resultadoFinal;
    }
}*/

// 3 contribuição

public class NameGenerator {
    public static String generateStarWarsName(String[] entrada) {
        String primeiroNome = entrada[0].substring(0, 2);
        String sobrenomeMae = entrada[1].substring(0,2);
        String letrasCidade = entrada[2].substring(0,3);
        
        String[] nomeSeparado = entrada[0].split(" ");
        int tamanho = nomeSeparado.length - 1;
        String sobrenomeLetras = nomeSeparado[tamanho].substring(0,3);
        
        return sobrenomeLetras + primeiroNome + " " + sobrenomeMae + letrasCidade ;
    }
}



 