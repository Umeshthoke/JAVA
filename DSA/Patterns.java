package DSA;

class Patterns{
	
	public static void rightangleTriangle(int n) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}
	public static void leftRightangle(int n) {
		
		for(int i=1;i<=n;i++) {
			
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void Square(int n) {
		
		    for(int i=1;i<=n;i++)
		    {
		    	for(int j=1;j<=n;j++) {
		    		
		    		System.out.print("*");
		    	}
		    	System.out.println();
		    }
	}
	
	public static void Rectangle(int row,int column) {
		
		
		for(int i=1;i<=row;i++) {
			
			for(int j=1;j<=column;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void Pyramid(int n) {
          for(int i=1;i<=n;i++) {
			
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
	} 
	public static void Diamond(int n) {
		for(int i=1;i<=n;i++) {
			
			for(int j=n;j>=i;j--) {
				
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
		 for(int i=n-1;i>=1;i--) {
		    	for(int j=n;j>=i;j--) {
		    		
		    		System.out.print(" ");
		    	}
		    	
		    	for(int j=1;j<=i;j++) {
		    		
		    		System.out.print("* ");
		    	}
		    	System.out.println();
		    	
		    }
			 
	}
	
	   
	
	public static void main(String []args) {
		int n=6;
		Diamond(n);
	}
}
	
	


