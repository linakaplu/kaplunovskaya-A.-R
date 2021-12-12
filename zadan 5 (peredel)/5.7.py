#--coding:utf-8 --
frst = int(input())
scnd = int(input())
n = 0
while scnd != 0:
    if scnd > frst:
        n += 1
    frst = scnd
    scnd = int(input())
print(n)