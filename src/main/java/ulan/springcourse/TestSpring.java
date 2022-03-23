package ulan.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        //Music music = context.getBean("musicBean", Music.class);
        //MusicPlayer musicPlayer = new MusicPlayer(music);
        /*MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        boolean comparison = firstMusicPlayer == secondMusicPlayer;
        System.out.println(comparison);*/

        ClassicalMusic classicalMusic = context.getBean("musicBean2", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());


        context.close();
    }
}
