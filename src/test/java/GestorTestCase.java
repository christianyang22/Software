import AlmacenProductos.Gestor;
import AlmacenProductos.Producto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class GestorTestCase {
    public Gestor gestor;

    @BeforeEach
    void setUp() {
        gestor = new Gestor();
    }

    @Test
    @DisplayName("Añadir producto should work")
    void testGestor() throws Exception{
        Producto producto = new Producto("leche", 0.79, 60);
        boolean resultado = gestor.añadirProducto(producto);
        assertTrue(resultado);
    }

    @Test
    @DisplayName("Añadir producto throw exception should work")
    void testExcepcionesProduct(){
        try{
            boolean resultado = gestor.añadirProducto(null);
            assertFalse(resultado);
            fail("Mi test no ha hecho lo esperado y por eso da fallo.");
        }catch (Exception e){
            System.err.println("El test ha funcionado correctamente al null (lo esperado)");
            assertTrue(true);
        }
    }

    @Test
    @DisplayName("Añadir producto throw exception should work")
    public void testAñadirProducto() throws Exception {
        Gestor gestor = new Gestor();
        Producto leche = new Producto("leche", 0.79, 60);
        boolean resultado = gestor.añadirProducto(leche);
        assertEquals(true, resultado);
        assertEquals(1, gestor.getAlmacen().size());
    }

    @Test
    @DisplayName("Añadir producto throw exception should work")
    public void testAñadirProducto2() throws Exception {
        Gestor gestor = new Gestor();
        Producto pizza = new Producto("pizza", 4.79, 100);
        Producto pizza2 = new Producto("pizza", 4.79, 100);
        boolean resultado = gestor.añadirProducto(pizza);
        boolean resultado2 = gestor.añadirProducto(pizza2);
        assertEquals(true, resultado);
        assertEquals(2, gestor.getAlmacen().size());
    }

    @Test
    @DisplayName("Añadir producto throw exception should work")
    public void testQuitarXProducto() throws Exception {
        Gestor gestor = new Gestor();
        Producto pizza = new Producto("pizza", 4.79, 100);
        Producto pizza2 = new Producto("pizza2", 4.79, 100);
        Producto pizza3 = new Producto("pizza3", 4.79, 100);

        gestor.añadirProducto(pizza);
        gestor.añadirProducto(pizza2);
        gestor.añadirProducto(pizza3);

        assertEquals(3, gestor.getAlmacen().size());

        gestor.quitarXProducto(pizza, 0);
        assertEquals(2, gestor.getAlmacen().size());
        gestor.quitarXProducto(pizza, 100);
        assertEquals(1, gestor.getAlmacen().size());
        //gestor.quitarXProducto(pizza, 100);
        //assertEquals(0, gestor.getAlmacen().size());

    }

    @Test
    @DisplayName("Añadir producto throw exception should work")
    public void testQuitarXProducto2() {
        Gestor gestor = new Gestor();

        Producto pizza = new Producto("pizza", 4.79, 100);
        boolean resultado = gestor.quitarXProducto(pizza, 100);
        assertEquals(0, gestor.getAlmacen().size());
        assertTrue(resultado);
    }

    @Test
    @DisplayName("Añadir almacen throw exception should work")
    public void testGetAlmacen() {
        ArrayList<Producto> productos = new ArrayList<Producto>();

        productos.add(new Producto("pizza", 4.79, 100));
        productos.add(new Producto("leche", 0.79, 60));
        productos.add(new Producto("dulce", 0.50, 300));

        assertEquals(3, productos.size());
        assertEquals("dulce", productos.get(2).getNombre());
        assertEquals(60, productos.get(1).getCantidad());
    }
}
