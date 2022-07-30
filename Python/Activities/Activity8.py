myList = list(input("Enter numbers").split(", "))
size = len(myList)
lastNum = int(myList[size-1])
if(int(myList[0])==lastNum):
    print("Numbers match")
else:
    print("Numbers doesn't match")