import java.util.List;

public class Entregador {

    private String nome;

    private String veiculo;

    private List<Pedido> pedidosAtribuidos;

    private Avaliacao avaliacao;

    public Entregador(String nome, String veiculo) {

        this.nome = nome;

        this.veiculo = veiculo;

    }

    public String getNome() {

        return nome;

    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public String getVeiculo() {

        return veiculo;

    }

    public void setVeiculo(String veiculo) {

        this.veiculo = veiculo;

    }

    public List<Pedido> getPedidosAtribuidos() {

        return pedidosAtribuidos;

    }

    public void setPedidosAtribuidos(List<Pedido> pedidosAtribuidos) {

        this.pedidosAtribuidos = pedidosAtribuidos;

    }

    public Avaliacao getAvaliacao() {

        return avaliacao;

    }

    public void setAvaliacao(Avaliacao avaliacao) {

        this.avaliacao = avaliacao;

    }

}