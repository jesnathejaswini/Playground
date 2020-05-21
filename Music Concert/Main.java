#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
int *p;
int n,count,m;
std::cin>>n;
p=(int *)malloc(2* sizeof(int));
for(int i=0;i<n;i++)
{
std::cin>> *(p + i);
if(*(p+i)%2!=0)
{
count++;
}
else if(*(p+i)%2==0)
m++;
}
std::cout<<count<<"\n"<<m;
return 0;
}
