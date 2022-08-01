import pandas
from pandas import ExcelFile
ds = pandas.read_excel("Activity19.xlsx", sheet_name="Contact")
print(ds)
#Print the number of rows and columns
print(ds.shape)

#Print the data in the emails column only
print(ds["Email"])

#Sort the data based on FirstName in ascending order and print the data
print(ds.sort_values("FirstName"))