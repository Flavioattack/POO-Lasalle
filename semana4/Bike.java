public class Bike{

    //Atributos da Classe
    private String marca;
    private Integer marchas;
    private String cor;

    public Integer marchaAtual = 1;
    public Boolean andando = false;
        
    
  
    //caracteristica ou metodos
    public void andar() {
        System.out.println("Estou na Marcha  " + this.marchaAtual);
        this.andando = true;
    }
    public void frear() {
        System.out.println("Freiando.....3....2....1!!!!");
        this.andando = false;
    }
    
    public Bike() {
        this.marca = "caloi";
        this.marchas = 10;
        this.cor = "rosa";
    }
}