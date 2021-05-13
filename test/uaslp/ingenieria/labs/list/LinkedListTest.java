package uaslp.ingenieria.labs.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    @Test
    public void whenLinkedListIsCreated_thenlistCountIncrements()  {
        //inicializacion
        int count = LinkedList.getListsCount();
        //ejecucion creamos dos LinkedList
        new LinkedList<>();
        //validacion
        assertEquals(count+1,LinkedList.getListsCount());
    }

    @Test
    public void whenLinkedListIsCreated_thenSizeIsZero(){
        //inicializacion
        LinkedList<Integer> list = new LinkedList<>();
        //ejecucion
        int size = list.getSize();
        //validacion
        assertEquals(0,size);
    }

    @Test
    public void givenLinkedListWith3Elements_whenIterator_thenAllElementsAreAccesible(){
        //inicializacion
        LinkedList<Integer> list = new LinkedList<>();
        //ejecucion
        list.add(700);
        list.add(800);
        list.add(1000);
        Iterator<Integer> it = list.getIterator();
        //valid
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
        LinkedList<Integer> list = new LinkedList<>();
        //ejecucion
        list.add(500);
        list.add(600);
        list.add(700);

        Iterator<Integer> it = list.getReverseIterator();

        //valid
        assertTrue(it.hasNext());
        assertEquals(700, it.next());
        assertTrue(it.hasNext());
        assertEquals(600, it.next());
        assertTrue(it.hasNext());
        assertEquals(500, it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void givenAnExistenListWith2Elements_WhenInsertAElementInPositionAfter_thenElementIsInsertedInCorrectPositionAndSizeIncrements() throws MyArrayIndexOutOfBoundsException, MyIndexOutOfBoundsException {
        //inicializacion
        LinkedList<Integer> list = new LinkedList<>();

        //ejecucion
        list.add(500);
        list.add(600);
        Iterator<Integer> it = list.getIterator();
        list.insert(1000,Position.AFTER,it);

        //validacion
        assertEquals(3, list.getSize(), "deberia tener 3 elementos");
        assertEquals(500, it.next());
        assertTrue(it.hasNext());
        assertEquals(1000, it.next());
        assertTrue(it.hasNext());
        assertEquals(600, it.next());
        assertFalse(it.hasNext());
    }

    @Test
    public void givenANewList_WhenAddElement_thenSizeIsOne() throws MyArrayIndexOutOfBoundsException {
        //inicializacion
        LinkedList<Integer> list = new LinkedList<>();
        //ejecucion
        list.add(500);
        //validacion
        assertEquals(1, list.getSize());
        assertEquals(500, list.get(0));
    }

    @Test
    public void givenAnExistenListWithElement_WhenAddElement_thenSizeIsTwo() throws MyArrayIndexOutOfBoundsException {
        //inicializacion
        LinkedList<Integer> list = new LinkedList<>();
        //ejecucion
        list.add(500);
        list.add(100);

        //validacion
        assertEquals(2 , list.getSize(), "deberia tener dos elementos");

    }

    @Test
    public void givenAnExistenArrayWith4Elements_WhenDeleteElementMidle_thenSizeDecrements() throws MyIndexOutOfBoundsException, MyArrayIndexOutOfBoundsException {
        //inicializacion
        LinkedList<Integer> list = new LinkedList<>();
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
    public void givenAnExistenListWithOneElement_WhenDeleteElementHead_thenSizeDecrementsAndListIsEmpty() throws MyIndexOutOfBoundsException, MyArrayIndexOutOfBoundsException {
        //inicializacion
        LinkedList<Integer> list = new LinkedList<>();
        //ejecucion
        list.add(500);
        list.delete(0);
        //validacion
        assertEquals(0 , list.getSize(), "deberia tener tres elementos");
    }

    @Test
    public void givenAnExistenListWith3Element_WhenDeleteElementTail_thenSizeDecrements() throws MyIndexOutOfBoundsException, MyArrayIndexOutOfBoundsException {
        //inicializacion
        LinkedList<Integer> list = new LinkedList<>();
        //ejecucion
        list.add(500);
        list.add(600);
        list.add(700);
        int index = 2;
        list.delete(index);
        //validacion
        assertEquals(index , list.getSize());
        assertEquals(2 , list.getSize(), "deberia tener tres elementos");
        assertEquals(500, list.get(0));
        assertEquals(600, list.get(1));
    }

    @Test
    public void givenAnExistenArrayWith4Elements_WhenDeleteElementAtIndex5_thenMyIndexOutOfBoundExceptionIsThrown(){
        //inicializacion
        LinkedList<Integer> list = new LinkedList<>();

        //ejecucion
        list.add(500);
        list.add(600);
        list.add(700);
        list.add(800);
        //valid
        assertThrows(MyIndexOutOfBoundsException.class, () -> list.delete(5));
    }

    @Test
    public void givenAnExistentListWith3Elements_whenGetElementAtIndex4_thenArrayIndexOutOfBoundsExceptionIsThrown(){
        LinkedList<Integer> list = new LinkedList<>();

        list.add(500);
        list.add(600);
        list.add(700);

        assertThrows(MyArrayIndexOutOfBoundsException.class, ()->list.get(4));
    }

}
