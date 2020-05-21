#include<iostream>
using namespace std;
int main()
{
  int i,n;
  std::cin>>n;
  for(i=1;i<=n;i++)
  {
		if(i%2==0)
        {
          cout<<(i*i)-2<<" ";
        }
    	else
        {
           cout<<(i*i)-1<<" ";
        }
  }
}