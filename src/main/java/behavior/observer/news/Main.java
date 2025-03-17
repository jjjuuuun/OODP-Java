package behavior.observer.news;

public class Main {
    public static void main(String[] args) {
        NewsSubject newsSubject = new NewsSubject();
        NewsObserver newsObserverChannel1 = new NewsObserver("Channel 1");
        NewsObserver newsObserverChannel2 = new NewsObserver("Channel 2");

        newsSubject.registerObserver(newsObserverChannel1);
        newsSubject.registerObserver(newsObserverChannel2);

        newsSubject.setNews(
                "Breaking news: Observer Pattern in action"
        );

        newsSubject.removeObserver(newsObserverChannel2);

        newsSubject.setNews(
                "Another update: Channel 2 unsubscribed"
        );
    }
}
