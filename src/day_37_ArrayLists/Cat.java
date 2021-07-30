package day_37_ArrayLists;

public class Cat {

    public String name;
    public String breed;
    public int age;
    public String personality;
    public String inDoorOutdoor;
    public String color;
    public String gender;

    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }
    public void drink(String beverage) {
        System.out.println(name + " is drinking " + beverage);
    }
    public void meow(String volume){
        System.out.println(name + " is meowing " + volume);
    }
    public void play(String game){
        System.out.println(name + " is playing " + game);
    }

    public void setInfo (String catName, String catBreed, int catAge, String catPersonality, String catIndoorOutdoor,
                         String catColor, String catGender){
        name = catName;
        breed = catBreed;
        age = catAge;
        personality = catPersonality;
        inDoorOutdoor = catIndoorOutdoor;
        color = catColor;
        gender = catGender;
    }

    public void getInfo(){
        System.out.println("name = " + name);
        System.out.println("breed = " + breed);
        System.out.println("age = " + age);
        System.out.println("personality = " + personality);
        System.out.println("inDoorOutdoor = " + inDoorOutdoor);
        System.out.println("color = " + color);
        System.out.println("gender = " + gender);
    }


}
