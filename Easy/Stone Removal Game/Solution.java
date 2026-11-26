System.out.print("Enter number of stones: ");
        try {
            int n = sc.nextInt();

            String result = winner(n);
            if ("Invalid".equals(result)) {
                System.out.println("Invalid number of stones. Must be > 0.");
            } else {
                System.out.println("Winner: " + result);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
        } finally {
            sc.close();
        }
    }
}