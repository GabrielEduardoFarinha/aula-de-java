public class Main {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua das Floriculturas");

        Pessoa pessoa1 = new Pessoa("Raphael", endereco1);

        System.out.println("Original Pessoa: " + pessoa1);

        Pessoa pessoaShallow = pessoa1.cloneShallow();
        System.out.println("Shallow Cloned Pessoa: " + pessoaShallow);

        Pessoa pessoaDeep = pessoa1.cloneDeep();
        System.out.println("Deep Cloned Pessoa: " + pessoaDeep);

        endereco1.setRua("Rua das Flores 61");
        
        System.out.println("apôs o Jutsu fica assim:");
        System.out.println("Original Pessoa: " + pessoa1);
        System.out.println("Shallow Cloned Pessoa: " + pessoaShallow);
        System.out.println("Deep Cloned Pessoa: " + pessoaDeep);
    }
}
