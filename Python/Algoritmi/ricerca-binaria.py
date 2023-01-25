def binario(A,x):
    i=0
    f=len(A)-1
    trovato=False

    while(i<=f) and (not trovato):
        m=(i+f)//2
        if A[m] < x:
            i = m+1
        elif A[m] == x:
            trovato = True
        else:
            f = m-1
    if(trovato):
        return m
    else:
        return -1 


#main
if __name__ == '__main__':
    list = [1, 3, 8, 9, 10, 11, 13, 25, 34, 38, 50, 69, 75]
    val=50
    pos=binario(list,val)

    print("il valore si trova in posizione ")
    print(pos)