class Sorter():
    def __init__(self):
        return

    def run_insertion_sort(self, cardsToSort):
        '''
        Insertion sort works the way many people sort a hand of playing cards. We start with an empty
        left hand and the cards face down on the table. We then remove one card at a time from the
        table and insert it into the correct position in the left hand. To find the correct position
        for a card, we compare it with each of the cards already in the hand, from right to left.

        Input: a sequence of n numbers <a1, a2, ..., an>
        Output: a permutation (reorder <a1', a2',...,an'> of the input s.t. a1'<= a2'<=...<=an'

        sorted in-place:
        it rearranges the numbers within the array, with at most a constant number of them stored
        outside the array at any time. The input array contains the sorted output sequence when
        the insertion sort procedure is finished.

        c1 is a constant that does not depend on n
        RUNTIME: c1 n^2


        '''
        print(cardsToSort)
        numberOfCards = len(cardsToSort)

        for indexOfCardBeingInsertedIntoHand in xrange(1, numberOfCards):

            print("values in hand: ")
            i=0
            while i < indexOfCardBeingInsertedIntoHand:
                print(cardsToSort[i])
                i=i+1
            print("========================")
            print("original list: " + str(cardsToSort))

            print("index of card being inserted into hand: " + str(indexOfCardBeingInsertedIntoHand))

            valueOfCardBeingInsertedIntoHand = cardsToSort[indexOfCardBeingInsertedIntoHand]
            print("value of card being inserted into hand: " + str(valueOfCardBeingInsertedIntoHand))

            indexOfCardInSortedHand = indexOfCardBeingInsertedIntoHand - 1
            print("index of card in sorted hand: " + str(indexOfCardInSortedHand))

            print("card in sorted hand: " + str(cardsToSort[indexOfCardInSortedHand]))


            while indexOfCardInSortedHand >= 0 and cardsToSort[indexOfCardInSortedHand] > valueOfCardBeingInsertedIntoHand:
                cardsToSort[indexOfCardInSortedHand + 1] = cardsToSort[indexOfCardInSortedHand]

                indexOfCardInSortedHand = indexOfCardInSortedHand - 1

                cardsToSort[indexOfCardInSortedHand + 1] = valueOfCardBeingInsertedIntoHand

        '''
        ######## LESS VERBOSE EXAMPLES ############
        def insertionSort(alist):
           for index in range(1,len(alist)):

             currentvalue = alist[index]
             position = index

             while position>0 and alist[position-1]>currentvalue:
                 alist[position]=alist[position-1]
                 position = position-1

             alist[position]=currentvalue

        alist = [54,26,93,17,77,31,44,55,20]
        insertionSort(alist)
        print(alist)

        #-----------------------------------------------------------#
        def sort_numbers(s):
            for i in range(1, len(s)):
                val = s[i]
                j = i - 1
                while (j >= 0) and (s[j] > val):
                    s[j+1] = s[j]
                    j = j - 1
                s[j+1] = val

        def main():
            x = eval(input("Enter numbers to be sorted: "))
            x = list(x)
            sort_numbers(x)
            print(x)
        '''

    def run_merge_sort(self, cardsToSort):
        return



if __name__ == "__main__":
    cardsToSort=[5, 2, 8, 6, 4]
    S = Sorter()

    S.run_insertion_sort(cardsToSort)
    sortedList = cardsToSort
    print ("Sorted list: " + str(sortedList))

    S. run_merge_sort(cardsToSort)

