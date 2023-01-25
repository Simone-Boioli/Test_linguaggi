def merge_sort(A):
    if len(A) > 1:
        mid = len(A) // 2 #trovo la metà dell'array
        L = A[:mid] #preno il primo sottoarray
        R = A[mid:] #prendo il secono sottoarray

        merge_sort(L)
        merge_sort(R)

        i = j = k = 0
        while i < len(L) and j < len(R):
            if L[i] < R[j]: #se i singoli elementi sono il primo < del secondo salvo nella posizione k i
                A[k] = L[i]
                i += 1
            else:  #se i singoli elementi sono il primo > del secondo salvo nella posizione k j
                A[k] = R[j]
                j +=1
            k += 1

        #controllo che tutti i valori sono i ordine
        while i < len(L):
            A[k] = L[i]
            i += 1
            k += 1
        while j < len(R):
            A[k] = R[j]
            j += 1
            k += 1

#main
if __name__ == '__main__':
    list = [1, 3, 2, 4, 1, 10, 3, 25, 14, 18, 50, 9, 15]
    print("Prima del riordino:")
    print(list)
    merge_sort(list)
    print("")
    print("Dopo il riordino:")
    print(list)