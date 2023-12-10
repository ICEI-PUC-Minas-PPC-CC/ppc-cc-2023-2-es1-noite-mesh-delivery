public class FormaDePagamento {

    private String tipo;
    private String numero;
    private String validade;

    public FormaDePagamento(String tipo, String numero, String validade) {
        this.tipo = tipo;
        this.numero = numero;
        this.validade = validade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }
}
