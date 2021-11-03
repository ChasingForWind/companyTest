package com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

/**
 * @author: zhiyang
 * @description: 333
 * @create: 2021-10-26 20:58
 **/


public class PuttingIntoPractice{
    public static void main(String ...args){
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );


        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
        //
        List<Transaction> collect = transactions.stream()
                .filter(transaction -> transaction.getYear() >= 2011)
                .sorted(comparing(Transaction::getValue))
                .collect(toList());
        System.out.println("query1:" + collect);

        // Query 2: What are all the unique cities where the traders work

        List<String> collect2 = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .collect(toList());
        System.out.println("query2 :" + collect2);

        // Query 3: Find all traders from Cambridge and sort them by name.

        List<Trader> collect3 = transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .collect(toList());
        System.out.println("query3 :" + collect3);



        // Query 4: Return a string of all traders’ names sorted alphabetically.

        String collect4 = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (n1, n2) -> n1 + n2);
        System.out.println("query4 : " + collect4);


        // Query 5: Are there any trader based in Milan?

        boolean collect5 = transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println("query5 :" + collect5);


        // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Milan"))
                .forEach(trader -> trader.setCity("Cambridge"));
        System.out.println(transactions);



        // Query 7: What's the highest value in all the transactions?
        Integer max = transactions.stream()
                .map(Transaction::getValue)
                .reduce(0, Integer::max);
        System.out.println(max);


//        int highestValue =
//                transactions.stream()
//                        .map(Transaction::getValue)
//                        .reduce(0, Integer::max);
//        System.out.println(highestValue);

        // Query 8
        Optional<Transaction> min = transactions.stream().min((t1, t2) -> t1.getValue() < t2.getValue() ? -1 : 0);
        min.ifPresent(System.out::println);

    }
}


