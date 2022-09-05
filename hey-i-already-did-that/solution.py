from math import *

# accepts a decimal integer n and converts to given base b, 
# padding leading zeroes until len(n) == k
def convert(n, b, k):
    z = list()
    while float(n) / float(b) > 0:
        mod = n % b
        print("mod: " + str(mod))
        z.insert(0, str(mod))
        print("z: " + str(z))
        n = n // b
        print("n: " + str(n))
        print("========")

    while len(z) < k:
        z.insert(0, '0')

    print(''.join(z))

cycle = dict()
def cycling(z):
    if not z in cycle:
        cycle[z] = 1
    elif z in cycle:
        cycle[z] += 1

def solution(n, b):
    print(int(n, b))
    k = len(n)

    l = list();
    for ch in n:
        l.append(ch);

    x = str()
    y = str()
    l.sort()
    y = y.join(l)
    l.reverse()
    x = x.join(l)
    print("x: " + x)
    print("x_10: {0}".format(int(x, b)))
    print("y: " + y)
    print("y_10: {0}".format(int(y, b)))
    z = int(x, b) - int(y, b)
    print("z_10: {0}".format(z))
