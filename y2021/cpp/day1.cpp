#include <fstream>
#include <iostream>
using namespace std;


int main()
{
    ifstream inputFile ("../inputs/day_1");
    int prev;
    int curr;
    int result;
    inputFile >> prev;

    while(!inputFile.eof()){
        inputFile >> curr;
        if (curr > prev){
            result++;
        }
        prev = curr;
    }
    cout << result <<endl;
}
