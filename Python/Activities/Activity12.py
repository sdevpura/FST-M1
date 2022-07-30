def sum(num):
    if num:
        return num+sum(num-1)
    else:
        return 0
out = sum(10)
print(out)