import pandas
data = {
    "Usernames":["admin", "Charles", "Deku"],
    "Passwords":["password", "Charl13", "AllMight"]
}

ds = pandas.DataFrame(data)
ds.to_csv("Activity17.csv", index=False)
