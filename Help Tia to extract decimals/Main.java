#include<iostream>
#include<string>
int main() 
{
  std::string fnum;
  int i,size;
  std::cin>>fnum;
  size=fnum.length();
  for(i=0;i<size;i++)
    if(fnum[i]!='.')
      continue;
  else
    break;
  std::cout<<"Floating part is : ";
  i++;
  for(;i<size;i++)
    std::cout<<fnum[i];
  
}