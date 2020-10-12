/**
 * Pet
 */
public class Pet {

    private String name;

    private int age;
    
    private String location;

    private String petType;

    public Pet(String name, int age, String location, String petType){
        this.name = name;
        this.age = age;
        this.location = location;
        this.petType = petType;
    }

    public Pet(){

    }

    public String getName(){
            return name;
    }

    public String getType(){
        return petType;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLocation(String location){
        this.location = location;
    }

    public void setAge(int age){
        this.age = age;
    }
}