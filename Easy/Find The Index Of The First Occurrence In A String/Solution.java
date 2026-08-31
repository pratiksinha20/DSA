if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }

            if (j == needle.length()) {
                return i - j; 
            } else if (i < haystack.length() && haystack.charAt
            (i) != needle.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1]; 
                } else {
                    i++;
                }
            }
        }

        return -1; 
    }
}