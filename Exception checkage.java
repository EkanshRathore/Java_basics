class checkage 
{
    public static void main(String[] args)throws AgeException() 
    {
        int age=Integer.parseint(args[0]);
        if(age<18)
        {
            throw new AgeException();
        }
        
    }
}