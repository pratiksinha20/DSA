{
                l=Math.max(l, h[s[0]]+1);
            }
            h[s[0]]=r;

            if(hash[s[r]]!=-1)
            ans=max(ans, r-l+1);
            r++;
        }
        
    }
}