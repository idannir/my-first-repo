class Gen3 {
    public static void main(String args[]) {
		int min = Integer.parseInt(args[0]);
		int max = Integer.parseInt(args[1]);
		int a = (int)(Math.random() * ( max - min) + min );
		int b = (int)(Math.random() * ( max - min) + min );
		int c = (int)(Math.random() * ( max - min) + min );
        System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	    System.out.println("The minimal generated number was " + Math.min(Math.min(a, b), c));
    }
}