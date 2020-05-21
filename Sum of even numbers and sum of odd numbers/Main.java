#include<iostream>
using namespace std;
int main()
{
  int n,os=0,es=0,i;
  std::cin>>n;
  int a[n];
  for(i=0;i<n;i++)
  {
    std::cin>>a[i];
    if(a[i]%2==0)
      es=es+a[i];
    else
      os=os+a[i];
  }
  std::cout<<"The sum of the even numbers in the array is "<<es<<"\n";
  std::cout<<"The sum of the odd numbers in the array is "<<os;
}