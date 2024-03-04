package org.example;

import org.example.provider.NewGrodno;
import org.example.provider.Newspaper;
import org.example.provider.Yandex;
import org.example.subscriber.Subscriber;
import org.example.subscriber.YandexSub_1;
import org.example.subscriber.YandexSub_2;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Newspaper newspaper = new Yandex();
        Subscriber Yandex1 = new YandexSub_1("Anna");
        Subscriber Yandex2 = new YandexSub_2("Vasia");
        newspaper.subscription(Yandex1);
        newspaper.subscription(Yandex2);
        newspaper.notification("Пришла весна!!!!!");
        newspaper.unsubscribe(Yandex2);
        newspaper.notification("Скоро выходные.");
        Newspaper grodno = new NewGrodno();
        grodno.subscription(Yandex1);
        grodno.subscription(Yandex2);
        grodno.notification("Завтра будет солнечно.");
        newspaper.notification("Ушла весна.");
        

    }
}