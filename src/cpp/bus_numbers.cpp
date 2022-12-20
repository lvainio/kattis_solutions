#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int main() {
    int n;
    cin >> n;

    int* bus_numbers = new int[n];
    for (int i = 0; i < n; i++) {
        cin >> bus_numbers[i];
    }
    sort(bus_numbers, bus_numbers + n);
    
    for (int i = 0; i < n; i++) {
        if (i >= n-2) { // one or two left
            cout << bus_numbers[i] << " ";

        } else if (bus_numbers[i] != bus_numbers[i+1] - 1) { // case 1 (out of bounds on i=n-1)
            cout << bus_numbers[i] << " ";
        
        } else if (bus_numbers[i+1] != bus_numbers[i+2] - 1) { // case 2 (out of bounds on i=n-2)
            cout << bus_numbers[i] << " ";

        } else { // case 3 (atleast 3 consecutive bus numbers)
            int last = i;
            for (int j = i; j < n-1; j++) {
                if (bus_numbers[j] != bus_numbers[j+1]-1) {
                    break;
                }
                last++;
            }
            cout << i << "-" << last << " ";
        }
    }
    return 0;
}