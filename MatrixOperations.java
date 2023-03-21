package matrix;

public class MatrixOperations {
    private int matrix[][] = new int[2][2];
    
    public MatrixOperations(int matrix[][]) {
        this.matrix = matrix;
    }
    
    public MatrixOperations add() {
    	int sum[][] = new int[2][2];
    	
    	for(int i=0; i<2; i++)
    	{
    		for(int j=0; j<2; j++)
    		{
    			 sum[i][j] = matrix[i][j]*2;  
    		}
    	}
    	MatrixOperations summ = new MatrixOperations(sum);
    	return summ;
    }
    public MatrixOperations
    public void print(MatrixOperations matrix) {
    	for(int i=0; i<2; i++)
    	{
    		for(int j=0; j<2; j++)
    		{
    			 System.out.println(matrix.matrix[i][j]);   
    		}
    	}
    }
}
