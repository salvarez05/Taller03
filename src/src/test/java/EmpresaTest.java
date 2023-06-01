import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void agregarBus() {
        Empresa empresaPrueba=new Empresa("14-k","aa","@s");
        empresaPrueba.agregarBus("ad","turbus","324");
        assertEquals(1,empresaPrueba.getBuses().size());
    }

    @Test
    void agregarConductor() {
        Empresa empresaPrueba=new Empresa("14-k","aa","@s");
        empresaPrueba.agregarConductor("s","a",53, Conductor.Tipo.A3);
        assertEquals(1,empresaPrueba.getConductores().size());
    }

    @Test
    void descontinuarBus() {
        Empresa empresaPrueba=new Empresa("14-k","aa","@s");
        empresaPrueba.agregarBus("ad","turbus","324");
        assertEquals(1,empresaPrueba.getBuses().size());
        empresaPrueba.descontinuarBus("ad");
        assertEquals(1,empresaPrueba.getBuses().size());
    }

    @Test
    void cantidadBuses() {
        Empresa empresaPrueba=new Empresa("14-k","aa","@s");
        empresaPrueba.agregarBus("ad","turbus","324");
        assertEquals(1,empresaPrueba.cantidadBuses());
    }

    @Test
    void viajesACiudad() {
    }

    @Test
    void asociarConductorABus() {
        Empresa empresaPrueba=new Empresa("14-k","aa","@s");
        empresaPrueba.agregarBus("ad","turbus","324");
        empresaPrueba.agregarConductor("s","a",53, Conductor.Tipo.A3);
        empresaPrueba.asociarConductorABus("ad",empresaPrueba.getConductores().get(0),"s");
        assertTrue(empresaPrueba.getBuses().get(0).getConductor()==empresaPrueba.getConductores().get(0));
        assertTrue(empresaPrueba.getConductores().get(0).getBus()==empresaPrueba.getBuses().get(0));
    }
}