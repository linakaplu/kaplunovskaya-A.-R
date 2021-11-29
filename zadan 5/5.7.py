#--coding:utf-8 --
frst = int(input())
len = 0
while frst != 0:
    scnd = int(input())
    if scnd != 0 and frst < scnd:
        len += 1
    frst = scnd
print(len)