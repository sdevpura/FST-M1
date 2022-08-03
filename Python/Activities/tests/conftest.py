
import pytest
@pytest.fixture
def myListFixture():
    myList = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    return myList

@pytest.fixture
def wallet():
    amount = 0
    return amount
