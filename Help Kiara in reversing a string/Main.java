#include <iostream>
#include<string.h>
using namespace std;
int main()
{
char str[100], rev[100],temp;     
int count = 0,j,i;    
    std::cin.getline(str,100);
    j = strlen(str) - 1;
    for (i = 0; i < j; i++,j--)
    {
        temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }       
std::cout<<str;
}