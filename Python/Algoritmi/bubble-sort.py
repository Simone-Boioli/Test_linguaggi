def bubble_sort(A):
    n=len(A)
    for i in range(n-1):
        for j in range(0,n-i-1):
            if A[j] > A[j+1]:
                A[j], A[j+1] = A[j+1], A[j]


#main
if __name__ == '__main__':
    list = [1, 3, 2, 4, 1, 10, 3, 25, 14, 18, 50, 9, 15]
    print("Prima del riordino:")
    print(list)
    bubble_sort(list)
    print("")
    print("Dopo il riordino:")
    print(list)