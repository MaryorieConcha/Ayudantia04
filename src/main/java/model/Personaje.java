package model;

public class Personaje {
    private String name;
    private int vida,fuerza,velocidad;

    public Personaje(String name, int vida, int fuerza, int velocidad) {
        this.name = name;
        this.vida = vida;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
    }

    public int atacar(Enemigo monstruo) {
        int vidaMonstruo = monstruo.getVida();
        System.out.println("Jugador ataca a " + monstruo.getTipo());
        vidaMonstruo = vidaMonstruo - this.fuerza;
        monstruo.setVida(vidaMonstruo);
        return monstruo.getVida();
    }

    public int recibirAtaque(Enemigo monstruo) {
        int vidaJugador = this.vida;
        System.out.println(monstruo.getTipo() + "ataca a Jugador");
        vidaJugador = vidaJugador - monstruo.getFuerza();
        setVida(vidaJugador);
        return this.vida;
    }

    public boolean isPlayerDead(Enemigo monstruo){
        if (recibirAtaque(monstruo) <= 0){
            System.out.println("Jugador murió.");
            return true;
        }
        System.out.println("Vida restante de " + getName() + ": " + getVida());
        return false;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
}
