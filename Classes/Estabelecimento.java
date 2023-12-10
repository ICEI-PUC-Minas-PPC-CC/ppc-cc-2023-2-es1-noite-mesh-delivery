import java.util.List;

public class Estabelecimento {

    private String nome;

    private List<Produto> menu;

    private List<Produto> estoque;

    private List<HorarioFuncionamento> horariosDeFuncionamento;

    public Estabelecimento(String nome, List<Produto> menu, List<Produto> estoque,
            List<HorarioFuncionamento> horariosDeFuncionamento) {

        this.nome = nome;

        this.menu = menu;

        this.estoque = estoque;

        this.horariosDeFuncionamento = horariosDeFuncionamento;

    }

    public String getNome() {

        return nome;

    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public List<Produto> getMenu() {

        return menu;

    }

    public void setMenu(List<Produto> menu) {

        this.menu = menu;

    }

    public List<Produto> getEstoque() {

        return estoque;

    }

    public void setEstoque(List<Produto> estoque) {

        this.estoque = estoque;

    }

    public List<HorarioFuncionamento> getHorariosDeFuncionamento() {

        return horariosDeFuncionamento;

    }

    public void setHorariosDeFuncionamento(List<HorarioFuncionamento> horariosDeFuncionamento) {

        this.horariosDeFuncionamento = horariosDeFuncionamento;

    }

}