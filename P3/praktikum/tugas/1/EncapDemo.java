public class EncapDemo{
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        if(newAge >= 18 && newAge <= 30){
            age = newAge;
        }else{
            System.out.println("Nilai harus minimal 18 dan maksimal 30");
        }
    }
}