import java.util.*; 
class matrix_rep
{
    public static void main(String[] args) {
Scanner s=new Scanner(System.in); 
System.out.println("enter number of rows of matrix:"); 
int r=s.nextInt(); 
System.out.println("enter number of columns of matrix:"); 
int c=s.nextInt();
int mat[][]=new int[r][c]; 
System.out.println("enter elements of matrix in horizontal form 0,0 then 0,1:"); 
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
mat[i][j]=s.nextInt();
}
}
System.out.println("matrix is:"); 
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
System.out.print(mat[i][j]); 
}
System.out.println();
}
}
}