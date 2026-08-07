char[] c=temp.toCharArray();
            Arrays.sort(c);
            String st=new String(c);

            if(!mp.containsKey(st))
            {
                mp.put(st, new ArrayList<>());

            }
            mp.get(st).add(temp);
        }
        List<List<String>> ans=new ArrayList<>(mp.values());
        return ans;
    }
}