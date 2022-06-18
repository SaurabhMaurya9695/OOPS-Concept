#include <bits/stdc++.h>
using namespace std;

void merge(vector<int> ans , int start , int  mid , int end)
{
    int sa = mid - start + 1 ;
    int sb = end  - mid;

    int arr[sa] , arr[sb] , 


}

void msort(vector<int> arr , int start , int end)
{
    if(end >= start) return;
    int mid = start + ( end - start) / 2 ;
    msort(arr , start , mid);
    msort(arr , mid + 1 , end);
    merge(arr , end , mid , start);
}
int main()
{
    vector<int> arr ={ 42 , 45 , 10 , 20 , 46 , 75 , 30 } ;
    msort(arr ,  0 , arr.size() - 1) ;
return 0 ;
}