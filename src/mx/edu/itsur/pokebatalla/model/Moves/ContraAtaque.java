package mx.edu.itsur.pokebatalla.model.Moves;

/**
 *
 * @author Cristian Herrera Gonzalez
 */
public class ContraAtaque extends MovimientoFisico{
     public ContraAtaque ()
    {
        this.puntosPoder = 20;
        this.precision = 100;
        this.potencia = 0;
        this.tipo = TiposDeMovimiento.LUCHA;
    }
}

