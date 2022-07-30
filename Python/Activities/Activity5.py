sNum = input("Enter a number for generating its multiplication table: ")
iNum = int(sNum)
i = 1
while(i<11):
    s = str(i)
    iMul = iNum*i
    sMul = str(iMul)
    print(sNum+"x"+s+"="+sMul)
    i+=1