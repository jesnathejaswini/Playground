#include<iostream>
#include<math.h>
using namespace std;
int main()
{
        int n;int q,r,p;
  		std::cin>>n;
        int N=n*n;
        int tn=n;
  		int c=0;
        while(tn!=0)
        {
            tn=tn/10;c++;
        }
        p=pow(10,c);
        q= N/p;
        r= N%p;
        if(q+r==n)
            std::cout<<"Kaprekar Number";
        else
           std::cout<<"Not a Kaprekar Number";
}