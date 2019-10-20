#include <bits/stdc++.h> 
using namespace std; 

int d, x, y;
void extendedEuclid(int A, int B) {
    if(B == 0) {
        d = A;
        x = 1;
        y = 0;
    }
    else {
        extendedEuclid(B, A%B);
        int temp = x;
        x = y;
        y = temp - (A/B)*y;
    }
}

int main() 
{ 
	int t,i,n,m,j;
	cin >> t;
	
	while(t--)
	{
	    cin >> n >> m;
	    
	   if(__gcd(n,m)!=1)
	    cout << -1 << endl;
	   else
	   {
	       extendedEuclid(m,n);
	       cout << x << endl;
	     //  cout << (x*m-1)/n << endl;
	   }
	   
	}
} 
