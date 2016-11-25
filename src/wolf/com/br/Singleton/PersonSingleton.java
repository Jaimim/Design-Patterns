/*
Objetivo desta classe é mostrar o
padrão de projeto: Singleton.
*/

package wolf.com.br.Singleton;

/**
 * Created by wolf on 25/09/16.
 */
public class PersonSingleton {

    // Define o objeto a criar, tipo privado.
    private static PersonSingleton uniqueInstance = new PersonSingleton();

    // Método construtor privado vázio.
    private PersonSingleton(){}

    // Instanciando diretamente.
    public static PersonSingleton getInstanceUnique(){
        return uniqueInstance;
    }


}
