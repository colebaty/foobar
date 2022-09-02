import math

sol = list();

def largestSq(area):
    root = int(math.floor(math.sqrt(area)))
    sq = int(root * root)
    print("sq:" + str(sq))
    sol.append(sq)

    remain = area - sq
    print("remain:" + str(remain))

    if remain > 3:
        largestSq(remain)
    else:
        for i in range(0, remain):
            sol.append(1);


def solution(area):
    largestSq(area)
    
    return sol
