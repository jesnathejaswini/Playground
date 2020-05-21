#include<iostream>
int main()
{
int x,i,n=11;
std::cin>>x;
for(i=1;i<=x;i++)
{
  std::cout<<n*n<<" ";
  n=n+4;
}
}
