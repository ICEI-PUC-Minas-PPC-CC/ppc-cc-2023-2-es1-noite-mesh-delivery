import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private String email;
    private List<Telefone> telefones;
    private List<Endereco> enderecos;
    private List<FormaDePagamento> formasDePagamento;
    private List<Cliente> seguindo;
    private List<Pedido> pedidos;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.telefones = new ArrayList<>();
        this.enderecos = new ArrayList<>();
        this.formasDePagamento = new ArrayList<>();
        this.seguindo = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void addTelefone(Telefone telefone) {
        this.telefones.add(telefone);
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void addEndereco(Endereco endereco) {
        this.enderecos.add(endereco);
    }

    public List<FormaDePagamento> getFormasDePagamento() {
        return formasDePagamento;
    }

    public void addFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formasDePagamento.add(formaDePagamento);
    }

    public List<Cliente> getSeguindo() {
        return seguindo;
    }

    public void addSeguindo(Cliente cliente) {
        this.seguindo.add(cliente);
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void addPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }
}
