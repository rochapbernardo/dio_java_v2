public class Escola {
    public static void main(String[] args) {
        String nome = "Bernardo Rocha";
        int idade = 23;
        Estudante estudante1 = new Estudante(nome, idade);
        estudante1.setName(nome);
        estudante1.setAge(idade);
        
        System.out.println("Aluno: " + estudante1.getName() + "; Idade: " + estudante1.getAge());
    }
}
