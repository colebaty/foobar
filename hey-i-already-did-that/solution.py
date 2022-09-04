from math import *

# accept any number in any base and
# convert to base 10, hex, octal, and binary
def converter(n, b):
    base_highest_power = 0
    base_10_sum = 0;

    while float(n) / float(b) > 0:
        print("n: {0}".format(n))
        print("b: {0}".format(b))
        mod = n % b
        print("mod: {0}".format(mod))
        add = int(mod * pow(b, base_highest_power))
        print("add: {0}".format(add))
        base_10_sum += add
        print("base_10_sum: {0}".format(base_10_sum))
        base_highest_power += 1
        print("base_highest_power: {0}".format(base_highest_power))
        n = n // b
        print("n // b: {0}".format(n))
        print("============")
    
    print("base_10_sum: {0}".format(base_10_sum))


def solution(n, b):
    print("stub")

