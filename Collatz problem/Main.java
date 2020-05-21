#include <iostream>

int main()
{
	int n,f,cnt=0;

	std::cin>>n;
    std::cout<<n<<"\n";
	while(n>1)
	{
	
	if(n%2==0)
		f=n/2;
	else
		f=3*n+1;

	n=f;
	std::cout<<n<<"\n";
	
	cnt++;
	}
	std::cout<<cnt;
	return 0;
}
