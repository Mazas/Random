import random as rng


def get_array(n):
    array = []
    for i in range(0, n):
        array.append(rng.randint(1, n))
    return array
