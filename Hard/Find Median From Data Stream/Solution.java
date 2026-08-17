if (mx.size() == mn.size()) {
            // even count → average of two middle values
            return (mx.peek() + mn.peek()) / 2.0;
        } else {
            // odd count → top of max-heap
            return mx.peek();
        }
    }
}

/**
 * Usage:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double median = obj.findMedian();
 */