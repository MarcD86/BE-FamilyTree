public class Pet {

    private String name;
    private int age;
    private String species;
    private Person owner;

    public Pet() {

    }

    public Pet(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

//    public Pet(String name, int age, String species, Person owner) {
//        this.name = name;
//        this.age = age;
//        this.species = species;
//        this.owner = owner;
//    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    public Person getOwner() {
        return owner;
    }

//----------------------------setters


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }


    public void addOwner(Pet pet, Person owner) {
        pet.setOwner(owner);
    }

}
