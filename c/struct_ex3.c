#include <stdio.h>
#include <stdbool.h>

struct CDDatabaseEntry
{
    char    artist[40];
    char    composer[40];
    char    albumName[40];
    int     trackCount;
    bool    isSampler;
};

int main()
{
    struct CDDatabaseEntry    myEntries[10];

    myEntries[0].isSampler = false;
    myEntries[1].trackCount = 12;

    printf("myEntries trackCount: %d\n", myEntries[1].trackCount);

    return 0;
}