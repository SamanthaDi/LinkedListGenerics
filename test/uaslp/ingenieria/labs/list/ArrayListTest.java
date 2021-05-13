package uaslp.ingenieria.labs.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayListTest {
    //biblioteca -> codigo ya hecho que podemos utilizar
    //Framework -> JUnit



    @Test
    public void whenArrayListIsCreated_thenSizeIsZero() throws MyArrayIndexOutOfBoundsException {
        ArrayList<Integer> list = new ArrayList<>();

        //aserciones-> validar que la ejec fue correcta
        //assertThat(list.getSize()).isZero();
        //ejecucion
        list.add(500);

        //validacion
        assertEquals(1, list.getSize());
        assertEquals(500, list.get(0));
    }
    @Test
    public void givenANewArray_WhenAddElement_thenSizeIsOne() throws MyArrayIndexOutOfBoundsException {
        //inicializacion
        ArrayList<Integer> list = new ArrayList<>();

        //ejecucion
        list.add(500);

        assertEquals(1, list.getSize());
        assertEquals(500, list.get(0));

        //assertThat(list.getSize()).isEqualTo(1);
        //assertThat(list.get(0)).isEqualTo(500);

    }

    @Test
    public void givenAnExistenArrayWithElement_WhenAddElement_thenSizeIsTwo() throws MyArrayIndexOutOfBoundsException {
        //inicializacion
        ArrayList<Integer> list = new ArrayList<>();
        //ejecucion
        list.add(500);
        list.add(100);

        //validacion
        assertEquals(2 , list.getSize(), "deberia tener dos elementos");
        assertEquals(500, list.get(0));
        assertEquals(100, list.get(1));
    }

    @Test
    public void givenAnExistenArrayWithNoCapacity_WhenAddElement_thenSizeAndCapacityIncrements() throws MyArrayIndexOutOfBoundsException {
        //inicializacion
        ArrayList<Integer> list = new ArrayList<>();
        //ejecucion
        list.add(500);
        list.add(600);
        list.add(700);
        list.add(800);

        list.add(1000);

        //validacion
        assertEquals(5 , list.getSize(), "deberia tener cinco elementos");
        assertEquals(500, list.get(0));
        assertEquals(600, list.get(1));
        assertEquals(700, list.get(2));
        assertEquals(800, list.get(3));
        assertEquals(1000, list.get(4));
    }

    @Test
    public void givenArrayListWith5Elements_whenIterator_thenAllElementsAreAccesible(){
        //inicializacion
        ArrayList<Integer> list = new ArrayList<>();
        //ejecucion
        list.add(500);
        list.add(600);
        list.add(700);
        list.add(800);
        list.add(1000);

        Iterator<Integer> it = list.getIterator();

        //valid
        assertTrue(it.hasNext());
        assertEquals(500, it.next());
        assertTrue(it.hasNext());
        assertEquals(600, it.next());
        assertTrue(it.hasNext());
        assertEquals(700, it.next());
        assertTrue(it.hasNext());
        assertEquals(800, it.next());
        assertTrue(it.hasNext());
        assertEquals(1000, it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void givenArrayListWith5Elements_whenReverseIterator_thenAllElementsAreAccesible(){
        //inicializacion
        ArrayList<Integer> list = new ArrayList<>();
        //ejecucion
        list.add(500);
        list.add(600);
        list.add(700);
        list.add(800);
        list.add(1000);

        Iterator<Integer> it = list.getReverseIterator();

        //valid
        assertTrue(it.hasNext());
        assertEquals(1000, it.next());
        assertTrue(it.hasNext());
        assertEquals(800, it.next());
        assertTrue(it.hasNext());
        assertEquals(700, it.next());
        assertTrue(it.hasNext());
        assertEquals(600, it.next());
        assertTrue(it.hasNext());
        assertEquals(500, it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void givenAnExistenArrayWith4Elements_WhenDeleteElementHead_thenSizeDecrements() throws MyIndexOutOfBoundsException, MyArrayIndexOutOfBoundsException {
        //inicializacion
        ArrayList<Integer> list = new ArrayList<>();
        //ejecucion
        list.add(500);
        list.add(600);
        list.add(700);
        list.add(800);

        list.delete(0);

        //validacion
        assertEquals(3 , list.getSize(), "deberia tener tres elementos");
        assertEquals(600, list.get(0));
        assertEquals(700, list.get(1));
        assertEquals(800, list.get(2));
    }
    @Test
    public void givenAnExistenArrayWith4Elements_WhenDeleteElementMiddle_thenSizeDecrements() throws MyIndexOutOfBoundsException, MyArrayIndexOutOfBoundsException {
        //inicializacion
        ArrayList<Integer> list = new ArrayList<>();
        //ejecucion
        list.add(500);
        list.add(600);
        list.add(700);
        list.add(800);

        list.delete(1);

        //validacion
        assertEquals(3 , list.getSize(), "deberia tener tres elementos");
        assertEquals(500, list.get(0));
        assertEquals(700, list.get(1));
        assertEquals(800, list.get(2));
    }

    @Test
    public void givenAnExistenArrayWith4Elements_WhenDeleteElementTail_thenSizeDecrements() throws MyIndexOutOfBoundsException, MyArrayIndexOutOfBoundsException {
        //inicializacion
        ArrayList<Integer> list = new ArrayList<>();
        //ejecucion
        list.add(500);
        list.add(600);
        list.add(700);
        list.add(800);

        list.delete(3);

        //validacion
        assertEquals(3 , list.getSize(), "deberia tener tres elementos");
        assertEquals(500, list.get(0));
        assertEquals(600, list.get(1));
        assertEquals(700, list.get(2));
    }

    @Test
    public void givenAnExistenArrayWith4Elements_WhenDeleteElementAtIndex5_thenMyIndexOutOfBoundExceptionIsThrown(){
        //inicializacion
        ArrayList<Integer> list = new ArrayList<>();

        //ejecucion
        list.add(500);
        list.add(600);
        list.add(700);
        list.add(800);

        //list.delete(5);

        //validacion
        assertThrows(MyIndexOutOfBoundsException.class, () -> list.delete(5));
       //lambda
        // clases anonimas
        //Interfaces funcionales -> solo un metodo
    }

    @Test
    public void givenAnExistenArrayWith4Elements_WhenGetElementElementMiddle_thenElementActualIsEqualsToExpected() throws MyArrayIndexOutOfBoundsException {
        //inicializacion
        ArrayList<Integer> list = new ArrayList<>();

        //ejecucion
        list.add(500);
        list.add(600);
        list.add(700);
        list.add(800);

        //validacion
        assertEquals(600, list.get(1));

    }

    @Test
    public void givenAnExistenArrayWith4Elements_WhenGetElementAtIndex5_thenArrayIndexOutOfBoundsException(){
        //inicializacion
        ArrayList<Integer> list = new ArrayList<>();

        //ejecucion
        list.add(500);
        list.add(600);
        list.add(700);
        list.add(800);

        //validacion
        assertThrows(MyArrayIndexOutOfBoundsException.class, () -> list.get(5));

    }
    @Test
    public void givenAnExistenArrayWith2Elements_WhenInsertAElement_thenZise() throws MyArrayIndexOutOfBoundsException {
        //inicializacion
        //este metodo no esta implementado en ArrayList pero si en linkedList
        ArrayList<Integer> list = new ArrayList<>();

        //ejecucion
        list.add(500);
        list.add(600);

        Iterator<Integer> it = list.getReverseIterator();
        list.insert(1000,Position.AFTER,it);

        //validacion
        assertEquals(2 , list.getSize(), "deberia tener dos elementos");
        assertEquals(500, list.get(0));
        assertEquals(600, list.get(1));

    }


    /*@Test
    public void givenAnExistenArrayWith4Elements_WhenDeleteElementAtIndex5_thenIndexOutOfBoundExceptionIsThrown(){
        //inicializacion
        ArrayList<Integer> list = new ArrayList<>();

        //ejecucion
        list.add(500);
        list.add(600);
        list.add(700);
        list.add(800);

        //validacion
        Assertions.assertThrows(IndexOutOfBoundsException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                list.delete(5);
            }
        });
        // clases anonimas
        //Interfaces funcionales -> solo un metodo
    }*/

    //TDD test driven development -> Desarrollo basado en pruebas
}
