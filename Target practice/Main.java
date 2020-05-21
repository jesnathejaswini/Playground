#include<iostream>
using namespace std;
int main()
{
      int n,a,i=0,c=0,s=0;
    std::cin>>n;
    do
    {
        c++;
        std::cin>>a;
        s+=a;
        i++;
    }
    while(s<n);
    std::cout<<"The number of turns is "<<c;
}