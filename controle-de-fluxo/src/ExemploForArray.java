public class ExemploForArray {
    public static void main(String[] args) {
        String[] alunos = {"Lucas", "Carlos", "Daniels", "Matthew", "Robbins", "Robert"};
        // For
        // for (int i=0; i<alunos.length; i++) {
        //     System.out.println("Nome do aluno " + (i+1) + ": " + alunos[i]);

        // }

        // For / each

        for (String aluno : alunos) {
            System.out.println("Nome do aluno: " + aluno);
        }
    }
}
