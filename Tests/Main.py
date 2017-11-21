import SortingAll as sa
import RandomArray
import time

numberOfElements = 10000
array = RandomArray.get_array(numberOfElements)
n = int(input("Enter number n: "))

startT = time.time()*1000
a = sa.SortingAll.search(array, n)
stopT = time.time()*1000
sortedTime= stopT-startT
print("\n"+str(a))
print("\nSorting all array took: "+str(sortedTime))

startT = time.time()*1000
a = sa.SortingAll.search(array, n)
stopT = time.time()*1000
unsortedTime = stopT-startT
print("\n"+str(a))
print("\nSearching unsorted array took: "+str(unsortedTime))

if sortedTime < unsortedTime:
    print("\nSorting all array was faster by: "+str(unsortedTime-sortedTime))
else:
    print("\nSearching unsorted array was faster by: "+str(sortedTime-unsortedTime))

print("\nUsing "+str(numberOfElements)+" elements.")
