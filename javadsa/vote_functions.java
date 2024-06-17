class vote_functions
{
    static void vote(int n){
        if(n>=18)
        System.out.println("Eligible for voting");
        else
        System.out.println("Not Eligible for voting");
    }
    public static void main(int n)
    {
        vote(n);
    }
}