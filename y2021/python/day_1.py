
def get_data():
    with open('y2021/inputs/day_1') as f:
        measurements = f.readlines()
    return tuple(int(i) for i in measurements)


def solution_1():
    measurements = get_data()
    result = 0
    for x in range(1, len(measurements)):
        if measurements[x] > measurements[x-1]:
            result += 1
    return result


if __name__ == '__main__':
    print(solution_1())
