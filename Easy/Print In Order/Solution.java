public void second(Runnable printSecond) throws 
    InterruptedException {
        firstDone.await();
        printSecond.run();
        secondDone.countDown();
    }

    public void third(Runnable printThird) throws 
    InterruptedException {
        secondDone.await();
        printThird.run();
    }
}