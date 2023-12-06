package hello.helloSpring.study;

public class ProfilePrint {
    byte age;
    String name;
    boolean isMarried;

    public static void main(String [] args){
        ProfilePrint profilePrint = new ProfilePrint();

        byte age=20;
        String name="Min";
        boolean isMarried=true;


        profilePrint.setAge(age);
        profilePrint.setName(name);
        profilePrint.setMarried(isMarried);

    }

    public void setAge(byte age){

    }

    public byte getAge(){
        return age;
    }

    public void setName(String name){

    }

    public String getName(){
        return name;
    }

    public void setMarried(boolean flag){

    }

    public boolean isMarried(){
        return isMarried;
    }


}
