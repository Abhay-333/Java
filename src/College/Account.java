package College;
import java.util.*;
class Account
{
    int acno;
    String cname;
    double balance;
    Account(int acno,String cname,double balance)
    {
        this.acno=acno;
        this.cname=cname;
        this.balance=balance;
    }
    public double getBalance()
    {
        return balance;
    }
    static void sortAccount(Account[] a)
    {
        Account temp;
        for(int i=0;i<4;i++)
        {
            if(a[i].getBalance()>a[i+1].getBalance())
            {
                temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Account a[]=new Account[5];
        a[0]=new Account(101,"Sonali",35000);
        a[1]=new Account(202,"Arti",25000);
        a[2]=new Account(303,"Pratibha",45000);
        a[3]=new Account(404,"Mukta",80000);
        a[4]=new Account(505,"Amruta",60000);
        Account.sortAccount(a);
        for(int i=0;i<5;i++)
        {
            System.out.println("Account Number:"+a[i].acno);
            System.out.println("Enter Account Number:"+a[i].cname);
            System.out.println("Enter Account Number:"+a[i].balance);
        }
    }}
