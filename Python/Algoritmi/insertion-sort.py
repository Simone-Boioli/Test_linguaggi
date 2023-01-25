def insertion_sort(A):
    for j in range(1,len(A)):
        key=A[j]
        i=j-1

        while i >=0 and A[i] > key:
            A[i+1] = A[i]
            i = i-1
        
        A[i+1]=key  #inserisco il valore nella sua posizione



#main
if __name__ == '__main__':
    list = [1, 3, 2, 4, 1, 10, 3, 25, 14, 18, 50, 9, 15]
    print("Prima del riordino:")
    print(list)
    insertion_sort(list)
    print("")
    print("Dopo il riordino:")
    print(list)