#include <stdio.h>

int binarySearch(int arr[], int size, int element) {
    int low, mid, high;
    low = 0;
    high = size - 1; // initialization
    while (low <= high) {
        mid = low + (high - low) / 2; // Calculate mid inside the loop
        if (arr[mid] == element) {
            return mid;
        }
        if (arr[mid] < element) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    // Searching ends
    return -1;
}

int main() {
    int arr[100] = {1, 2, 3, 3, 4, 24, 33, 34, 332};
    int size = 9;
    int element = 332;
    int searchIndex = binarySearch(arr, size, element);
    printf("The element %d is found at index %d\n", element, searchIndex);
    return 0;
}
