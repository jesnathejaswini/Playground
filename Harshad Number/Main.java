#include<iostream>
using namespace std;

int main()
{
   
int num;
int temp;
std::cin >> num;
int sum = 0;
temp = num;
while(temp)
{
sum += temp % 10;
temp = temp / 10;
}
int res = num % sum;
if(res == 0)
std::cout <<"Harshad Number";
else
std::cout <<"Not Harshad Number";
return 0;
}