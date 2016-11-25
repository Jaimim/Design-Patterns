/*
Objetivo desta classe é mostrar um adaptador de métodos
já construídos sem alterar outros métodos. Apenas
implementar.
*/

package wolf.com.br.Adapter;

/**
 * Created by wolf on 25/09/16.
 */
public class plugAdapter extends PlugTwoPins{

    // Referência da classe de 3 pinos.
    private PlugThreePins plugThreePins;

    // Tomada adaptador para 3 pinos.
    public plugAdapter(PlugThreePins plugThreePins) {
        this.plugThreePins = plugThreePins;
    }

    // Ligar na tomada de 3 pinos.
    public void turnOnInPlugTwoPins() {
        plugThreePins.turnOnInPlugThreePins();
    }

}
