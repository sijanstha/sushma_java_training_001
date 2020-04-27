public class Mp3Player extends Player{

    public void play() {
        System.out.println("Mp3 Player is playing music");
    }

    public void pause() {
        System.out.println("Pausing in MP3 player");
    }

    @Override
    public void prev() {
        System.out.println("Prev in MP3 player");
    }

    @Override
    public void next() {
        System.out.println("Next in MP3 player");
    }
}
