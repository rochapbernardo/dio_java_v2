package br.com.dio.model;

public enum GameStatus {
    NON_STARTED("Nãp iniciado"),
    INCOMPLETE("Incompleto"),
    COMPLETE("Completo");

    private String label;
    GameStatus(final String label){
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
