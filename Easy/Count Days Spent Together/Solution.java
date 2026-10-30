public int countDaysTogether(String arriveAlice, String leaveAlice,
                                 String arriveBob, String leaveBob) {

        int aliceStart = getDay(arriveAlice);
        int aliceEnd = getDay(leaveAlice);

        int bobStart = getDay(arriveBob);
        int bobEnd = getDay(leaveBob);

        int start = Math.max(aliceStart, bobStart);
        int end = Math.min(aliceEnd, bobEnd);

        return Math.max(0, end - start + 1);
    }
}