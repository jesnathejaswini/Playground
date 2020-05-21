#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p,r,n;
  std::cin>>p>>r>>n;
  float i = p*n*r/100;
  std::cout<<i;
  float net=p+i;
  std::cout<<"\n"<<net;
  float totali=i*2/100;
  std::cout<<"\n"<<totali;
  float last=net-totali;
  std::cout<<"\n"<<last;
}