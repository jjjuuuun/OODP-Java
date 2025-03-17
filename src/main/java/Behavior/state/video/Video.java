package Behavior.state.video;

public class Video {
    private State state;

    public Video() {
        // Set initial state Stopped
        this.state = new StoppedState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void play() {
        state.play(this);
    }

    public void stop() {
        state.stop(this);
    }
}