#include<iostream>
using namespace std;
int main()
{
  int d1,d2,c1,c2,s1,s2,first;
  std::cin>>d1>>c1>>d2>>c2;
  s1=d1+d2;
  s2=c1+c2;
  if(s2>99)
  {
    first = s2;
    while(first >= 10)
    {
        first = first / 10;
    }
    s1=s1+first;
    s2=s2-(first*100);
  }
  std::cout<<s1<<"\n"<<s2;
}