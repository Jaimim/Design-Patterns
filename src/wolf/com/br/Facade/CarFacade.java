/*
Essa classe mostra o padrão Facade em otimizar e acoplar
vários métodos que deveriam ser chamados para que o
carro pudesse ser ligado.
*/

package wolf.com.br.Facade;

/**
 * Created by wolf on 25/09/16.
 */
public class CarFacade {

    Car         car      = null;
    ColorCar    colorCar = null;
    CarSpeedMax carSpeedMax = null;


    public CarFacade(Car car,
                     ColorCar colorCar,
                     CarSpeedMax carSpeedMax ){

        this.car         = car;
        this.colorCar    = colorCar;
        this.carSpeedMax = carSpeedMax;

    }

    // Ligar o carro. Esta classe simplifica todos os métodos que iriam ser chamados,
    // para que o carro pudesse ser ligado. O método Facade tem esse objetivo.
    public void turnOnCar(){

        car.turnOn();
        colorCar.paintNewColor("Red");
        carSpeedMax.speedCarMax(100);

    }

}
