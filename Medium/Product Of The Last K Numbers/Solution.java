// in the last k numbers, so return 0
        if (currentSize <= k) {
            return 0;
        }
      
        // Calculate product of last k elements by dividing the cumulative product at the end
        // by the cumulative product just before the k elements
        return cumulativeProducts.get(currentSize - 1) / cumulativeProducts.get(currentSize - k - 
        1);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */