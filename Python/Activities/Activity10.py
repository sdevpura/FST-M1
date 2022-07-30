myTuple = tuple(input("Enter your number in tuple: ").split(", "))
print("Numbers divisible by 5 in given tuple are: ")
for i in myTuple:
    result = int(i)%5
    if result==0:
        print(i)