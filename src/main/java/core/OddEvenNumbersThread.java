package core;

/**
 * Created by golagem on 10/4/17.
 */
    public class OddEvenNumbersThread {

        /**
         * devinline.com
         */
        static int counter = 1;
        static Object object = new Object();// Monitor
        static int max=10;
        public static void main(String[] args) {
            Thread tEven = new Thread(new EvenProducer());
            Thread tOdd = new Thread(new OddProducer());
            tEven.start();
            tOdd.start();
        }

        static class EvenProducer implements Runnable {
            public void run() {
                synchronized (object) {
                    while (true) {
                        if (counter % 2 == 0&& counter<=max) {
                            System.out.println(counter);
                            try {
                                Thread.sleep(500);
                            } catch (InterruptedException e) {

                            }
                            counter++;
                            object.notify();
                        } else {
                            try {
                                if(counter>max){
                                    Thread.currentThread().stop();
                                }
                                object.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }

        static class OddProducer implements Runnable {
            public void run() {
                synchronized (object) {
                    while (true) {
                        if (counter % 2 != 0 && counter<=max) {
                            System.out.println(counter);
                            counter++;
                            object.notify();
                        } else {
                            try {
                                if(counter>max){
                                    Thread.currentThread().stop();
                                }
                                object.wait();
                            } catch (InterruptedException e) {
                            }
                        }

                    }
                }
            }
        }



    }