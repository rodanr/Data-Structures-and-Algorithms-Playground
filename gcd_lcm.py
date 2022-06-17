def gcd(a, b):
    if(a < b):
        a, b = b, a
    if(a % b == 0):
        return b
    else:
        return gcd(b, a % b)


def lcm(a, b):
    gcd_ans = gcd(a, b)
    return (a*b)//gcd_ans


print(lcm(20, 12))
