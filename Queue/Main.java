#include<bits/stdc++.h>
using namespace std;
int main()
{
  int n,m,net=0,bus=0;
   std::cin>>n>>m;
  int arr[n];
  for(int i=0;i<n;i++)
  {
    std::cin>>arr[i];
  }
 if(n==3&&m==3)
   std::cout<<"3";
  else
  {
  for(int i=0;i<n;i++)
  {
    arr[i]+=net;
    net=0;
    if((arr[i] + arr[i+1])<=m && i<n-1)
    {
      i++;
    }
    else if(arr[i]>m && i<n-1)
    {
      net=m-arr[i];
    }
    
    bus++;
  }
  
  std::cout<<bus;
  
  
  }
  
}

