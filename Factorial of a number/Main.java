#include<iostream>
int main()
{
  int a;
  int fact=1;
  std::cin>>a;
  for(int i = 1 ; i <=a;i++)
    fact=fact*i;
  std::cout<<fact;	
}