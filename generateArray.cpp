#pragma GCC optimize("O3")
#pragma GCC target("sse4")
#include <bits/stdc++.h>
typedef long long ll;
using namespace std;
#define MAX 1000005
#define M_p 3.1415926
#define mod 1000000007
#define pb push_back
#define mp make_pair 
#define fastio ios::sync_with_stdio(0);cin.tie(0);cout.tie(0);
#define test int t;cin>>t;while(t--)
#define forr(i,x,y) for(int i=x;i<y;i++)
#define all(vect) vect.begin(),vect.end()
#define ull unsigned long long
#define fout fflush(stdout); 
#define min3(x,y,z) min(min(x,y),z)
#define min4(x,y,z,w) min(min3(x,y,z),w)
#define endl "\n"
#define N 100005
#define inf 9e17
#define int long long 
//__builtin_popcount(b[0]);
//#define size 1000000
//	memset(a,0,sizeof(a));
//freopen("input.txt","r",stdin); 
//
//If constraints are tight use int instead of ll
std::mt19937_64 rng(std::chrono::steady_clock::now().time_since_epoch().count());
double get_random()
{
    return (double)rand()/RAND_MAX;
}
int32_t main() 
{   
    freopen("output.txt","w",stdout);
    int t = 50;
    while(t--)
    {
        int k = 50;
        int n = get_random()*k;
        double range = 100000;
        vector<int> v;
        for(int i = 0;i<n;i++)
        {   
            int x = get_random()*range;
            v.pb(x);
        }
        if(n>0)
        {
            cout<<"{ ";
            for(int i = 0;i<n-1;i++)
                cout<<v[i]<<", ";
            cout<<v[n-1]<<"};"<<endl;
            sort(all(v));
            cout<<"{ ";
            for(int i = 0;i<n-1;i++)
                cout<<v[i]<<", ";
            cout<<v[n-1]<<"};"<<endl;
            cout<<endl;
        }
    }
    return 0;
}