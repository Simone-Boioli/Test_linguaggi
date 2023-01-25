def selection_sort(A):
    for i in range(0,len(A)-1):
        min=i
        for j in range(i+1, len(A)):
            if A[min] > A[j]:
                min=j
            A[i], A[min] = A[min], A[i] ##si scambiano i valori

#main
if __name__ == '__main__':
    list = [1, 3, 2, 4, 1, 10, 3, 25, 14, 18, 50, 9, 15]
    print("Prima del riordino:")
    print(list)
    selection_sort(list)
    print("")
    print("Dopo il riordino:")
    print(list)