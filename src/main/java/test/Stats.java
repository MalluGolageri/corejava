package test;

import java.util.*;
import java.util.concurrent.*;

public class Stats {
    public static class StatisticsAggregatorImpl implements StatisticsAggregator {

        Map<String, StockDetails> stats = new HashMap<>();

        int tickCount = 0;
        @Override
        public void putNewPrice(String symbol, double price) {
            StockDetails d = stats.get(symbol);
            if (d == null) {
                StockDetails stockDetails = new StockDetails();
                stockDetails.setPrice(price);
                stockDetails.setTickCount(1);
                stats.put(symbol, stockDetails);
            } else {
                StockDetails stockDetails = stats.get(symbol);
                stockDetails.setTickCount(stockDetails.getTickCount()+1);
                double stockValue = stockDetails.getPrice();
                stockDetails.setPrice(stockValue + price);
                stats.put(symbol, stockDetails);
            }

        }

        @Override
        public double getAveragePrice(String symbol) {
            StockDetails stockDetails = stats.get(symbol);
            if (stockDetails != null) {
                double price = stockDetails.getPrice();
                return price / stockDetails.getTickCount();
            }
            return 0;
        }

        @Override
        public int getTickCount(String symbol) {
            StockDetails stockDetails = stats.get(symbol);
            if (stockDetails != null) {
                return stockDetails.getTickCount();
            }
            return 0;
        }
    }

    ////////////////// DO NOT MODIFY BELOW THIS LINE ///////////////////

    public interface StatisticsAggregator {
        // This is an input. Make note of this price.
        public void putNewPrice(String symbol, double price);

        // Get the average price
        public double getAveragePrice(String symbol);

        // Get the total number of prices recorded
        public int getTickCount(String symbol);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            final StatisticsAggregator stats = new StatisticsAggregatorImpl();
            final Set<String> symbols = new TreeSet<>();

            String line = scanner.nextLine();
            String[] inputs = line.split(",");
            int threads = Integer.parseInt(inputs[0]);
            ExecutorService pool = Executors.newFixedThreadPool(threads);
            for (int i = 1; i < inputs.length; ++i) {
                String[] tokens = inputs[i].split(" ");
                final String symbol = tokens[0];
                symbols.add(symbol);
                final double price = Double.parseDouble(tokens[1]);
                pool.submit(new Runnable() {
                    @Override
                    public void run() {
                        stats.putNewPrice(symbol, price);
                    }
                });

            }
            pool.shutdown();
            try {
                pool.awaitTermination(5000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for (String symbol : symbols) {
                System.out.println(String.format("%s %.4f %d", symbol,
                        stats.getAveragePrice(symbol),
                        stats.getTickCount(symbol)));
            }
        }
        scanner.close();

    }
}

class StockDetails {
    private int tickCount;
    private double price;


    public int getTickCount() {
        return tickCount;
    }

    public void setTickCount(int tickCount) {
        this.tickCount = tickCount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}