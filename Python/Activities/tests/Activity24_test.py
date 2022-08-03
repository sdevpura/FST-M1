import pytest

@pytest.mark.parametrize("earned, spent, expected", [(30, 10, 20), (20, 2, 18)])
def test_cashBalance(wallet, earned, spent, expected):

    #effective amount after earning
    wallet=wallet+earned

    #effective amount after spending
    wallet=wallet-spent

    #Check balance
    assert wallet==expected
