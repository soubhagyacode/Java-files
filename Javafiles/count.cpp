#include <iostream>
#include <string>
using namespace std;

main()
{
    string t="   Hello   count  my words ";int count=0;
    int s=t.length();
    cout<<s<<endl;
    for(int i=0;i<s;i++)
    {
        while(t[i]==' ' && i<s)
        {
            i++;
        }
        while(t[i]!=' ' && i<s)
        {
            i++;
        }
        count++;
    }
    cout<<count<<endl;
}