package principal;

import model.*;

public class Partida {

    public static void main(String[] args) {
        start();
    }

    public static void start(){
        Personaje jugador1 = new Personaje("Jugador 1",200,50,20);
        Enemigo zombie = new Zombie(100,30,15);
        Enemigo goblin = new Goblin(50,20,30);
        Enemigo boss = new Boss(250,45,25);

        jugador1.atacar(zombie);
        zombie.recibirAtaque(jugador1);
        zombie.isEnemyDead(jugador1);
        zombie.atacar(jugador1);
        jugador1.recibirAtaque(zombie);
        jugador1.isPlayerDead(zombie);

    }


}
