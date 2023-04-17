package model;

public abstract class Enemigo {
    private int vida,fuerza,velocidad;

    public abstract String getTipo();
    public abstract int atacar(Personaje player);
    public abstract int recibirAtaque(Personaje player);
    public abstract boolean isEnemyDead(Personaje player);

    public Enemigo(int vida, int fuerza, int velocidad) {
        this.vida = vida;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVida() {
        return vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getVelocidad() {
        return velocidad;
    }
}