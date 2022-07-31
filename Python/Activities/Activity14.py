def fnFibo(limit):
    i=0
    j=1
    temp=i+j
    print(temp)
    counter = 1
    while(counter<limit):
        print(temp)
        i=j
        j=temp
        temp=i+j
        counter=counter+1

inputNum = int(input("Enter Limit for Fibo: "))
fnFibo(inputNum)