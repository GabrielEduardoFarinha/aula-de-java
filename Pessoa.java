public class Pessoa {
    private String nome;
    private Endereco endereco;

    public Pessoa(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Pessoa cloneShallow() {
        return new Pessoa(this.nome, this.endereco);
    }

    public Pessoa cloneDeep() {
        String nomeModificado = this.nome + " Clone";
        Endereco enderecoClone = new Endereco(this.endereco.getRua());
        return new Pessoa(nomeModificado, enderecoClone);
    }

    @Override
    public String toString() {
        return   nome + ", Endereco: " + endereco.toString();
    }
}
