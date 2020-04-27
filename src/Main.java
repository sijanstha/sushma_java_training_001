import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        System.out.println("Lodaing Normal Player");
        Player player = new Player();
        player.play();
        player.next();
        player.pause();
        player.prev();

        System.out.println("Lodaing MP3 Player");
        player = new Mp3Player();
        player.play();
        player.next();
        player.pause();
        player.prev();

        // advance form
        // user lai control dinu paryo
        // user have to choose which music player he/she
        // wants to paly
        // user should choose what to do
        // play -> pause

    }
}
