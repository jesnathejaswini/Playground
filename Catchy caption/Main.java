#include <cstring>
#include <iostream>
int main()
{
   char arr[100];
  int s,count=0;
  std::cin.getline(arr,100);
  s=strlen(arr);
  for(int i=0;i<s;i++)
    if(arr[i]==' ')
      count++;
  if(count>10)
    std::cout<<"Caption not eligible for the contest";
  else
    std::cout<<"Caption eligible for the contest";
  
   
}