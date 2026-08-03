l=Math.max(l, hash[s.charAt(r)]+1);
            }
            hash[s.charAt(r)]=r;

            ans=Math.max(ans, r-l+1);
            r++;
        }
       return ans; 
    }
}