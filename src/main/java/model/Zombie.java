package model;

public class Zombie extends Enemigo{
    public Zombie(int vida, int fuerza, int velocidad) {
        super(vida, fuerza, velocidad);
    }

    public String getTipo() {
        return "Zombie";
    }

    public int atacar(Personaje player) {
        int vidaJugador = player.getVida();
        System.out.println(getTipo() + " ataca a Jugador");
        vidaJugador = vidaJugador - getFuerza();
        setVida(vidaJugador);
        return player.getVida();
    }

    public int recibirAtaque(Personaje player) {
        int vidaMonstruo = getVida();
        System.out.println("Jugador ataca a " + getTipo());
        vidaMonstruo = vidaMonstruo - player.getFuerza();
        setVida(vidaMonstruo);
        return getVida();
    }

    public boolean isEnemyDead(Personaje player) {
        if (recibirAtaque(player) <= 0){
            System.out.println(getTipo() + " murió.");
            return true;
        }
        System.out.println("Vida restante de " + getTipo() + ": " + getVida());
        return false;
    }
}
