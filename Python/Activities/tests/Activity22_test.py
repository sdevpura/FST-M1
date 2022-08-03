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
@pytest.mark.activity
def testMul():
    num1=5
    num2=2
    mul=num1*num2
    assert mul==10

#Quotient of two numbers
@pytest.mark.activity
def testDiv():
    num1=6
    num2=2
    div=num1/num2
    assert div==10

#Activity22 Results:
#Apply the marker 'activity' to the last 2 test methods.(Done)

#Run tests based on substring
    ## $ pytest -k Di
    """ @pytest.mark.activity
    def testDiv():
        num1=6
        num2=2
        div=num1/num2
>       assert div==10
E       assert 3.0 == 10

Activity22_test.py:32: AssertionError
============================================================= short test summary info ============================================================= 
FAILED Activity22_test.py::testDiv - assert 3.0 == 10
==================================================== 1 failed, 1 passed, 2 deselected in 0.23s ==================================================== """
#Run tests based using the 'activity' marker.
    """ @pytest.mark.activity
    def testDiv():
        num1=6
        num2=2
        div=num1/num2
>       assert div==10
E       assert 3.0 == 10

Activity22_test.py:32: AssertionError
============================================================= short test summary info ============================================================= 
FAILED Activity22_test.py::testDiv - assert 3.0 == 10
==================================================== 1 failed, 1 passed, 2 deselected in 0.23s ==================================================== """