import pytest

def test_calculateSum(myListFixture):
    j=0
    for element in myListFixture:        
        j=j+element
    assert j==55