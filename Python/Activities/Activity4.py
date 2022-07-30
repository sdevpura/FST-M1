from ast import While


answer = input("Do you want to play this round: Y/N").lower()
print("Enter Rock, Paper, Scissor")
response_player1 = input("Player 1, enter your choice from Rock, Paper or Scissor: ").lower()
response_player2 = input("Player 2, enter your choice from Rock, Paper or Scissor: ").lower()


While(answer=="y")
if(response_player1=="rock"):
    if(response_player2=="scissor"):
        print("player1 is a winner!!")
    elif(response_player2=="paper"):
        print("player2 is a winner!!")         
if(response_player1=="Paper"):
    if(response_player2=="scissor"):
        print("player2 is a winner!!")
    elif(response_player2=="rock"):
        print("player1 is a winner!!")
if(response_player1=="scissor"):
    if(response_player2=="rock"):
        print("player2 is a winner!!")
    elif(response_player2=="paper"):
        print("player1 is a winner!!")
    else:
        print("invalid choice")
answer = input("Do you want to play another round Y/N").lower()
if answer=="n":
    print("End the game")
    raise SystemExit