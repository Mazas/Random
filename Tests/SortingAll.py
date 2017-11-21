
class SortingAll:
    def search(array, n):
        array.sort(reverse=True)
        return array[n-1]

    def searchUnsorted(array, n):
        temp = []
        for i in range(0, n-1):
            temp.append(array[i])
        temp.sort()
        for i in range(n-1, len(array)-1):
            if temp[0] > array[i]:
                continue
            else:
                temp[0] = array[i]
                temp.sort()
        return temp[n-1]