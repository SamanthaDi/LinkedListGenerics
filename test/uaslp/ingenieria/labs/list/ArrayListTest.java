package uaslp.ingenieria.labs.list;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayListTest {
    //biblioteca -> codigo ya hecho que podemos utilizar
    //Framework -> JUnit

    @Test
    public void whenArrayListIsCreated_thenSizeIsZero(){
        ArrayList<Integer> list = new ArrayList<>();

        //aserciones-> validar que la ejec fue correcta
        //assertTrue(list.getSize() == 0);

        assertThat(list.getSize()).isZero();
    }
    @Test
    public void givenANewArray_WhenAddElement_thenSizeIsOne(){
        //inicializacion
        ArrayList<Integer> list = new ArrayList<>();

        //ejecucion
        list.add(500);

        assertThat(list.getSize()).isEqualTo(1);
        assertThat(list.get(0)).isEqualTo(500);

    }

    @Test
    public void givenAnExistenArrayWithElement_WhenAddElement_thenSizeIsTwo(){
        //inicializacion
        ArrayList<Integer> list = new ArrayList<>();
        //ejecucion
        list.add(500);
        list.add(100);

        assertThat(list.getSize()).isEqualTo(2);
        assertThat(list.get(0)).isEqualTo(500);
        assertThat(list.get(1)).isEqualTo(100);
    }
}
