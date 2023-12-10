import java.util.List;

public class Pedido {

    private Cliente cliente;

    private Estabelecimento estabelecimento;

    private List<Produto> itens;

    private String status;

    private Entregador entregador;


    public Pedido(Cliente cliente, Estabelecimento estabelecimento, List<Produto> itens) {

        this.cliente = cliente;

        this.estabelecimento = estabelecimento;

        this.itens = itens;

        this.status = "Aguardando confirmação";

    }


    public Cliente getCliente() {

        return cliente;

    }


    public void setCliente(Cliente cliente) {

        this.cliente = cliente;

    }


    public Estabelecimento getEstabelecimento() {

        return estabelecimento;

    }


    public void setEstabelecimento(Estabelecimento estabelecimento) {

        this.estabelecimento = estabelecimento;

    }


    public List<Produto> getItens() {

        return itens;

    }


    public void setItens(List<Produto> itens) {

        this.itens = itens;

    }


    public String getStatus() {

        return status;

    }


    public void setStatus(String status) {

        this.status = status;

    }


    public Entregador getEntregador() {

        return entregador;

    }


    public void setEntregador(Entregador entregador) {

        this.entregador = entregador;

    }

}