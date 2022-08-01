import pandas
from pandas import ExcelWriter
data = {
    'FirstName':["Satvik", "Avinash", "Lahri"],
	'LastName':["Shah", "Kati", "Rath"],
	'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
	'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}

df = pandas.DataFrame(data)
writer = ExcelWriter("Activity19.xlsx")
df.to_excel(writer, "Contact", index=False)
writer.save()