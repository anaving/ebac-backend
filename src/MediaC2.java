public class MediaC2 {
        public static void main(String args[]) {
            int nota1 = 10;
            int nota2 = 9;
            int nota3 = 8;
            int nota4 = 9;

            int media = nota1 + nota2 + nota3 + nota4;
            int resultado = media / 4;

            if (media >= 7) {
                System.out.println("Aluno aprovado!");
            } else if (media >= 5) {
                System.out.println("de recuperação!");
            } else {
                System.out.println("Aluno reprovado!");

            }

        }
    }

