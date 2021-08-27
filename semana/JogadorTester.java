public class JogadorTester {
    public static void main(String[] args) {
        Jogador jog1 = new Jogador();
        
        jog1.nome = "Neymar";
        jog1.sobreNome = "Junior";
        jog1.idade = 24;
        jog1.time.escudo = "psg.jpg";
        jog1.time.nome = "psg.jpg";

        jog1.mostrarNomeSobre();
    }
}
