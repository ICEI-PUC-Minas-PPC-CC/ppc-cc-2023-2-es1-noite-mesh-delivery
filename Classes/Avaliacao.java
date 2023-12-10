public class Avaliacao {

    private Integer pontuacao;

    private String comentario;

    public Avaliacao(Integer pontuacao, String comentario) {

        this.pontuacao = pontuacao;

        this.comentario = comentario;

    }

    public Integer getPontuacao() {

        return pontuacao;

    }

    public void setPontuacao(Integer pontuacao) {

        this.pontuacao = pontuacao;

    }

    public String getComentario() {

        return comentario;

    }

    public void setComentario(String comentario) {

        this.comentario = comentario;

    }

}