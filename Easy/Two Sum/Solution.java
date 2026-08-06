// #include<iostream>
// using namespace std;

int main()
{
int n;
cout<<"number of element is:";
cin>>n;
cout<<"enter your array";
int arr[n];
for(int i=0; i<n; i++)
{
    cin>>arr[i];
}
int target;
cout<<"target is:";
cin>>target;

for(int i=0; i<n; i++)
{
    for(int j=i+1;j<n & j!=i;j++)
    {
      if(arr[i]+arr[j]==target)
      {