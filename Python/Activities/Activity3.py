print("Enter Rock, Paper, Scissor")
response_player1 = input("Player 1, enter your choice from Rock, Paper or Scissor: ").lower()
response_player2 = input("Player 2, enter your choice from Rock, Paper or Scissor: ").lower()
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