#include <iostream>
int main() 
{
	// Type your code here
  int n,r=0;
  std::cin>>n;
  while(n!=0)
        {
          r=r*10;
          r = r + n%10;
          n = n/10;
  }
        std::cout<<r;
	return 0;
}