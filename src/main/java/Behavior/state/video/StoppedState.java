package Behavior.state.video;

public class StoppedState implements State {
    @Override
    public void play(Video player) {
        System.out.println("Starting the video.");
        player.setState(new PlayingState());
    }

    @Override
    public void stop(Video player) {
        System.out.println("Video is already stopped.");
    }
}