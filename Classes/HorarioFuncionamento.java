public class HorarioFuncionamento {

    private String diaSemana;

    private String horarioAbertura;

    private String horarioFechamento;

    private Integer capacidadeMaxima;

    public HorarioFuncionamento(String diaSemana, String horarioAbertura, String horarioFechamento,
            Integer capacidadeMaxima) {

        this.diaSemana = diaSemana;

        this.horarioAbertura = horarioAbertura;

        this.horarioFechamento = horarioFechamento;

        this.capacidadeMaxima = capacidadeMaxima;

    }

    public String getDiaSemana() {

        return diaSemana;

    }

    public void setDiaSemana(String diaSemana) {

        this.diaSemana = diaSemana;

    }

    public String getHorarioAbertura() {

        return horarioAbertura;

    }

    public void setHorarioAbertura(String horarioAbertura) {

        this.horarioAbertura = horarioAbertura;

    }

    public String getHorarioFechamento() {

        return horarioFechamento;

    }

    public void setHorarioFechamento(String horarioFechamento) {

        this.horarioFechamento = horarioFechamento;

    }

    public Integer getCapacidadeMaxima() {

        return capacidadeMaxima;

    }

    public void setCapacidadeMaxima(Integer capacidadeMaxima) {

        this.capacidadeMaxima = capacidadeMaxima;

    }

}