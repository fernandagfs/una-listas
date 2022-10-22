package lista6.produto;

public class Produto {
    private int codigo;
    private String nome;
    private int quantidade;
    private float valorCompra;
    private float valorVenda;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda =  valorVenda;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public float getValorCompra() {
        return this.valorCompra;
    }

    public float getValorVenda() {
        return this.valorVenda;
    }
}
