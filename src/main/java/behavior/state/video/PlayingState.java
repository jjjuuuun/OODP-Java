package behavior.state.video;

public class PlayingState implements State {
    @Override
    public void play(Video player) {
        System.out.println("Video is already playing.");
    }

    @Override
    public void stop(Video player) {
        System.out.println("Pausing the video.");
        player.setState(new PausedState());
    }
}