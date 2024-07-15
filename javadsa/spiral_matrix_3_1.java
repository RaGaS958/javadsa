import java .util.*;
class spiral_matrix_3_1
{
    static boolean is_within_bound(int i,int j,int r,int c)
    {
        return ((i>=0) && (i<r) && (j>=0) && (j<c));
    }   
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:-");
        int r=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Enter the starting rows and columns:-");
        int ri=sc.nextInt();
        int ci=sc.nextInt();
        int [][] check=new int [r*c][2];
        int element_count=1;
        int current_i=ri;
        int current_j=ci;
        for(int var1=0;var1<(r*c);)
        {
            for(int count =1;count<=element_count;current_j++,count++)
            {
            if(is_within_bound(current_i,current_j,r,c))
            {
             check[var1][0]=current_i;
             check[var1++][1]=current_j;
            }
        }
            for(int count=1;count<=element_count;current_i++,count++)
            {
             if(is_within_bound(current_i,current_j,r,c))
            {
            check[var1][0]=current_i;
            check[var1++][1]=current_j;
            }
        }
            element_count++;
            for(int count=1;count<=element_count;current_j--,count++)
            {
             if(is_within_bound(current_i,current_j,r,c))
            {
            check[var1][0]=current_i;
            check[var1++][1]=current_j;
            }
        }
            for(int count=1;count<=element_count;current_i--,count++)
            {
             if(is_within_bound(current_i,current_j,r,c))
            {
            check[var1][0]=current_i;
            check[var1++][1]=current_j;
            }
        }
            element_count++;
        }
         for(int i=0;i<(r*c);i++)
         {
             System.out.print("[");
             System.out.print(check[i][0]+",");
             System.out.print(check[i][1]+"] ");
            }
            System.out.println();
         int [][] a=new int[r][c];
        int var=1;
        for(int i=0;i<(r*c);i++)
        a[check[i][0]][check[i][1]]=var++;
        System.out.println("Spiral Matrix:-");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
    }
}