package org.example.provider;

import org.example.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class NewGrodno extends AbstractNews {
    @Override
    public void notification(String news) {
        for (Subscriber subscriber : subscribers){
            subscriber.receivingNews(news + " от газеты Гродно");

        }

    }


}
