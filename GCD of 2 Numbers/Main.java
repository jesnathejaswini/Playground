#include<iostream>
using namespace std;
int gcd(int u, int v)
{
    return (v != 0) ? gcd(v, u % v) : u;
}
 
int main(void)
{
    int num1, num2, result;
    cin >> num1 >> num2;
    result = gcd(num1, num2);
    if (gcd)
        cout << "G.C.D of " << num1 << " and " << num2 << " = " << result
                << endl;
    else
        cout << "\nInvalid input!!!\n";
    return 0;
}