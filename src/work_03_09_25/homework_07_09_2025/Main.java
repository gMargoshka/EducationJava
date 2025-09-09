package work_03_09_25.homework_07_09_2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
//    Домашнее задание:
//    1) Создайте систему для представления игральных карт.
//    Подсказка: нужно будет 2 енума и 1 класс
    public static void main(String[] args) {


        List <Card> koloda = Arrays.asList(
                new Card(CardIndex.SIX,CardSuit.HEARTS),
                new Card(CardIndex.SEVEN,CardSuit.HEARTS),
                new Card(CardIndex.EIGHT,CardSuit.HEARTS),
                new Card(CardIndex.NINE,CardSuit.HEARTS),
                new Card(CardIndex.TEN,CardSuit.HEARTS),
                new Card(CardIndex.JACK,CardSuit.HEARTS),
                new Card(CardIndex.QUEEN,CardSuit.HEARTS),
                new Card(CardIndex.KING,CardSuit.HEARTS),
                new Card(CardIndex.ACE,CardSuit.HEARTS),

                new Card(CardIndex.SIX,CardSuit.CLUBS),
                new Card(CardIndex.SEVEN,CardSuit.CLUBS),
                new Card(CardIndex.EIGHT,CardSuit.CLUBS),
                new Card(CardIndex.NINE,CardSuit.CLUBS),
                new Card(CardIndex.TEN,CardSuit.CLUBS),
                new Card(CardIndex.JACK,CardSuit.CLUBS),
                new Card(CardIndex.QUEEN,CardSuit.CLUBS),
                new Card(CardIndex.KING,CardSuit.CLUBS),
                new Card(CardIndex.ACE,CardSuit.CLUBS)
        );

        System.out.println(koloda);

        for (Card card : koloda) {
            System.out.println(card);
        }


    }
}
