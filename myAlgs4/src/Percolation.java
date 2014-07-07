public class Percolation {
    private int size;
    private boolean[] isOpenedArray;
    
    
    public Percolation(int N){              // create N-by-N grid, with all sites blocked
        this.size = N; 
        isOpenedArray = new boolean[N]; 
    }
    
   public void open(int i, int j){         // open site (row i, column j) if it is not already
	   //TODO
   }
   public boolean isOpen(int i, int j){    // is site (row i, column j) open?
	   //TODO
	   return false;
   }
   public boolean isFull(int i, int j){    // is site (row i, column j) full?
	   //TODO
	   return false;
   }
   public boolean percolates() {           // does the system percolate?
	   //TODO
	   return false;
   }
   
   private int xtTo1D(int x, int y){
	   //TODO
	   return -1;
   }
}