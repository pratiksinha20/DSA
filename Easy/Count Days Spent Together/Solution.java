}

    public int countDaysTogether(String 
    arriveAlice, String leaveAlice,
                                 String 
                                 arriveBob, 
                                 String leaveBob) 
                                 {
        int start = Math.max(convert
        (arriveAlice), convert(arriveBob));
        int end = Math.min(convert(leaveAlice), 
        convert(leaveBob));

        return Math.max(0, end - start + 1);
    }
}