public class TesteEscalacao {
    public static void main(String[] args){

    Time time = new Time();
    time.setTimeNome("Flamengo");
    
    Jogador jog1 = new Jogador();  //criar um objeto jog1 do tipo Jogador    
    jog1.setNomeJog("Sónio");
    jog1.setSobreNome("Jose");
    jog1.setIdadeJogador(28);
    jog1.setTime(Time.getNome());

    Jogador jog2 = new Jogador();  //criar um objeto jog2 do tipo Jogador
    jog2.setNomeJog("João");
    jog2.setSobreNome("Lucas");
    jog2.setIdadeJogador(30);
    jog2.setTime(Time.getNome());

    Jogador jog3 = new Jogador();  //criar um objeto jog3 do tipo Jogador
    jog3.setNomeJog("Hugo");
    jog3.setSobreNome("Jose");
    jog3.setIdadeJogador(20);
    jog3.setTime(Time.getNome());

    Jogador jog4 = new Jogador();  //criar um objeto jog4 do tipo Jogador
    jog4.setNomeJog("Lopes");
    jog4.setSobreNome("Suino");
    jog4.setIdadeJogador(25);
    jog4.setTime(Time.getNome());

    Jogador jog5 = new Jogador();  //criar um objeto jog5 do tipo Jogador
    jog5.setNomeJog("António");
    jog5.setSobreNome("Birla");
    jog5.setIdadeJogador(28);
    jog5.setTime(Time.getNome());

    Escalacao.imprimirEscalacao();
}
}
