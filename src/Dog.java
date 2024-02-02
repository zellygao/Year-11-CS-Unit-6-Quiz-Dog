public class Dog {
    private int age;
    private String name;
    private String color;
    private Owner owner;

    public Dog (int age, String name, String color, Owner owner){
        this.age = age;
        this.name = name;
        this.color = color;
        this.owner = owner;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public Owner getOwner(){
        return owner;
    }

    public void setAge(int age){
        this.age = age;
    }
    public void setName (String name){
        this.name = name;
    }
    public void setColor (String color){
        this.color = color;
    }
    public void setOwner (Owner owner){
        this.owner = owner;
    }
    public int addOneAge(){
        return age++;
    }

    public int birthday(){
        return addOneAge();
    }

    public String toString(){
        return "The dog is named " + name + " and is " + age + " years old. This dog is "+ color + ".";
    }
}
