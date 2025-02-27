public enum EstadosBrasileiros {
    ESPIRITO_SANTO("ES", "Espírito Santo"),
    RIO_JANEIRO("RJ", "Rio de Janeiro"),
    MARANHAO("MA", "Maranhão");

    private String nome;
    private String sigla;

    private EstadosBrasileiros(String sigla, String nome){
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
    public String getSigla(){
        return sigla;
    }
    
    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
}
