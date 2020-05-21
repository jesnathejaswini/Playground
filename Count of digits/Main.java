#include <iostream>
int main() {
    int n;
    int count = 0;
    std::cin>>n;
    do {
        n /= 10;     
        ++count;
       
    	}while (n != 0);
   std::cout<<count;
}
