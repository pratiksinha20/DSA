barSem.release();
        }
    }

    public void bar(Runnable printBar) throws 
    InterruptedException {
        for (int i = 0; i < n; i++) {
            barSem.acquire();

            printBar.run();

            fooSem.release();
        }
    }
}