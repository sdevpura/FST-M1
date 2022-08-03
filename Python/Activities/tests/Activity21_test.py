import pytest


#Sum of two numbers
def testSum():
    num1=1
    num2=2
    sum=num1+num2
    assert sum==3

#Difference of two numbers
def testDiff():
    num1=5
    num2=2
    diff=num1-num2
    assert diff==3

#Product of two numbers
def testMul():
    num1=5
    num2=2
    mul=num1*num2
    assert mul==10

#Quotient of two numbers
def testDiv():
    num1=6
    num2=2
    div=num1/num2
    assert div==10