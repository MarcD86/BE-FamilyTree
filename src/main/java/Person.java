import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private String middleName;
    private String lastName;
    private char sex;
    private int age;

    //-------------------------objecten van de klassen
    private Person mother;
    private Person father;
    private List<Person> siblings = new ArrayList<>();
    private List<Person> children = new ArrayList<>();
    private List<Person> grandChildren = new ArrayList<>();

    private List<Pet> pets = new ArrayList<>();

    public Person() {
    }

    public Person(String name, String lastName, char sex, int age) {
        this.setName(name);  //werkt jouw if statement oid ten alle tijden in jouw constructor...
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public Person(String name, String middleName, String lastName, char sex, int age) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    //---------------------------------------------------------getters

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public List<Person> getChildren() {
        return children;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public List<Person> getGrandChildren() {
        return grandChildren;
    }



    //---------------------------------------------------------setters

    public void setName(String name) {
        // if statement mandetory
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    public void setSex(char sex) {

        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void setSiblings(List<Person> siblings) {
        this.siblings = siblings;
    }

    public void setChildren(List<Person> childeren) {
        this.children = childeren;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }




    public void addParents(Person father, Person mother, Person child) {
        child.setMother(mother);
        child.setFather(father);
        this.addChild(mother, child);
        this.addChild(father, child);
    }

    public void addChild(Person parent, Person child) {
        parent.getChildren().add(child);

    }

    public void addPet(Person owner, Pet pet) {
        List<Pet> pets = new ArrayList<>();
        if(owner.getPets() != null) {
        }
        pets.add(pet);
    }

    public void addSibling(Person sibling) {
        siblings.add(sibling);

    }

    public void addGrandChildren(Person grandChild) {
        grandChildren.add(grandChild);
    }


    public void addPet(Pet pet, Person owner) {
        owner.pets.add(pet);
    }


}
