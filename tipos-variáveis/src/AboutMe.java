public class AboutMe {
    public static void main(String[] args) {
        //os argumentos começam com indice 0
        String nome = args [0]; //Esse programa será executado pelo cmd, através do bin no diretório do PC
        String sobrenome = args [1]; //depois de passar as intruções java e o nome do programa, informanos os dados *nome, *sobrenome, *idade e *altura
        int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
        double altura = Double.valueOf(args[3]);

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "cm ");
    }
}
