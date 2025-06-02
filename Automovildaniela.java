package com.mycompany.automovildaniela;

import com.mycompany.automovildaniela.Automovil1.Automovil1;
import com.mycompany.automovildaniela.clase.Enum.TipoAutomovil;
import com.mycompany.automovildaniela.clase.Enum.TipoColor;
import com.mycompany.automovildaniela.clase.Enum.TipoCombustible;

/**
 *
 * @author PC01
 */
public class Automovildaniela {

    public static void main(String[] args) {
        Automovil1 auto = new Automovil1("Masda", 23, "ktm", TipoCombustible.GASOLINA, TipoAutomovil.COMPACTO, 4, 5, 20, TipoColor.AZUL, 40);
        auto.setVelocidadActual(100);
        auto.mostrarAtributos();
        auto.tiempoEstimado();
        auto.acelerar(20);

        auto.desacelerar(50);

        auto.frenar();
    }
}
