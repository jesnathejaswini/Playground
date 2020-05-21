#include<iostream>
using namespace std;

int main()
{
 
    int num;
    std::cin >> num;
    int total = num * (num-1) / 2; 
    std::cout << total;
    return 0;
}