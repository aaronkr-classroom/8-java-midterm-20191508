public class Main {

	public static void main(String[] args) {
		


		public class LibrarySystem {
	
	

	public void addBook(Book book) {
		
	}
	
	public void removeBook(String title) {
    	
		for ( int i = 0; i < bookCount; i++ ) {

      		
			if ( booklist[i].getTitle().equals(title)) {
				
                
				for ( int j = i; j < bookCount - 1; j++ ) {
					booklist[j] = booklist[j+1];
				}
        
				
				booklist[--bookCount] = null;
				System.out.println("Library '" + title + "' dlete.");
        
				return; 
			}
		}
		
		System.out.println("# error: '" + title + "' 못 찾았습니다!");
	}
	
	public void borrowBook(String title) {
        
				return; 
			
		System.out.println("# error: '" + title + "' 못 찾았습니다!");
	}
	
	public void returnBook(String title) {
	   
		System.out.println("# error: '" + title + "' 못 찾았습니다!");
	}
	
	public void displayAllBooks() {
		
    }

}

		LibrarySystem ls = new LibrarySystem();
		
		
		Book book1 = new LibraryBook
		Book book2 = new LibraryBook
		Book book3 = new LibraryBook
		Book book4 = new LibraryBook
		
		private Book[] booklist;
        private static int bookCount = 0;
        private static final int NUM_BOOK = 10;

		public LibrarySystem() 
		{
               this.booklist = new Book[NUM_BOOK];}

	    public void addBook(Book book) {
		}
	    public void removeBook(String title) {
		}
		public void returnBook(String title) {
		}
		public void displayBooks() {
		}
		
