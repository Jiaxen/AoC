#include <iostream>
#include <fstream>
using namespace std;


int main()
{
    ifstream inputFile ("../inputs/day_2");
    int depth = 0;
    int horizontal = 0;
    string direction;
    string magnitude;
    while (inputFile >> direction >> magnitude){
        if (direction == "forward") {
            horizontal += stoi(magnitude);
        }
        if (direction == "up"){
            depth -= stoi(magnitude);
        }
        if (direction == "down"){
            depth += stoi(magnitude);
        }
    }
    cout << depth*horizontal << endl;
}