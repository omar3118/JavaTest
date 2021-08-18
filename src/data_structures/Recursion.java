
package data_structures;


public class Recursion {


int m=0; // for TH

public long fac(long n) // n for element
{
    
    if(n<=0 || n==1 )// Base Case
        return 1;
    else
        return n*fac(n-1);// SubProblem + Logic
    
}

public long fib(long n)// n for index
{

    if(n<=0 || n==1)// Base Case
        return n;
    else
        return fib(n-1)+fib(n-2);// SubProblem + Logic
   
}


int sum(int n , int n2)// sum from n to n2 (    ts(n/10);)
{
    if(n>n2)
        return -1;
    if(n==n2)
        return n;
    
    else
        return n2+sum(n, n2-1);
    
}
    
void stars(int n)// n = number of stars
{
    
    if(n<=0)return ;
    else
        
        for(int i=n; i>0;i--)
        {
            System.out.print("*");
        }
    
    System.out.println();
    stars(n-1);
}



void split(int n) // any num if he divide by 10 he is mod 0 or (.last number)
{
    if(n==0)
        return;
    else
            split(n/10);
        System.out.println(n%10);

}

int TowerofHanoi(int n , char from , char to , char aux)
{
    
    if(n==1)
    {
        System.out.println("Disk "+n+" From "+from+" To "+to); m++;  
        return m;// m for counting steps
    }
    
    TowerofHanoi(n-1, from, aux, to);
         System.out.println("Disk "+n+" From "+from+" To "+to);m++;   
    TowerofHanoi(n-1, aux, to, from);
    
return m;// m for counting steps
}

void DecimaltoBinary(int  n)
{
    if(n==0)return;
    
    int g=n%2;
    
   
     
   DecimaltoBinary(n/2);
    
    System.out.print(g);
   
   
}




}
