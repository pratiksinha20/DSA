firstDone.countDown();
    }

    public void second(Runnable printSecond) throws 
    InterruptedException {
        firstDone.await();
    public void first(Runnable printFirst) {
        printFirst.run();
    public Foo() {}

    private CountDownLatch secondDone = new CountDownLatch(1);

    private CountDownLatch firstDone = new CountDownLatch(1);

class Foo {

import java.util.concurrent.CountDownLatch;