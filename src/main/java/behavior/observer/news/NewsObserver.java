package behavior.observer.news;

public class NewsObserver implements Observer{
    private String name;

    public NewsObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(this.name + " received news: " + news);
    }
}
