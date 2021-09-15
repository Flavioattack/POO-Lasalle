public class Time {

    //atributos
    private static String nome;
    private String escudo;

    public Time(){
        Time.nome = "Flamengo";
        this.escudo = "Vermelho e Preto";
    }

    public static String getNome(){
        return nome;
    }
    public String getEscudo(){
        return escudo;
    }
    
}