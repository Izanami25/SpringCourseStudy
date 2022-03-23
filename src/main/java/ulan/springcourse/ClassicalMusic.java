package ulan.springcourse;

public class ClassicalMusic implements Music{
    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
    public void doMyInit(){
        System.out.println("Initialization");
    }
    public void doMyDestroy(){
        System.out.println("Exit");
    }
}
