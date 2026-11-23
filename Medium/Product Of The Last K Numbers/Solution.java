int currentSize = cumulativeProducts.size();
      
        if (currentSize <= k) {
            return 0;
        }
        return cumulativeProducts.get(currentSize - 1) / cumulativeProducts.get(currentSize - k - 
        1);
    }
}


        int lastProduct = cumulativeProducts.get(cumulativeProducts.size() - 1);
        cumulativeProducts.add(lastProduct * num);
    }

    public int getProduct(int k) {