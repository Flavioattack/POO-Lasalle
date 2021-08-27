import javax.print.event.PrintJobListener;

public class Jogador {

    public String nome;
    public String sobreNome;
    public Integer idade;
    public Time time;
    
    public Jogador(){
        time = new Time();
    }

    public void mostrarNomeSobre(){
        System.out.println(this.nome + " " + this.sobreNome);
    }

}
