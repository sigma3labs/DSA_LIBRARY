//Standard Header Files
#include<bits/stdc++.h>
using namespace std;
using lli = long long;

#define IOS ios_base::sync_with_stdio(0);cin.tie(0);cout.tie(0);
#define endl "\n"
#define all(a) (a).begin(), (a).end()

const lli mod = 1e9+7;

int binary_search_less_equal(vector<int> &vec,int n,int x){
    int st = 0;
    int en = n-1;

    while(st <= en){
        int mid = st + (en-st)/2;
        if(vec[mid] < x){
            st = mid+1;
        }else en = mid-1;
    }

    return st;
}

int binary_search_greater(vector<int> &vec, int n, int x){
    int st = 0;
    int en = n-1;

    while(st <= en){
        int mid = st + (en-st)/2;
        if(vec[mid] <= x){
            st = mid+1;
        }else en = mid-1;
    }

    return st;
}

void solve()
{
    int n,x;
    cin>>n>>x;

    vector<int> vec(n,0);

    for(auto &it:vec){
        cin>>it;
    }

    cout<<vec[binary_search_greater(vec,n,x)]<<endl;
    cout<<vec[binary_search_less_equal(vec,n,x)]<<endl;
}

signed main(){
    IOS
    solve();
    return 0;
}