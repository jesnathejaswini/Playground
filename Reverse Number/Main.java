#include <iostream>
using namespace std;
int main()
{
    int n, reversedNumber = 0, remainder;
    std::cin >> n;
    while(n != 0)
    {
        remainder = n%10;
        reversedNumber = reversedNumber*10 + remainder;
        n /= 10;
    }
    std::cout<<reversedNumber;

    return 0;
}