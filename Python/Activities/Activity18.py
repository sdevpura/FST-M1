import pandas
ds = pandas.read_csv("Activity17.csv")
print(ds["Usernames"])
print(ds["Usernames"][1], ds["Passwords"][1])
print(ds.sort_values("Usernames"))
print(ds.sort_values("Passwords", ascending=False))