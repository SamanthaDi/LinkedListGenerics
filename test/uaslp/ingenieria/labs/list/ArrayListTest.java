package uaslp.ingenieria.labs.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayListTest {
    //biblioteca -> codigo ya hecho que podemos utilizar
    //Framework -> JUnit

    @Test
    public void whenArrayListIsCreated_thenSizeIsZero(){
        ArrayList<Integer> list = new ArrayList<>();

        //aserciones-> validar que la ejec fue correcta
        assertTrue(list.getSize() == 0);
    }
    @Test
    public void givenANewArray_WhenAddElement_thenSizeIsOne(){
        //inicializacion
        ArrayList<Integer> list = new ArrayList<>();

        //ejecucion
        list.add(1);

        //aserciones-> validar que la ejec fue correcta
        assertTrue(list.getSize()==1);

    }
}
