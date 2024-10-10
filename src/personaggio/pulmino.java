package personaggio;

public class pulmino {
    private String personaggio;
    private String nome;

    private int velocita;
    private int fortuna;

    private int distanza;

    public pulmino(String personaggio, String nome, int velocita, int fortuna, int distanza) {
        this.personaggio = personaggio;
        this.nome = nome;
        this.velocita = velocita;
        this.fortuna = fortuna;
        this.distanza = distanza;
    }

    public int getDistanza() {
        return distanza;
    }

    public void setDistanza(int distanza) {
        this.distanza = distanza;
    }

    public int getVelocita() {
        return velocita;
    }

    public void setVelocita(int velocita) {
        this.velocita = velocita;
    }

    public int getFortuna() {
        return fortuna;
    }

    public void setFortuna(int fortuna) {
        this.fortuna = fortuna;
    }

    public String getPersonaggio() {
        return personaggio;
    }

    public void setPersonaggio(String personaggio) {
        this.personaggio = personaggio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int calcoloDistanza(){
        int v = getVelocita();
        int f = getFortuna();
        int d = getDistanza();


        double primoCalcolo = (((Math.random())*v));
        double secondoCalcolo = ((Math.random())*f);

        double calcoloDistanza = (Math.random()+1) * ((primoCalcolo * secondoCalcolo));

        return (int) calcoloDistanza;
    }



}
