public class Telefone {

    private String ddd;
    private String numero;
    private String tipo;

    public Telefone(String numero, String ddd, String tipo) {
        this.numero = numero;
        this.ddd = ddd;
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
