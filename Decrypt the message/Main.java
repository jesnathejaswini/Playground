#include <iostream>
using namespace std; 
int main(){
    int n,n1,n2,i=1,sum=0;
    std::cin >> n1;
	std::cin>>n2;	  
  	n=n1+n2;
       while(i<n){
       if(n%i==0)
       sum=sum+i;
       i++; 
}
 
if(sum==n)
    std::cout <<"They can read the message"; 
else
    std::cout << "They can't read the message";

return 0;
}