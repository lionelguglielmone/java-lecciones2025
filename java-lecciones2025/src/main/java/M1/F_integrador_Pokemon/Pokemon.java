package M1.F_integrador_Pokemon;

public class Pokemon {
    private String nombre;
    private Tipo tipo;
    private int hp;
    private int ataque;

    public Pokemon(String nombre, Tipo tipo, int hp, int ataque) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.hp = hp;
        this.ataque = ataque;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Tipo getTipo() {
        return this.tipo;
    }

    public int getHp() {
        return this.hp;
    }

    public int getAtaque() {
        return this.ataque;
    }

    public void recibirAtaque(int danio) {
        this.hp -= danio;
        if(hp < 0){
            throw new RuntimeException(this.nombre + "ha sido derrotado!");
        }
    }

    public void atacar(Pokemon enemigo) {
        int danio = calcularDanio(enemigo);
        System.out.println(this.nombre + " ataca a " + enemigo.getNombre() + " con " + danio + " de daño");
        enemigo.recibirAtaque(danio);
    }

    public int calcularDanio(Pokemon enemigo) {
        return switch (this.tipo) {
            case FUEGO -> enemigo.getTipo() == Tipo.PLANTA ? this.ataque + 10 : this.ataque;
            case AGUA -> enemigo.getTipo() == Tipo.FUEGO ? this.ataque + 10: this.ataque;
            case PLANTA -> enemigo.getTipo() == Tipo.AGUA ? this.ataque + 10: this.ataque;
        };
    }
}

