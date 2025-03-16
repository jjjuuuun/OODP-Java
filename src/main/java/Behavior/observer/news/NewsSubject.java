package Behavior.observer.news;

import java.util.ArrayList;
import java.util.List;

public class NewsSubject implements Subject{
    private List<Observer> observerList = new ArrayList<>();
    private String news;

    @Override
    public void registerObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: this.observerList){
            observer.update(this.news);
        }
    }

    public void setNews(String news){
        this.news = news;
        this.notifyObservers();
    }
}
