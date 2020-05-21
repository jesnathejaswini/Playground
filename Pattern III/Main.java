#include<iostream>
using namespace std;
int main()
{
  int i,j,num;
  std::cin>>num;
  for(i=1;i<=num;i++)
  {
    for(j=1;j<=i;j++)
    {
      std::cout<<i;
      if(j<i)
      {
        std::cout<<"*";
      }
    }
    std::cout<<endl;
  }
  for(i=num;i>=1;i--)
  {
    for(j=i;j>=1;j--)
    {
      std::cout<<i;
      if((j<=i)&&(j!=1))
        std::cout<<"*";
    }
    std::cout<<endl;
  }
}