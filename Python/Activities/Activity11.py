dictFruit = {
    "apple" : 10,
    "banana" : 20,
    "grapes" : 30
}

checkFruit = input("Check availability of: ").lower()

if(checkFruit in dictFruit):
    print("Available")
else:
    print("Not available")