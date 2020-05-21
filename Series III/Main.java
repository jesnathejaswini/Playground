#include<iostream>
int main()
{
  int n,a=6;
  std::cin>>n;
  for(int i =1; i<=n; i++)
  {
    std::cout<<a<<" ";
    a=a+(5*i);
  }
}