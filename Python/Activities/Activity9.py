list1 = list(input("Enter numbers in list1: ").split(", "))
list2 = list(input("Enter numbers in list2: ").split(", "))
oddList = []
evenList = []

for i in list1:
    result= int(i)%2
    if(result!=0):
        oddList.insert(0,i)   
#print(oddList)

for j in list2:
    result= int(j)%2
    if(result==0):
        evenList.insert(0,j)   
#print(evenList)

finalList = oddList+evenList
print("FinalList is: "+str(finalList))