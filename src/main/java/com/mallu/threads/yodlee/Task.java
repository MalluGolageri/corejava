package com.mallu.threads.yodlee;

import java.io.File;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;

/**
 * Created by golagem on 11/19/17.
 */
public class Task implements Callable {
    private File path;

    private BlockingQueue queue;

    public Task(File path, BlockingQueue queue) {
        this.path = path;
    }

    @Override
    public String call() {


        return null;
    }
}
