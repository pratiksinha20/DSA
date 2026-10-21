for (char c : s.toCharArray()) {
            if (c == mn) cntMin++;
            if (c == mx) cntMax++;
        }

        if (s.charAt(0) == mx &&
            s.charAt(n - 1) == mn &&
            cntMax == 1 &&
            cntMin == 1) {
            return 3;
        }

        return 2;
    }
}