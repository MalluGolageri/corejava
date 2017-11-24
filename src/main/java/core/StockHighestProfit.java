package core;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by golagem on 11/23/17.
 */
public class StockHighestProfit {

    public static void main(String[] args) {

        //int[] a = {2, 5, 4, 6, 7, 3, 6, 2, 9, 7};
        int[] a = {1, 3, 2, 8, 4, 9};
        System.out.println(maxProfit(a));

    }

    public static int maxProfit(int[] prices) {

        ArrayList list=new ArrayList<>();
        System.out.println(list instanceof Comparable);
        int sell = 0, prev_sell = 0, buy = Integer.MIN_VALUE, prev_buy;
        for (int price : prices) {
            prev_buy = buy;
            buy = Math.max(prev_sell - price, prev_buy);
            System.out.println("buy:" + buy);
            prev_sell = sell;
            sell = Math.max(prev_buy + price, prev_sell);
            if(prev_sell!=sell){
                sell=sell-2;
            }

            System.out.println("sell:" + sell);
        }
        return sell;
    }
}
