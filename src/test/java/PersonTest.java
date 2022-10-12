import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void shouldAddChild() {
        //arrenge object instantiatie
        Person parent = new Person("Joop",  "Worstenmaker", 'M', 23);
        Person child = new Person("Frederique", "Worstenmaker", 'F', 28);
        Person child1 = new Person("Sjaak", "Worstenmaker", 'F', 28);

        List<Person> children = new ArrayList<>();
        children.add(child);
        children.add(child1);


        //act welke methodes test je
        parent.addChild(parent, child);

        //assert welke uitkomst verwacht je
        assertEquals("Joop", parent.getName());
        assertEquals("Frederique", parent.getChildren().get(0).getName());
        assertEquals("Worstenmaker", parent.getChildren().get(0).getLastName());
        assertEquals(1, parent.getChildren().size());

    }

    @Test
    void ShouldAddParents() {
        //arrenge object instantiatie
        Person vader = new Person("vader1", "piet", 'M', 99);
        Person mother = new Person("moeder1", "piet", 'F', 88);
        Person child = new Person("kind", "piet", 'M', 2);

        //act
        child.addParents(vader, mother, child);

        //assert
        assertEquals("vader1", child.getFather().getName());
        assertEquals("moeder1", child.getMother().getName());
        assertEquals("kind", child.getName());
        assertEquals(1, vader.getChildren().size());

    }


    @Test
    void shouldAddPet() {
        //arrange
        Pet pet = new Pet("henk", 2, "stinkhond");
        Person owner = new Person("johan", "braak", 'f', 33);
        List<Pet> pets = new ArrayList<Pet>();
        pets.add(pet);
        //act
        owner.addPet(pet, owner);
        //assert
        assertEquals("johan", owner.getName());
        assertEquals("henk", owner.getPets().get(0).getName());
        assertEquals(1, owner.getPets().size());

    }

    @Test
    void addSibling() {
        //arrange
        Person father = new Person("Frederique", "Worstenmaker", 'F', 28);
        Person sibling1 = new Person("Frederique", "Worstenmaker", 'F', 28);
        //act
        father.addSibling(sibling1);
        //assert
        assertEquals("Frederique", father.getSiblings().get(0).getName());;
        assertEquals(1, father.getSiblings().size());

    }

    @Test
    void shouldAddGrandChildren() {
        //arrange
        Person parent = new Person("Joop",  "Worstenmaker", 'M', 23);
        Person grandchild = new Person("Frederique", "Worstenmaker", 'F', 28);
        //act
        parent.addGrandChildren(grandchild);
        //assert
        assertEquals("Frederique", parent.getGrandChildren().get(0).getName());
        assertEquals(1, parent.getGrandChildren().size());


    }

}
