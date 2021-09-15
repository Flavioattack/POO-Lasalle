/**
 * Jogador
 */
import java.util.ArrayList;
public class Jogador {

    //atributos
    private static ArrayList<String> ListaJogadores = new ArrayList<String> ();
    private String nomeJog;
    private String sobreNome;
    private Integer idade;
    public Time time;
  

    //construtor
    public Jogador(){
        time = new Time();
    }
    //metodos
    public String getNomeJog(){
        return nomeJog;
    }
    public String getSobreNome(){
        return sobreNome;
    }
    public Integer getIdade(){
        return idade;
    }
    public static ArrayList<String> getListaJogador(){
        return ListaJogadores;
    }
    public void idadeJogador(int n1){
        this.idade = n1;
    }
    public void sobrenomeJogador(String sobrenome){
        this.sobreNome = sobrenome;
    }
    public void nomeJogador(String nomejog){
        this.nomeJog = nomejog;
        ListaJogadores.add(nomejog);
    }


}