package br.com.alura.screenmatch.excecao;

public class ErrodeConversaoDeAnoException extends RuntimeException {
    private String mensagem;

    public ErrodeConversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
